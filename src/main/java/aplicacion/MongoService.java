package aplicacion;

import com.mongodb.client.*;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.UpdateResult;
import negocio.Carrito;
import negocio.Item;
import negocio.Producto;
import negocio.Usuario;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.List;

public class MongoService {
    private MongoClient clienteMongo;
    private MongoDatabase baseDeDatos;
    private MongoCollection<Document> coleccion;

    public MongoService(String nombreColeccion) {
        // recibe la direccion y el nombre de la base de datos y la coleccion que se va a consultar
        this.clienteMongo = MongoClients.create("mongodb://localhost:27017");
        this.baseDeDatos = clienteMongo.getDatabase("TPO_BD2");
        this.coleccion = baseDeDatos.getCollection(nombreColeccion);
    }

    public void close(){
        // Cierra la conexion a la base de datos
        if (this.clienteMongo != null){
            this.clienteMongo.close();
        }
    }

    public void guardarUsuario(Usuario usuario) {
        try{
            Document documentoUsuario = usuario.usuarioToDocument();
            coleccion.insertOne(documentoUsuario);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public Usuario buscarUsuario(String refMongo){
        // Busca el usuario en MongoDB. Si lo encuentra devuelve un Usuario con sus datos, si no lo encuentra devuelve null.
        try{
            Usuario usuario = null;
            Document consulta = new Document("_id", refMongo);
            Document documentoUsuario = coleccion.find(consulta).first();
            if (documentoUsuario != null){
                usuario = new Usuario(documentoUsuario);
            }
            return usuario;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }


    public List<Usuario> todosLosUsuarios(){
        List<Usuario> usuarios = new ArrayList<Usuario>();
        try{
            MongoCollection<Document> coleccionUsuarios = baseDeDatos.getCollection("usuarios");
            for (Document doc : coleccionUsuarios.find()) {
                Usuario usuario = new Usuario(doc);
                usuarios.add(usuario);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return usuarios;
    }


    public Carrito buscarCarrito(String referenciaMongo){
        // Busca y devuelve el carrito de la base de datos. Devuelve null si no lo encuentra
        Document consulta = new Document("referenciaUsuario", referenciaMongo);
        Document documentoCarrito = this.coleccion.find(consulta).first();
        if (documentoCarrito != null){
            Carrito carrito = new Carrito(documentoCarrito);
            return carrito;
        }
        System.out.println("Carrito no encontrado");
        return null;
    }

    public void crearCarrito(Carrito carrito){
        try{
            Document documentoCarrito = carrito.CarritoToDocument();
            coleccion.insertOne(documentoCarrito);
        }
        catch (Exception e){
            System.out.println("Error al guardar carrito: " + e.getMessage());
        }
    }

    public void reemplazarCarrito(Carrito carrito){
        // reemplaza carrito existente por carrito nuevo
        try{
            Document documentoCarrito = carrito.CarritoToDocument();
            Bson filtro = Filters.eq("_id", documentoCarrito.getObjectId("_id"));
            coleccion.replaceOne(filtro, documentoCarrito);
        }
        catch (Exception e){
            System.out.println("Error al reemplazar carrito: " + e.getMessage());
        }
    }

    public void vaciarCarrito(Carrito carrito) {
        Document carritoDocument = carrito.CarritoToDocument();

        // Obtener el _id del carrito
        ObjectId id = carritoDocument.getObjectId("_id");

        // Crear el filtro para encontrar el carrito en la colección
        Bson filtro = Filters.eq("_id", id);

        // Crear el documento de actualización para vaciar la lista de items
        Bson update = Updates.set("items", new ArrayList<>());

        // Actualizar el carrito en la colección para vaciar la lista de items
        UpdateResult result = coleccion.updateOne(filtro, update);

        // Verificar si la actualización fue exitosa
        if (result.getModifiedCount() > 0) {
            System.out.println("Carrito vaciado con éxito.");
        } else {
            System.out.println("No se pudo vaciar el carrito.");
        }
    }

    public Producto buscarProducto(String idProducto){
        // busca y devuelve el producto. null si no lo encuentra o si ocurre un error inesperado.

        try{
            Document consulta = new Document("_id", idProducto);
            Document documentoProducto = this.coleccion.find(consulta).first();
            if (documentoProducto != null){
                return new Producto(documentoProducto);
            }
            return null;
        }
        catch (Exception e){
            System.out.println("Error al buscar producto: " + e.getMessage());
            return null;
        }
    }

    public void guardarProducto(Producto producto){
        try{
            Document documentoProducto = producto.productoToDocument();
            coleccion.insertOne(documentoProducto);
            System.out.println("El producto se ha guardado correctamente");
        }
        catch (Exception e){
            System.out.println("Error al guardar el producto: " + e.getMessage());
        }
    }

    public List<Producto> todosLosProductos(){
        // devuelve una lista con todos los productos
        FindIterable<Document> documentos = coleccion.find();
        List<Producto> productos = new ArrayList<>();
        for (Document documento : documentos) {
            productos.add(new Producto(documento));
        }
        return productos;
    }

    public boolean modificarPrecioProducto(String idProducto, double precio){
        try {
            Document consulta = new Document("_id", idProducto);
            Document actualizado = new Document("$set", new Document("precio", precio));
            UpdateResult resultado = this.coleccion.updateOne(consulta, actualizado);

            return resultado.getModifiedCount() > 0;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }

    }

}
