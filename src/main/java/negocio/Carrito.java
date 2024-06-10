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

    public Carrito(Document document) {
        this.referenciaUsuario = document.getString("referenciaUsuario");
        List<String> itemsDocumento = document.getList("items", String.class);
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
