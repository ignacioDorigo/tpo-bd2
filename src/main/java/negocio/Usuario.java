package negocio;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "usuarios")
public class Usuario {
    @Id
    private String id;
    private String nombre;
    private String email;
    private String direccion;
    private String documento;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {return direccion;}

    public void setDireccion(String direccion) {this.direccion = direccion;}

    public String getDocumento() {return documento;}

    public void setDocumento(String documento) {this.documento = documento;}
}
