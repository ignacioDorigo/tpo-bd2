package negocio;

import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<Item> items;
    private String referenciaUsuario;

    public Carrito(String id) {
        this.referenciaUsuario = id;
        this.items = new ArrayList<Item>();
    }

    public Carrito(Document carritoDoc) {
        this.referenciaUsuario = carritoDoc.getString("referenciaUsuario");
        this.items = new ArrayList<>();
        for (Document itemDoc : carritoDoc.getList("items", Document.class)) {
            Item item = new Item();
            item.setCantidad(itemDoc.getInteger("cantidad"));

            Document productoDoc = itemDoc.get("producto", Document.class);
            Producto producto = new Producto();
            producto.setId(productoDoc.getString("id"));
            producto.setNombre(productoDoc.getString("nombre"));
            producto.setPrecio(productoDoc.getDouble("precio"));
            producto.setStock(productoDoc.getInteger("stock"));

            item.setProducto(producto);
            items.add(item);
        }
    }

    public void agregarItem(Item item) {
        this.items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public Document CarritoToDocument(){
        // Transforma el carrito en un documento bson para interactuar con mongo.

        Document documentoCarrito = new Document();
        // mongo nos deja tener el mismo _id mientras esten en colecciones diferentes
        documentoCarrito.append("_id", referenciaUsuario);

        List<Document> ListaItems = new ArrayList<>();
        for (Item item : this.items) {
            Document documentoItem = new Document();
            documentoItem.append("producto:", item.getProducto().getNombre());
            documentoItem.append("precio", item.getProducto().getPrecio());
            ListaItems.add(documentoItem);
        }
        documentoCarrito.append("items", ListaItems);
        return documentoCarrito;
    }



}
