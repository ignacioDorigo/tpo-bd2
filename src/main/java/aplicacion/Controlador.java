package aplicacion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import javax.mail.internet.InternetAddress;

import negocio.*;
import redis.clients.jedis.JedisPooled;

public class Controlador {

    public static final Logger logger = Logger.getLogger(Controlador.class.getName());
    private final JedisPooled jedisPool;

    private String referenciaMongo;
    private Usuario usuario;
    private Carrito carrito;
    private List<Carrito> estadosCarrito;


    public Controlador() {
        try {
            // conexion a base de datos redis
            this.jedisPool = new JedisPooled("localhost", 6379);

            logger.info("Carga exitosa de las base de datos");
        }
        catch (Exception e) {
            logger.info("Error: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }


    public Usuario getUsuario() {
        return usuario;
    }

    public Object[][] datosTablaUsuarios(){
        try{
            MongoService mongoService = new MongoService("usuarios");
            List<Usuario> usuarios = mongoService.todosLosUsuarios();
            mongoService.close();

            Object[][] data = new Object[usuarios.size()][7];

            for (int i = 0; i < usuarios.size(); i++) {
                Usuario usuario = usuarios.get(i);
                data[i][0] = usuario.getId();
                data[i][1] = usuario.getCorreo();
                data[i][2] = usuario.getNombre();
                data[i][3] = usuario.getDocumento();
                data[i][4] = usuario.getDireccion();
                data[i][5] = usuario.getCategoria();
                data[i][6] = usuario.getMinutos();
            }
            return data;
        }
        catch(Exception e){
            logger.info("Error: " + e.getMessage());
            return null;
        }
    }


    public ResultadoRegistroUsuario registrarUsuario(InfoRegistroDTO info){
        // Recibe un contenedor con datos del usuario. Verifica que no existan usuarios con el correo ingresado y
        // crea el usuario en las distintas bases de datos.
        try{
            if(cuentaExiste(info.correo)){
                logger.info("Registro fallido. Ya existe un usuario con el correo ingresado.");
                return ResultadoRegistroUsuario.USUARIO_EXISTENTE;
            }
            if (crearUsuario(info)){
                return ResultadoRegistroUsuario.USUARIO_CREADO;
            }
        }
        catch(Exception e){
            logger.info("Error: " + e.getMessage());
        }
        return ResultadoRegistroUsuario.ERROR_INESPERADO;
    }

    public boolean crearUsuario(InfoRegistroDTO info){
        // Recibe un contenedor con datos del usuario. Crea el usuario en la base de datos de redis, mongo y su carrito.
        // Devuelve si la operacion fue exitosa o no.
        try{
            // Carga del usuario en memoria
            this.usuario = new Usuario(info.nombre, info.correo);
            this.usuario.setDocumento(info.documento);
            this.usuario.setDireccion(info.direccion);
            String id = usuario.getId();
            // Mongo--> Creacion del usuario en coleccion usuarios y su carrito en coleccion carritos
            guardarUsuarioMongo(this.usuario);

            // Redis --> Creacion de los datos de acceso
            guardarUsuarioRedis(id, info);
            crearCarrito(id);
            return true;
        }
        catch(Exception e){
            logger.info("Error: " + e.getMessage());
            return false;
        }
    }

    private void guardarUsuarioMongo(Usuario usuario){
        // SEPARAR DE CONTROLADOR

        try{
            MongoService mongoService = new MongoService("usuarios");
            mongoService.guardarUsuario(usuario);
            mongoService.close();

            logger.info("Mongo-->Usuario registrado con exito.");
        }
        catch (Exception e) {
            logger.info("Mongo-->Error al crear usuario: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }


    private void guardarUsuarioRedis(String usuarioMongoID, InfoRegistroDTO info){
        try{
            Map<String, String> hash = new HashMap<>();
            hash.put("contrasena", info.contrasena);
            hash.put("mongoRef", usuarioMongoID);
            jedisPool.hset("correo:" + info.correo, hash);
            logger.info("Usuario creado en redis con exito.");
        }
        catch(Exception e){
            logger.info("Error en la creacion del usuario en redis: " + e.getMessage());
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
            logger.info("Correo electrónico inválido.");
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
                    logger.info("La contraseña ingresada es la correcta.");
                    // GUARDA REFERENCIA AL USUARIO EN MONGODB
                    this.referenciaMongo = valores_campo.get("mongoRef");
                    return true;
                }
                else {
                    logger.info("CONTRASENA INCORRECTA.");
                    return false;
                }
            }
            logger.info("No existe una cuenta con esta dirección de correo.");
        }
        catch (Exception e){
            logger.info("Error al conectar con redis: " + e.getMessage());
        }
        return false;
    }


    public boolean cuentaExiste(String correo){
        // buscar usuario con su direccion de correo en la base de redis
        return jedisPool.exists("correo:" + correo);
    }

    private Usuario buscarUsuarioMongo(String refMongo){
        // busca el usuario con id correspondiente. Si no lo encuentra devuelve null

        try{
            MongoService mongoService = new MongoService("usuarios");
            Usuario usuario = mongoService.buscarUsuario(refMongo);
            System.out.println(refMongo);
            mongoService.close();
            return usuario;
        }
        catch (Exception e){
            logger.info("Error: " + e.getMessage());
            return null;
        }
    }


    private void crearCarrito(String id){
        // el carrito tiene una referencia al usuario
        this.carrito = new Carrito(id);
        guardarCarritoMongo(this.carrito);
    }


    public void guardarCarritoMongo(Carrito carrito){
        // guarda el carrito en la coleccion carritos de la base de datos de mongo
        try{
            MongoService mongoService = new MongoService("carritos");
            mongoService.guardarCarrito(carrito);
            mongoService.close();
            logger.info("Carrito guardado.");
        }
        catch(Exception e){
            logger.info("Error: " + e.getMessage());
            throw new RuntimeException();
        }
    }

    private Carrito buscarCarritoMongo(String referenciaMongo){
        try{
            MongoService mongoService = new MongoService("carritos");
            Carrito carrito = mongoService.buscarCarrito(referenciaMongo);
            mongoService.close();
            return carrito;
        }
        catch(Exception e){
            logger.info("Error: " + e.getMessage());
            return null;
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


    public void agregarProductoCarrito(String idProducto, int cantidad){
        // verifica que no este el producto en el carrito.
        // si esta le suma la cantidad pasada. si no lo esta lo crea y agrega al carrito

        if(productoEnCarrito(idProducto)){

        }



        Item item  = new Item();
//        item.setProducto(producto);
        item.setCantidad(cantidad);
        this.carrito.agregarItem(item);
        guardarEstadoCarrito(this.carrito);
        guardarCarritoMongo(this.carrito);
    }

    public boolean productoEnCarrito(String idProducto){
        return true;
    }

    public void guardarEstadoCarrito(Carrito estadoActualCarrito){
        this.estadosCarrito.add(estadoActualCarrito);
    }


    public void estadoAnteriorCarrito(){
        //establece el carrito actual con el valor del carrito anterior guardado en estadosCarrito.
        //elimina el ultimo estado carrito que quedo obsoleto.
        if (estadosCarrito.size() > 1){
            this.carrito = estadosCarrito.get(estadosCarrito.size()-2);
            this.estadosCarrito.remove(estadosCarrito.size()-1);
        }
    }

    public Object[][] datosTablaCarrito(){
        try{

            List<Item> items = this.carrito.getItems();
            Object[][] data = new Object[items.size()][5];

            for (int i = 0; i < items.size(); i++) {
                Item item = items.get(i);
                data[i][0] = i; // numero de fila
                data[i][1] = item.getProducto().getNombre(); // nombre producto
                data[i][2] = item.getCantidad(); // cantidad
                data[i][3] = item.getProducto().getPrecio() * item.getCantidad(); // precio total
            }
            logger.info("Productos cargados con exito.");
            return data;
        }
        catch(Exception e){
            logger.info("Error: " + e.getMessage());
            return null;
        }
    }


    public boolean crearProducto(InfoCreacionProducto infoProducto){
        // se esperan campos correctos
        try{
            Producto producto = new Producto();
            producto.setNombre(infoProducto.nombre);
            producto.setPrecio(infoProducto.precio);
            producto.setStock(infoProducto.stock);
            MongoService mongoService = new MongoService("productos");
            mongoService.guardarProducto(producto);
            mongoService.close();
            logger.info("Producto creado con exito.");
            return true;
        }
        catch(Exception e){
            logger.info("Error: " + e.getMessage());
            return false;
        }
    }

    public Object[][] datosTablaProductos(){
        // Crea y devuelve una matriz con los datos de todos los productos almacenados en mongoDB.
        try{
            MongoService mongoService = new MongoService("productos");
            List<Producto> productos = mongoService.todosLosProductos();
            mongoService.close();

            Object[][] data = new Object[productos.size()][4];

            for (int i = 0; i < productos.size(); i++) {
                Producto producto = productos.get(i);
                data[i][0] = producto.getId();
                data[i][1] = producto.getNombre();
                data[i][2] = producto.getPrecio();
                data[i][3] = producto.getStock();
            }
            logger.info("Productos cargados con exito.");
            return data;
        }
        catch(Exception e){
            logger.info("Error: " + e.getMessage());
            return null;
        }
    }

    public void cargarSesion() {
        // Carga los datos de mongodb en su variable usuario, el carrito y sus estados
        try{
            this.usuario = buscarUsuarioMongo(this.referenciaMongo);
            if (this.usuario != null){
                this.estadosCarrito = new ArrayList<>();
                this.carrito = buscarCarritoMongo(this.referenciaMongo);
                this.estadosCarrito.add(carrito);
                logger.info("Sesion cargada con exito.");
            }
            else {
                logger.info("Usuario no encontrado.");
            }
        }
        catch(Exception e){
            logger.info("Error al cargar la sesion: " + e.getMessage());
        }
    }

    public void cerrarSesion(){
        // guarda los estados que deben persistir en sus bases de datos correspondientes y borra todas las variables locales
        guardarCarritoMongo(this.carrito);
        this.usuario = null;
        this.referenciaMongo = null;
        this.carrito = null;
        this.estadosCarrito = null;
        logger.info("Sesion cerrada");
    }


    public boolean existeProductoEnMatriz(Object[][]data, String idProducto){
        for (int i = 0; i < data.length; i++) {
            if (data[i][0].equals(idProducto)) {
                logger.info("Producto encontrado en data: " + idProducto);
                return true;
            }
        }
        logger.info("Producto no encontrado en data: " + idProducto);
        return false;
    }
}
