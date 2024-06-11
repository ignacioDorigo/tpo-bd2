package aplicacion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import javax.mail.internet.InternetAddress;
import org.bson.Document;

import negocio.*;

import com.mongodb.client.*;
import redis.clients.jedis.JedisPooled;

public class Controlador {

    public static final Logger logger = Logger.getLogger(Controlador.class.getName());

    private JedisPooled jedisPool;

    private MongoClient mongoClient;
    private MongoDatabase mongoDatabase;
    private MongoCollection<Document> coleccionUsuarios;

    private Usuario usuario;
    private String referenciaMongo;
    public Carrito carrito; // CAMBIAR
    private List<Carrito> estadosCarrito;
    public List<Producto> productos; //CAMBIAR

    private String clienteMongo = "mongodb://localhost:27017";
    private String mongoDB = "TPO_BD2";


    public Controlador() {
        try {
            // conexion a base de datos redis
            this.jedisPool = new JedisPooled("localhost", 6379);

            // conexion a mongoDB
            this.mongoClient = MongoClients.create("mongodb://localhost:27017"); // conexion al puerto
            this.mongoDatabase = mongoClient.getDatabase("TPO_BD2"); // conexion a la base de datos correspondiente
            this.coleccionUsuarios = mongoDatabase.getCollection("usuarios"); // conexion a las distintas colecciones
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
            MongoService mongoService = new MongoService(this.clienteMongo, this.mongoDB, "usuarios");
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
            guardarUsuarioMongo(info, id);

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

    private void guardarUsuarioMongo(InfoRegistroDTO info, String id){
        // SEPARAR DE CONTROLADOR

        try{
            Document doc = usuario.usuarioToDocument();
            coleccionUsuarios.insertOne(doc);
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
            logger.info("Error: " + e.getMessage());
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

    private Document buscarUsuarioMongo(String refMongo){
        // busca el usuario con id correspondiente. si no lo encuentra retorna null

        Document consulta = new Document("_id", refMongo);
        return this.coleccionUsuarios.find(consulta).first();
    }

    private void crearCarrito(String id){
        // el carrito tiene una referencia al usuario
        this.carrito = new Carrito(id);
        guardarCarritoMongo(this.carrito);
    }


    public void guardarCarritoMongo(Carrito carrito){
        // guarda el carrito en la coleccion carritos de la base de datos de mongo
        try{
            Document documentoCarrito = carrito.CarritoToDocument();
            MongoService mongoService = new MongoService(this.clienteMongo, this.mongoDB, "carritos");
            mongoService.guardarCarrito(documentoCarrito);
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
            MongoService mongoService = new MongoService(this.clienteMongo, this.mongoDB, "carritos");
            Carrito carrito = mongoService.buscarCarrito(referenciaMongo);
            mongoService.close();
            return carrito;
        }
        catch(Exception e){
            logger.info("Error: " + e.getMessage());
            return null;
        }
    }


    public void guardarEstadoCarrito(Carrito estadoActualCarrito){
        this.estadosCarrito.add(estadoActualCarrito);
    }


    public Carrito estadoAnteriorCarrito(){
        // devuelve la referencia al estado anterior del carrito, null si no hay estado anterior
        if (estadosCarrito.size() > 1){
            return estadosCarrito.get(estadosCarrito.size()-2);
        }
        else {
            return null;
        }
    }


    public void cargarSesion() {
        // Carga los datos de mongodb en su variable usuario, el carrito y sus estados
        try{
            Document datosUsuario = buscarUsuarioMongo(this.referenciaMongo);
            if (datosUsuario != null){
                this.usuario = new Usuario(datosUsuario);
                this.estadosCarrito = new ArrayList<>();
                this.carrito = buscarCarritoMongo(this.referenciaMongo);
                this.estadosCarrito.add(carrito);
                logger.info("Sesion cargada con exito.");
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


    public boolean crearProducto(InfoCreacionProducto infoProducto){
        // se esperan campos correctos
        try{
            Producto producto = new Producto();
            producto.setNombre(infoProducto.nombre);
            producto.setPrecio(infoProducto.precio);
            producto.setStock(infoProducto.stock);
            Document documentoProducto = producto.productoToDocument();
            MongoService mongoService = new MongoService(this.clienteMongo, this.mongoDB, "productos");
            mongoService.guardarProducto(documentoProducto);
            mongoService.close();
            logger.info("Producto creado con exito.");
            return true;
        }
        catch(Exception e){
            logger.info("Error: " + e.getMessage());
            return false;
        }
    }

    public boolean cargarTodosLosProductos(){
        try{
            MongoService mongoService = new MongoService(this.clienteMongo, this.mongoDB, "productos");
            this.productos = mongoService.todosLosProductos();
            mongoService.close();
            logger.info("Productos cargados con exito.");
            return true;
        }
        catch(Exception e){
            logger.info("Error al cargar los productos: " + e.getMessage());
            return false;
        }
    }


}
