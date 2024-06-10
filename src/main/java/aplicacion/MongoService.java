package aplicacion;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import negocio.Carrito;
import org.bson.Document;

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
}
