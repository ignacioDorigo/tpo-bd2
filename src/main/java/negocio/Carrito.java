package negocio;

import org.bson.Document;
import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private ObjectId id;
    private List<Item> items;
    private String referenciaUsuario;


    public Carrito(String referenciaUsuario) {
        this.referenciaUsuario = referenciaUsuario;
        this.items = new ArrayList<Item>();
        this.id = new ObjectId();
    }

    public Carrito(Document carritoDoc) {
        this.id = carritoDoc.getObjectId("_id");
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
    public ObjectId getId() {
        return id;
    }
    public void setId(ObjectId id) {
        this.id = id;
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
        documentoCarrito.append("_id", this.id);
        documentoCarrito.append("referenciaUsuario", this.referenciaUsuario);

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

    public Item productoEnCarrito(String idProducto){
        // busca el producto en el carrito
        Item resultado = null;

        for (Item item : this.items) {
            if(item.getProducto().getId().equals(idProducto)){
                resultado = item;
                return resultado;
            }
        }
        return resultado;

    }

    public void mostrarCarrito(){
        System.out.println("ID: " + this.id);
        System.out.println("Carrito: ref usuario" + this.referenciaUsuario);
        for (Item item : this.items) {
            System.out.println("Item: " + item.getProducto().getNombre());
            System.out.println("Cantidad: " + item.getCantidad());
            System.out.println("Precio: " + item.getProducto().getPrecio());
        }
    }



}
