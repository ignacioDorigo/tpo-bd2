package negocio;

public class Item {
    private int cantidad;
    private Producto producto;

    public int getCantidad(){
        return cantidad;
    }

    public Producto getProducto(){
        return producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
