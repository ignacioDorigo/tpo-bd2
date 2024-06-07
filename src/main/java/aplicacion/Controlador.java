package aplicacion;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.logging.Logger;
import javax.mail.internet.InternetAddress;
import org.bson.Document;

import negocio.*;

import com.mongodb.client.*;
import org.bson.Document;
import redis.clients.jedis.JedisPooled;

public class Controlador {

    private JedisPooled jedisPool;
    private MongoClient mongoClient;
    private MongoDatabase mongoDatabase;
    private MongoCollection<Document> coleccionUsuarios;
    private MongoCollection<Document> coleccionProductos;
    private MongoCollection<Document> coleccionCarritos;

    public static final Logger logger = Logger.getLogger(Controlador.class.getName());

    private Usuario usuario;
    private Carrito carrito;

    public Controlador() {
        try {
            // conexion a base de datos redis
            this.jedisPool = new JedisPooled("localhost", 6379);

            // conexion a mongoDB
            this.mongoClient = MongoClients.create("mongodb://localhost:27017"); // conexion al puerto
            this.mongoDatabase = mongoClient.getDatabase("TPO_BD2"); // conexion a la base de datos correspondiente
            this.coleccionUsuarios = mongoDatabase.getCollection("usuarios"); // conexion a las distintas colecciones
            this.coleccionProductos = mongoDatabase.getCollection("productos");
            this.coleccionCarritos = mongoDatabase.getCollection("carritos");
            logger.info("Carga exitosa de las base de datos");
        }
        catch (Exception e) {
            logger.info("Error: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }


    public RegistroUsuarioResultado registrarUsuario(InfoRegistroDTO info){
        // Recibe un contenedor con datos del usuario. Verifica que no existan usuarios con el correo ingresado y crea el usuario en las distintas bases de datos.

        String correo = info.correo;

        if(usuarioExiste(correo)){
            logger.info("Registro fallido. Ya existe un usuario con el correo ingresado.");
            return RegistroUsuarioResultado.USUARIO_EXISTENTE;
        }
        else{
            if (crearUsuario(info)){
                return RegistroUsuarioResultado.USUARIO_CREADO;
            }
            return RegistroUsuarioResultado.ERROR_INESPERADO;
        }
    }

    public boolean crearUsuario(InfoRegistroDTO info){
        // Recibe un contenedor con datos del usuario. Crea el usuario en la base de datos de redis, mongo y su carrito.
        // Devuelve si la operacion fue exitosa o no.
        try{
            // Carga del usuario en memoria
            usuario = new Usuario(info.nombre, info.correo);
            usuario.setDocumento(info.documento);
            usuario.setDireccion(info.direccion);

            String id = usuario.getId();
            // Mongo--> Creacion del usuario en coleccion usuarios y su carrito en coleccion carritos
            usuarioMongo(info, id);
            this.carrito = new Carrito(id);

            // Redis --> Creacion de los datos de acceso
            usuarioRedis(id, info);
            return true;
        }
        catch(Exception e){
            logger.info("Error: " + e.getMessage());
            return false;
        }
    }


    private void usuarioMongo(InfoRegistroDTO info, String id){
        try{
            Document doc = usuario.toDocument();
            coleccionUsuarios.insertOne(doc);
            logger.info("Mongo>Usuario registrado con exito.");
        }
        catch (Exception e) {
            logger.info("Mongo>Error al crear usuario: " + e.getMessage());
            throw new RuntimeException(e);
        }


    }

    private void usuarioRedis(String usuarioMongoID, InfoRegistroDTO info){
        Map<String, String> hash = new HashMap<>();
        hash.put("contrasena", info.contrasena);
        hash.put("mongoRef", usuarioMongoID);
        jedisPool.hset("correo:" + info.correo, hash);
        logger.info("Usuario creado en redis con exito.");
    }


    public boolean usuarioExiste(String correo){
        return jedisPool.exists("correo:" + correo);
    }


    public InfoInicioSesionDTO iniciarSesion(String correo, String contrasena){
        InfoInicioSesionDTO info = new InfoInicioSesionDTO();

        // valida que el formato de correo sea correcto
//        if (!validarFormatoCorreo(correo)) {
//            info.setMensaje("Correo electrónico inválido.");
//            logger.info(info.getMensaje());
//            return info;
//        }
//
//        // busca el usuario usando la direccion de correo ingresada
//        Optional<List<String>> infoUsuarioOpt = buscarCuenta(correo);
//        if (infoUsuarioOpt.isEmpty()) {
//            info.setMensaje("No existe una cuenta con esta dirección de correo.");
//            logger.info(info.getMensaje());
//            return info;
//        }
//
//        // si existe un usuario con esa direccion de correo valida la contrasena ingresada
//        List<String> infoUsuario = infoUsuarioOpt.get();
//        if (!compararContrasenas(contrasena, infoUsuario.getFirst())) {
//            info.setMensaje("Contraseña ingresada incorrecta.");
//            logger.info(info.getMensaje());
//            return info;
//        }
//
//        // si la contrasena es la correcta guarda la referencia al usuario y marca la operacion como exitosa.
//        this.referenciaUsuario = infoUsuario.get(1);
//        info.setMensaje("La contraseña ingresada es la correcta.");
//        info.setExito(true);
//
//        logger.info("Usuario autenticado correctamente: " + referenciaUsuario);
        return info;
    }

    public boolean validarFormatoCorreo(String correo){
        try {
            InternetAddress direccionCorreo = new InternetAddress(correo);
            direccionCorreo.validate();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    private Optional<List<String>> buscarCuenta(String correo) {



        return Optional.empty();
    }

    private boolean compararContrasenas(String contrasenaIngresada, String contrasenaReal){
        // Implementar una lógica de comparación segura, preferiblemente usando una librería de cifrado
        return contrasenaReal.equals(contrasenaIngresada);
    }

    public void cargarSesion() {
        // recibe objectid del usuario y lo busca en mongoDB
        logger.info("TEMPORAL: SESIÓN CARGADA...");
    }
}
