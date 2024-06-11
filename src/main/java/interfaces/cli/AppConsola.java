package interfaces.cli;

import aplicacion.*;
import negocio.*;

public class AppConsola {


    public static void main(String[] args) {
        Controlador controlador = new Controlador();
        crearProducto("tv LG 50 pulgadas", 600000, 5, controlador);
        crearProducto("tv SAMSUNG 60 pulgadas", 850000, 22, controlador);
        crearProducto("tv LG 70 pulgadas", 1000000, 11, controlador);
        crearProducto("tv SONY 80 pulgadas", 2000000, 9, controlador);

        controlador.cargarTodosLosProductos();

        for (Producto producto : controlador.productos){
            System.out.println("id:" + producto.getId() + producto.getNombre() + " "+producto.getPrecio() + " "+producto.getStock());
            System.out.println();
        }
    }

    private static void crearProducto(String nombre, double precio, int stock, Controlador controlador){
        InfoCreacionProducto info = new InfoCreacionProducto();
        info.nombre = nombre;
        info.precio = precio;
        info.stock = stock;
        controlador.crearProducto(info);
    }
}
