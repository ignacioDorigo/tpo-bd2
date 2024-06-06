package aplicacion;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;
import javax.mail.internet.InternetAddress;

import redis.clients.jedis.JedisPooled;

public class Controlador {

    private String referenciaUsuario;
    private JedisPooled jedis;

    private static final Logger logger = Logger.getLogger(Controlador.class.getName());

    public Controlador() {
        this.jedis = new JedisPooled("localhost", 6379);

    }

    public boolean crearUsuario(InfoRegistroDTO info){



        return true;

    }

    private boolean validarCamposRegistro(InfoRegistroDTO info){
        return true;

    }



    public InfoInicioSesionDTO iniciarSesion(String correo, String contrasena){
        InfoInicioSesionDTO info = new InfoInicioSesionDTO();

        // valida que el formato de correo sea correcto
        if (!validarFormatoCorreo(correo)) {
            info.setMensaje("Correo electrónico inválido.");
            logger.info(info.getMensaje());
            return info;
        }

        // busca el usuario usando la direccion de correo ingresada
        Optional<List<String>> infoUsuarioOpt = buscarCuenta(correo);
        if (infoUsuarioOpt.isEmpty()) {
            info.setMensaje("No existe una cuenta con esta dirección de correo.");
            logger.info(info.getMensaje());
            return info;
        }

        // si existe un usuario con esa direccion de correo valida la contrasena ingresada
        List<String> infoUsuario = infoUsuarioOpt.get();
        if (!compararContrasenas(contrasena, infoUsuario.getFirst())) {
            info.setMensaje("Contraseña ingresada incorrecta.");
            logger.info(info.getMensaje());
            return info;
        }

        // si la contrasena es la correcta guarda la referencia al usuario y marca la operacion como exitosa.
        this.referenciaUsuario = infoUsuario.get(1);
        info.setMensaje("La contraseña ingresada es la correcta.");
        info.setExito(true);

        logger.info("Usuario autenticado correctamente: " + referenciaUsuario);
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
