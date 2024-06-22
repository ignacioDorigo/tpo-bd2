package aplicacion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import javax.mail.internet.InternetAddress;
import interfaces.gui.VentanaError;
import org.bson.Document;
import org.bson.types.ObjectId;
import redis.clients.jedis.JedisPooled;

public class Controlador {
    public static final Logger logger = Logger.getLogger(Controlador.class.getName());
    private final JedisPooled jedisPool;

    private String referenciaMongo;
    private Document usuario;
    private Document carrito;
    private List<Document> estadosCarrito;

    public Controlador() {
        try {
            // el guardado de los estados del carrito es local y no persiste en ninguna base de datos
            this.estadosCarrito = new ArrayList<>();

            // conexion a base de datos redis
            this.jedisPool = new JedisPooled("localhost", 6379);

            logger.info("Carga exitosa del controlador\n");
        }
        catch (Exception e) {
            logger.info("Error: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public Document getUsuario() {
        return usuario;
    }

    public ResultadoRegistroUsuario registrarUsuario(Document infoUsuario){
        // Recibe un contenedor con datos del usuario. Verifica que no existan usuarios con el correo ingresado y crea el usuario en las distintas bases de datos.
        try{
            if(cuentaExiste(infoUsuario.getString("correo"))){
                logger.info("Registro fallido. Ya existe un usuario con el correo ingresado.\n");
                return ResultadoRegistroUsuario.USUARIO_EXISTENTE;
            }
            if (crearUsuario(infoUsuario)){
                return ResultadoRegistroUsuario.USUARIO_CREADO;
            }
        }
        catch(Exception e){
            logger.info("Error: " + e.getMessage());
        }
        return ResultadoRegistroUsuario.ERROR_INESPERADO;
    }

    public boolean crearUsuario(Document infoUsuario){
        // Recibe un contenedor con datos del usuario. Crea el usuario en la base de datos de redis, mongo y su carrito.
        // Devuelve si la operacion fue exitosa o no.
        try{
            String idUsuario = infoUsuario.getString("_id");
            // Redis --> Creacion de los datos de acceso
            guardarUsuarioRedis(idUsuario, infoUsuario);

            // Carga del usuario en memoria
            infoUsuario.remove("contraseña");
            this.usuario = infoUsuario;

            this.carrito = new Document("_id", new ObjectId())
                    .append("referenciaUsuario", idUsuario)
                    .append("items", new ArrayList<Document>());

            crearCarritoMongo(this.carrito);

            // Mongo--> Creacion del usuario en coleccion usuarios y su carrito en coleccion carritos
            guardarUsuarioMongo(this.usuario);

            return true;
        }
        catch(Exception e){
            logger.info("Error: " + e.getMessage());
            return false;
        }
    }

    private void guardarUsuarioMongo(Document usuario){
        // SEPARAR DE CONTROLADOR

        try{
            MongoService mongoService = new MongoService("usuarios");
            mongoService.guardarUsuario(usuario);
            mongoService.close();

            logger.info("Mongo-->Usuario registrado con exito.\n");
        }
        catch (Exception e) {
            logger.info("Mongo-->Error al crear usuario: " + e.getMessage() + "\n");
            throw new RuntimeException(e);
        }
    }


    private void guardarUsuarioRedis(String usuarioMongoID, Document infoUsuario){
        try{
            Map<String, String> hash = new HashMap<>();
            hash.put("contraseña", infoUsuario.getString("contraseña"));
            hash.put("mongoRef", usuarioMongoID);
            jedisPool.hset("correo:" + infoUsuario.getString("correo"), hash);
            logger.info("Usuario creado en redis con exito." + "\n");
        }
        catch(Exception e){
            logger.info("Error en la creacion del usuario en redis: " + e.getMessage() + "\n");
        }
    }

    public Object[][] datosTablaUsuarios(){
        try{
            MongoService mongoService = new MongoService("usuarios");
            List<Document> usuarios = mongoService.todosLosUsuarios();
            mongoService.close();

            Object[][] data = new Object[usuarios.size()][7];

            for (int i = 0; i < usuarios.size(); i++) {
                Document usuario = usuarios.get(i);
                data[i][0] = usuario.getString("_id");
                data[i][1] = usuario.getString("correo");
                data[i][2] = usuario.getString("nombre");
                data[i][3] = usuario.getString("documento");
                data[i][4] = usuario.getString("direccion");
                data[i][5] = usuario.getString("categoria");
                data[i][6] = usuario.getString("minutos");
            }
            return data;
        }
        catch(Exception e){
            logger.info("Error: " + e.getMessage());
            return null;
        }
    }


    public boolean validarDatosSesion(String correo, String contrasena){
        // valida que el formato de correo sea correcto antes de hacer una consulta a la BD.
        if (!validarFormatoCorreo(correo)) {
            return false;
        }
        // busca el usuario y compara las contrasenas
        return compararContrasenas(correo, contrasena);
    }


    public boolean validarFormatoCorreo(String correo){
        try {
            InternetAddress direccionCorreo = new InternetAddress(correo);
            direccionCorreo.validate();
        } catch (Exception e) {
            logger.info("Correo electrónico inválido.\n");
            return false;
        }
        return true;
    }


    private boolean compararContrasenas(String correo, String contrasena){
        // Busca y compara la contrasena de una cuenta con un correo en particular con la contrasena ingresada.
        // Prioriza hacer UNA sola consulta.

        // obtiene todos los valores asociados al correo. si no existe la clave devuelve un map vacio.
        try{
            Map<String, String> valores_campo = jedisPool.hgetAll("correo:" + correo);
            // si existe una cuenta con el correo ingresado, compara las contrasenas
            if (!valores_campo.isEmpty()){
                if (contrasena.equals(valores_campo.get("contrasena"))){
                    logger.info("La contraseña ingresada es la correcta.\n");
                    // GUARDA REFERENCIA AL USUARIO EN MONGODB
                    this.referenciaMongo = valores_campo.get("mongoRef");
                    return true;
                }
                else {
                    logger.info("CONTRASENA INCORRECTA.\n");
                    return false;
                }
            }
            logger.info("No existe una cuenta con esta dirección de correo.\n");
        }
        catch (Exception e){
            logger.info("Error al conectar con redis: " + e.getMessage() + "\n");
        }
        return false;
    }


    public boolean cuentaExiste(String correo){
        // buscar usuario con su direccion de correo en la base de redis
        return jedisPool.exists("correo:" + correo);
    }

    private Document buscarUsuarioMongo(String refMongo){
        // busca el usuario con id correspondiente. Si no lo encuentra devuelve null

        try{
            MongoService mongoService = new MongoService("usuarios");
            Document usuario = mongoService.buscarUsuario(refMongo);
            mongoService.close();
            return usuario;
        }
        catch (Exception e){
            logger.info("Error: " + e.getMessage() + "\n");
            return null;
        }
    }


    public void crearCarritoMongo(Document carrito){
        // guarda el carrito en la coleccion carritos de la base de datos de mongo
        try{
            MongoService mongoService = new MongoService("carritos");
            mongoService.crearCarrito(carrito);
            mongoService.close();
            logger.info("Carrito guardado.\n");
        }
        catch(Exception e){
            logger.info("Error: " + e.getMessage() + "\n");
            throw new RuntimeException();
        }
    }

    private Document buscarCarritoMongo(String referenciaMongo){
        try{
            MongoService mongoService = new MongoService("carritos");
            Document carrito = mongoService.buscarCarrito(referenciaMongo);
            mongoService.close();
            return carrito;
        }
        catch(Exception e){
            logger.info("Error: " + e.getMessage());
            return null;
        }
    }

    public void agregarProductoCarrito(String idProducto, int cantidad){
        // Agrega producto al carrito. Verifica que exista el producto y que no este en el carrito. Si esta en el carrito se suma la cantidad ingresada.
        Document producto = buscarProductoMongo(idProducto);
        // si el producto no existe no se hace nada
        if (producto == null){
            return;
        }
        // si el producto esta en el carrito agrego la cantidad y actualizo el carrito en la base de datos
        if (productoEnCarrito(idProducto)){
            sumarCantidadProducto(idProducto, cantidad);
            this.carrito = buscarCarritoMongo(this.referenciaMongo);
        }
        else{

        }



        // si esta en el carrito le sumo la cantidad ingresada

        // si no esta en el carrito, creo el nuevo item

    }

    public void sumarCantidadProducto(String idProducto, int cantidad){
        try{
            MongoService mongoService = new MongoService("carritos");

            mongoService.close();
        }
        catch(Exception e){
            logger.info("Error: " + e.getMessage() + "\n");
        }
    }

    public void agregarMismoProductoCarrito(String idProducto, int cantidad){
        // A la cantidad de un producto ya existente en el carrito, le suma la cantidad pasada como parametro.
    }

    public void modificarCantidadProducto(String idProducto, int cantidad){
        // A un producto existente en el carrito le modifica la cantidad antigua por la nueva.
    }

    public void eliminarProductoCarrito(String idProducto){
        // A un producto existente en el carrito,
    }




    public boolean productoEnCarrito(String idProducto){



        return true;
    }

    public void guardarEstadoCarrito(Document estadoActualCarrito){
        this.estadosCarrito.add(estadoActualCarrito);
    }


    public boolean estadoAnteriorCarrito(){
        //establece el carrito actual con el valor del carrito anterior guardado en estadosCarrito.
        //elimina el ultimo estado carrito que quedo obsoleto.
        if (estadosCarrito.size() > 1){
            this.carrito = estadosCarrito.get(estadosCarrito.size()-2);
            this.estadosCarrito.remove(estadosCarrito.size()-1);
            return true;
        }
        return false;
    }


    public void vaciarCarrito(){
        MongoService mongoService = new MongoService("carritos");
        mongoService.vaciarCarrito(this.carrito);
        this.carrito = mongoService.buscarCarrito(this.referenciaMongo);
        mongoService.close();
    }

    public boolean crearProducto(Document producto){
        // se esperan campos correctos
        try{
            MongoService mongoService = new MongoService("productos");
            mongoService.guardarProducto(producto);
            mongoService.close();
            logger.info("Producto creado con exito.\n");
            return true;
        }
        catch(Exception e){
            logger.info("Error: " + e.getMessage());
            return false;
        }
    }

    public Document buscarProductoMongo(String idProducto){
        try{
            MongoService mongoService = new MongoService("productos");
            Document producto = mongoService.buscarProducto(idProducto);
            mongoService.close();
            return producto;
        }
        catch(Exception e){
            logger.info("Error: " + e.getMessage());
            return null;
        }
    }


    public Object[][] datosTablaProductos(){
        // Crea y devuelve una matriz con los datos de todos los productos almacenados en mongoDB.
        try{
            MongoService mongoService = new MongoService("productos");
            List<Document> productos = mongoService.todosLosProductos();
            mongoService.close();

            Object[][] data = new Object[productos.size()][4];

            for (int i = 0; i < productos.size(); i++) {
                Document producto = productos.get(i);
                data[i][0] = producto.getString("_id");
                data[i][1] = producto.getString("nombre");
                data[i][2] = producto.getString("precio");
                data[i][3] = producto.getString("stock");
            }
            logger.info("Productos cargados con exito.\n");
            return data;
        }
        catch(Exception e){
            logger.info("Error: " + e.getMessage() + "\n");
            return null;
        }
    }


    public boolean modificarPrecioProductoMongo(String idProducto, double precio){
        try{
            MongoService mongoService = new MongoService("productos");
            boolean resultado = mongoService.modificarPrecioProducto(idProducto, precio);
            mongoService.close();
            return resultado;
        }
        catch(Exception e){
            logger.info("Error: " + e.getMessage());
            return false;
        }
    }


    public boolean cargarSesion() {
        // Carga los datos de mongodb en su variable usuario, el carrito y sus estados
        try{
            this.usuario = buscarUsuarioMongo(this.referenciaMongo);

            if (this.usuario != null){
                this.estadosCarrito = new ArrayList<>();
                this.carrito = buscarCarritoMongo(this.referenciaMongo);


                this.estadosCarrito.add(carrito);
                logger.info("Sesion cargada con exito.\n");
                return true;
            }
            else {
                logger.info("Usuario no encontrado. \n");
                return false;
            }
        }
        catch(Exception e){
            logger.info("Error al cargar la sesion: " + e.getMessage() + "\n");
            return false;
        }
    }

    public void cerrarSesion(){
        // guarda los estados que deben persistir en sus bases de datos correspondientes y borra todas las variables locales
        this.usuario = null;
        this.referenciaMongo = null;
        this.carrito = null;
        this.estadosCarrito = null;
        logger.info("Sesion cerrada \n");
    }

    public boolean existeProductoEnMatriz(Object[][]data, String idProducto){
        for (Object[] datum : data) {
            if (datum[0].equals(idProducto)) {
                logger.info("Producto encontrado en data: " + idProducto + "\n");
                return true;
            }
        }
        logger.info("Producto no encontrado en data: " + idProducto + "\n");
        return false;
    }

    public void ventanaError(){
        // muestre mensaje de error en la pantalla
        VentanaError ventana = new VentanaError();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }

    public boolean confirmarCarrito(){
        try {
            // falta guarda pedido
            return true;
        }
        catch (Exception e) {
            logger.info("Error: " + e.getMessage()+ "\n");
            return false;
        }
    }
}