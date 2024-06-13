package negocio;

import org.bson.Document;
import org.bson.types.ObjectId;

public class Producto {
    private String id;
    private String nombre;
    private double precio;
    private int stock;

    public Producto() {
        this.id = new ObjectId().toHexString();
    }

    public Producto(Document documentoProducto) {
        this.id = documentoProducto.getString("_id");
        this.nombre = documentoProducto.getString("nombre");
        this.precio = documentoProducto.getDouble("precio");
        this.stock = documentoProducto.getInteger("stock");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {return precio;}

    public void setPrecio(double precio) {this.precio = precio;}

    public int getStock() {return stock;}

    public void setStock(int stock) {this.stock = stock;}

    public Document productoToDocument(){
        try{
            Document doc = new Document();
            doc.append("_id", id);
            doc.append("nombre", nombre);
            doc.append("precio", precio);
            doc.append("stock", stock);
            return doc;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }
}
