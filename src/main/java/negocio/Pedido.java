package negocio;

import org.bson.Document;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String referenciaMongo;
    private int codigo; // CAMBIAR
    private String nombreUsuario;
    List<Item> items = new ArrayList<Item>();
    private double total;


    public Pedido(){
    }
    public Pedido(Document documentoPedido){

    }




    public Document PedidoToDocument(){
        // Transforma el pedido en un documento bson para interactuar con mongo.

        return null;
    }




    public String getReferenciaMongo() {
        return referenciaMongo;
    }

    public void setReferenciaMongo(String referenciaMongo) {
        this.referenciaMongo = referenciaMongo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void calcularTotal(){

        Double aux = 0.0;
        for (Item item : items) {
            aux = aux + (item.getProducto().getPrecio() * item.getCantidad()); // usar subtotal item
        }
        this.total = aux;
    }



}
