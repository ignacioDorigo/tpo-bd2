package aplicacion;

import com.mongodb.client.*;
import negocio.Carrito;
import negocio.Producto;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class MongoService {
    private MongoClient clienteMongo;
    private MongoDatabase baseDeDatos;
    private MongoCollection<Document> coleccion;

    public MongoService(String nombreCliente, String nombreBD, String nombreColeccion) {
        // recibe la direccion y el nombre de la base de datos y la coleccion que se va a consultar
        this.clienteMongo = MongoClients.create(nombreCliente);
        this.baseDeDatos = clienteMongo.getDatabase(nombreBD);
        this.coleccion = baseDeDatos.getCollection(nombreColeccion);
    }

    public void close(){
        // Cierra la conexion a la base de datos
        if (this.clienteMongo != null){
            this.clienteMongo.close();
        }
    }

    public Carrito buscarCarrito(String referenciaMongo){
        // Busca y devuelve el carrito de la base de datos. Devuelve null si no lo encuentra
        Document consulta = new Document("_id", referenciaMongo);
        Document documentoCarrito = this.coleccion.find(consulta).first();
        if (documentoCarrito != null){
            return new Carrito(documentoCarrito); // convierte el bson carrito al tipo de dato Carrito
        }
        return null;
    }

    public void guardarCarrito(Document documentoCarrito){
        try{
            coleccion.insertOne(documentoCarrito);
        }
        catch (Exception e){
            System.out.println("Error al guardar carrito: " + e.getMessage());
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

    public void guardarProducto(Document documentoProducto){
        try{
            coleccion.insertOne(documentoProducto);
        }
        catch (Exception e){
            System.out.println("Error al guardar el producto: " + e.getMessage());
        }
    }

    public List<Producto> buscarProductos(){
        // devuelve una lista con todos los productos
        FindIterable<Document> documentos = coleccion.find();
        List<Producto> productos = new ArrayList<>();
        for (Document documento : documentos) {
            productos.add(new Producto(documento));
        }
        return productos;
    }

}
