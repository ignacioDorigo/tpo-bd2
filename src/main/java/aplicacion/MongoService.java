package aplicacion;

import com.mongodb.client.*;
import com.mongodb.client.result.UpdateResult;
import negocio.Carrito;
import negocio.Producto;
import negocio.Usuario;
import org.bson.Document;

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
        Document consulta = new Document("_id", referenciaMongo);
        Document documentoCarrito = this.coleccion.find(consulta).first();
        if (documentoCarrito != null){
            return new Carrito(documentoCarrito); // convierte el bson carrito al tipo de dato Carrito
        }
        return null;
    }

    public void guardarCarrito(Carrito carrito){
        try{
            Document documentoCarrito = carrito.CarritoToDocument();
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
