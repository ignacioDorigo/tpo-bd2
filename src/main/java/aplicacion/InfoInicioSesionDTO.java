package aplicacion;

public class InfoInicioSesionDTO {
    private String mensaje;
    private boolean exito = false;
    private String objectIDMongo;


    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public boolean isExito() {
        return exito;
    }

    public void setExito(boolean exito) {
        this.exito = exito;
    }

    public String getObjectIDMongo() {
        return objectIDMongo;
    }

    public void setObjectIDMongo(String objectIDMongo) {
        this.objectIDMongo = objectIDMongo;
    }
}
