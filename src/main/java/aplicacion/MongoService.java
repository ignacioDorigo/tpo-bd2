package aplicacion;

import com.mongodb.client.*;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.UpdateResult;
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

    public void guardarUsuario(Document usuario) {
        try{
            coleccion.insertOne(usuario);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public Document buscarUsuario(ObjectId refMongo){
        // Busca el usuario en MongoDB. Si lo encuentra devuelve un Usuario con sus datos, si no lo encuentra devuelve null.
        try{
            Document consulta = new Document("_id", refMongo);
            return coleccion.find(consulta).first();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }


    public List<Document> todosLosUsuarios(){
        List<Document> usuarios = new ArrayList<>();
        try{
            FindIterable<Document> usuariosDocumentos = coleccion.find();
            for (Document doc : usuariosDocumentos) {
                usuarios.add(doc);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return usuarios;
    }


    public Document buscarCarrito(ObjectId referenciaMongo){
        // Busca y devuelve el carrito de la base de datos. Devuelve null si no lo encuentra
        Document consulta = new Document("referenciaUsuario", referenciaMongo);
        Document documentoCarrito = this.coleccion.find(consulta).first();
        if (documentoCarrito != null){
            return documentoCarrito;
        }
        System.out.println("Carrito no encontrado");
        return null;
    }

    public void crearCarrito(Document carrito){
        try{
            coleccion.insertOne(carrito);
        }
        catch (Exception e){
            System.out.println("Error al guardar carrito: " + e.getMessage());
        }
    }


    public void vaciarCarrito(Document carrito) {

        // Obtener el _id del carrito
        ObjectId id = carrito.getObjectId("_id");

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


    public Document buscarProducto(ObjectId idProducto){
        // busca y devuelve el producto. null si no lo encuentra o si ocurre un error inesperado.
        try{
            Document consulta = new Document("_id", idProducto);
            return this.coleccion.find(consulta).first();
        }
        catch (Exception e){
            System.out.println("Error al buscar producto: " + e.getMessage());
            return null;
        }
    }

    public void guardarProducto(Document producto){
        try{
            coleccion.insertOne(producto);
            System.out.println("El producto se ha guardado correctamente");
        }
        catch (Exception e){
            System.out.println("Error al guardar el producto: " + e.getMessage());
        }
    }

    public void agregarItemCarrito(ObjectId referenciaMongo, Document producto, int cantidad){
        // busca el producto en el carrito, si esta en el carrito le suma la cantidad. si no esta lo crea.
        // el item es el producto y su cantidad.
        try{
            String productoId = producto.getString("_id");
            // Intenta incrementar la cantidad del item si ya existe
            UpdateResult updateResult = coleccion.updateOne(
                    Filters.and(
                            Filters.eq("referenciaUsuario", referenciaMongo),
                            Filters.eq("items._id", productoId)
                    ),
                    Updates.inc("items.$.cantidad", cantidad)
            );
            // Si no se encontro ni actualizo ningun documento, el producto no esta en el carrito
            if (updateResult.getMatchedCount() == 0) {
                // Agrega el campo cantidad al producto
                producto.append("cantidad", cantidad);
                // Agrega el nuevo item al carrito
                coleccion.updateOne(
                        Filters.eq("referenciaUsuario", referenciaMongo),
                        Updates.push("items", producto)
                );
            }
        }
        catch (Exception e){
            System.out.println("Error al agregar item carrito: " + e.getMessage());
        }
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

    public List<Document> todosLosProductos(){
        // devuelve una lista con todos los productos
        FindIterable<Document> documentos = coleccion.find();
        List<Document> productos = new ArrayList<>();

        for (Document documento : documentos) {
            productos.add(documento);
        }
        return productos;
    }



}
