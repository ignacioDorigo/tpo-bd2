package interfaces.cli;

import aplicacion.*;
import negocio.*;

public class AppConsola {


    public static void main(String[] args) {
        Controlador controlador = new Controlador();

        // crearUsuarios(controlador);

//        crearProducto("tv LG 50 pulgadas", 600000, 5, controlador);
//        crearProducto("tv SAMSUNG 60 pulgadas", 850000, 22, controlador);
//        crearProducto("tv LG 70 pulgadas", 1000000, 11, controlador);
//        crearProducto("tv SONY 80 pulgadas", 2000000, 9, controlador);




    }

    private static void crearProducto(String nombre, double precio, int stock, Controlador controlador){
        InfoCreacionProducto info = new InfoCreacionProducto();
        info.nombre = nombre;
        info.precio = precio;
        info.stock = stock;
        controlador.crearProducto(info);
    }

    private static void crearUsuarios(Controlador controlador){
        InfoRegistroDTO info = new InfoRegistroDTO();

        info.nombre = "Carlos Tevez";
        info.correo = "carlostevez@gmail.com";
        info.contrasena = "carlos";
        info.documento = "11111111";
        info.direccion = "CABA";

        controlador.crearUsuario(info);

        info.nombre = "Jorge Mendez";
        info.correo = "jorge@gmail.com";
        info.contrasena = "jorge";
        info.documento = "2222222";
        info.direccion = "San Luis";

        controlador.crearUsuario(info);

        info.nombre = "Mariana Perez";
        info.correo = "mariana@gmail.com";
        info.contrasena = "mariana";
        info.documento = "33333333";
        info.direccion = "Rosario";

        controlador.crearUsuario(info);

        info.nombre = "Lucas Gomez";
        info.correo = "lucas@gmail.com";
        info.contrasena = "lucas";
        info.documento = "44444444";
        info.direccion = "Cordoba";

        controlador.crearUsuario(info);

        info.nombre = "Sofia Rodriguez";
        info.correo = "sofia@gmail.com";
        info.contrasena = "sofia";
        info.documento = "55555555";
        info.direccion = "Mendoza";

        controlador.crearUsuario(info);

        info.nombre = "Juan Martinez";
        info.correo = "juan@gmail.com";
        info.contrasena = "juan";
        info.documento = "66666666";
        info.direccion = "La Plata";

        controlador.crearUsuario(info);

        info.nombre = "Ana Lopez";
        info.correo = "ana@gmail.com";
        info.contrasena = "ana";
        info.documento = "77777777";
        info.direccion = "Tucuman";

        controlador.crearUsuario(info);

        info.nombre = "Pedro Fernandez";
        info.correo = "pedro@gmail.com";
        info.contrasena = "pedro";
        info.documento = "88888888";
        info.direccion = "Neuquen";

        controlador.crearUsuario(info);

        info.nombre = "Laura Sanchez";
        info.correo = "laura@gmail.com";
        info.contrasena = "laura";
        info.documento = "99999999";
        info.direccion = "Salta";

        controlador.crearUsuario(info);

        info.nombre = "Diego Ramirez";
        info.correo = "diego@gmail.com";
        info.contrasena = "diego";
        info.documento = "10101010";
        info.direccion = "Mar del Plata";

        controlador.crearUsuario(info);

        info.nombre = "Carla Gutierrez";
        info.correo = "carla@gmail.com";
        info.contrasena = "carla";
        info.documento = "11111112";
        info.direccion = "Bariloche";

        controlador.crearUsuario(info);

        info.nombre = "Martin Herrera";
        info.correo = "martin@gmail.com";
        info.contrasena = "martin";
        info.documento = "12121212";
        info.direccion = "Formosa";

        controlador.crearUsuario(info);

        info.nombre = "Valeria Diaz";
        info.correo = "valeria@gmail.com";
        info.contrasena = "valeria";
        info.documento = "13131313";
        info.direccion = "Resistencia";

        controlador.crearUsuario(info);

        info.nombre = "Ignacio Torres";
        info.correo = "ignacio@gmail.com";
        info.contrasena = "ignacio";
        info.documento = "14141414";
        info.direccion = "Corrientes";

        controlador.crearUsuario(info);

        info.nombre = "Lucia Morales";
        info.correo = "lucia@gmail.com";
        info.contrasena = "lucia";
        info.documento = "15151515";
        info.direccion = "Santa Fe";

        controlador.crearUsuario(info);

        info.nombre = "Sebastian Castro";
        info.correo = "sebastian@gmail.com";
        info.contrasena = "sebastian";
        info.documento = "16161616";
        info.direccion = "Jujuy";

        controlador.crearUsuario(info);

        info.nombre = "Julieta Navarro";
        info.correo = "julieta@gmail.com";
        info.contrasena = "julieta";
        info.documento = "17171717";
        info.direccion = "Catamarca";

        controlador.crearUsuario(info);

        info.nombre = "Matias Alvarez";
        info.correo = "matias@gmail.com";
        info.contrasena = "matias";
        info.documento = "18181818";
        info.direccion = "San Juan";

        controlador.crearUsuario(info);

        info.nombre = "Gabriela Ramos";
        info.correo = "gabriela@gmail.com";
        info.contrasena = "gabriela";
        info.documento = "19191919";
        info.direccion = "Rio Gallegos";

        controlador.crearUsuario(info);

        info.nombre = "Fernando Ortiz";
        info.correo = "fernando@gmail.com";
        info.contrasena = "fernando";
        info.documento = "20202020";
        info.direccion = "Viedma";

        controlador.crearUsuario(info);





    }


}
