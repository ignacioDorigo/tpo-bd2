package interfaces.cli;

import aplicacion.*;
import org.bson.Document;
import org.bson.types.ObjectId;


public class AppConsola {


    public static void main(String[] args) {
        Controlador controlador = new Controlador();

        Document usuario = new Document("_id", new ObjectId().toHexString())
                .append("nombre", "Federico")
                .append("correo", "fedeabcastillo@gmail.com")
                .append("contraseña", "fede")
                .append("documento", "43661425")
                .append("direccion", "calle 13");

        controlador.crearUsuario(usuario);

//        crearProducto("tv LG 50 pulgadas", 600000, 5, controlador);
//        crearProducto("tv SAMSUNG 60 pulgadas", 850000, 22, controlador);
//        crearProducto("tv LG 70 pulgadas", 1000000, 11, controlador);
//        crearProducto("tv SONY 80 pulgadas", 2000000, 9, controlador);




    }

    private static void crearProducto(String nombre, double precio, int stock, Controlador controlador){

        Document producto = new Document("_id", new ObjectId().toHexString())
                .append("nombre", nombre)
                .append("precio", precio)
                .append("stock", stock);


        controlador.crearProducto(producto);
    }


}
