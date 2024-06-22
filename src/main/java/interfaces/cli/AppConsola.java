package interfaces.cli;

import aplicacion.*;
import org.bson.Document;
import org.bson.types.ObjectId;


public class AppConsola {


    public static void main(String[] args) {
        Controlador controlador = new Controlador();
//        crearProducto("tv LG 50 pulgadas", 600000, 5, controlador);
//        crearProducto("tv SAMSUNG 60 pulgadas", 850000, 22, controlador);
//        crearProducto("tv LG 70 pulgadas", 1000000, 11, controlador);
//        crearProducto("tv SONY 80 pulgadas", 2000000, 9, controlador);


        Document usuario = new Document("_id", new ObjectId())
                .append("nombre", "Federico")
                .append("correo", "fede@gmail.com")
                .append("contrasena", "fede")
                .append("documento", "11111111")
                .append("direccion", "calle 13");

        controlador.crearUsuario(usuario);
        controlador.agregarProductoCarrito(new ObjectId("667740a6e9e6dc0e5567e4db"), 2);
        controlador.agregarProductoCarrito(new ObjectId("667740a6e9e6dc0e5567e4db"), 2);
        controlador.agregarProductoCarrito(new ObjectId("667740a6e9e6dc0e5567e4dd"), 90);

    }

    private static void crearProducto(String nombre, double precio, int stock, Controlador controlador){

        Document producto = new Document("_id", new ObjectId())
                .append("nombre", nombre)
                .append("precio", precio)
                .append("stock", stock);


        controlador.crearProducto(producto);
    }


}
