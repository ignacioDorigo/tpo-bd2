package negocio;

import org.bson.Document;
import org.bson.types.ObjectId;

public class Usuario {

    private String id;
    private String nombre;
    private String correo;
    private String direccion;
    private String documento;


    public Usuario(String nombre, String correo){
        this.id = new ObjectId().toHexString();
        this.nombre = nombre;
        this.correo = correo;
    }

    public Usuario(Document datosUsuario){
        this.id = datosUsuario.getString("id");
        this.nombre = datosUsuario.getString("nombre");
        this.correo = datosUsuario.getString("correo");
        this.direccion = datosUsuario.containsKey("direccion") ? datosUsuario.getString("direccion") : null;
        this.documento = datosUsuario.containsKey("direccion") ? datosUsuario.getString("direccion") : null;
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

    public Document toDocument(){
        Document doc = new Document("_id", id)
                .append("nombre", nombre)
                .append("correo", correo);

        if (!documento.isEmpty()) {
            doc.append("documento", documento);
        }

        if (!direccion.isEmpty()) {
            doc.append("direccion", direccion);
        }
        return doc;
    }
}
