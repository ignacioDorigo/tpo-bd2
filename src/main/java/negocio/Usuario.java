package negocio;

import org.bson.Document;
import org.bson.types.ObjectId;

public class Usuario {

    private String id;
    private String nombre;
    private String correo;
    private String direccion;
    private String documento;
    private Categoria categoria;
    private int minutos;

    public Usuario(String nombre, String correo){
        // creacion de un usuario por primera vez para obtener id unico
        this.id = new ObjectId().toHexString();
        this.nombre = nombre;
        this.correo = correo;
        this.categoria = Categoria.LOW;
        this.minutos = 0;
    }

    public Usuario(Document datosUsuario){
        // recibe un documento y devuelve un usuario con todos los datos guardados en ese documento

        this.id = datosUsuario.getString("_id");
        this.nombre = datosUsuario.getString("nombre");
        this.correo = datosUsuario.getString("correo");
        this.categoria = Categoria.valueOf(datosUsuario.getString("categoria"));
        this.minutos = datosUsuario.getInteger("minutos");
        this.direccion = datosUsuario.containsKey("direccion") ? datosUsuario.getString("direccion") : null;
        this.documento = datosUsuario.containsKey("documento") ? datosUsuario.getString("documento") : null;
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {this.id = id;}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {return direccion;}

    public void setDireccion(String direccion) {this.direccion = direccion;}

    public String getDocumento() {return documento;}

    public void setDocumento(String documento) {this.documento = documento;}

    public int getMinutos(){
        return minutos;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Document usuarioToDocument(){
        Document doc = new Document("_id", id)
                .append("nombre", nombre)
                .append("correo", correo)
                .append("minutos", minutos)
                .append("categoria", categoria);

        if (!documento.isEmpty()) {
            doc.append("documento", documento);
        }

        if (!direccion.isEmpty()) {
            doc.append("direccion", direccion);
        }
        return doc;
    }
}
