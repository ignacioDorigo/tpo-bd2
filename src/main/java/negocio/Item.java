package negocio;

public class Item {
    private int cantidad;
    private Producto producto;
    private double subtotal;

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

    public void calcularSubtotal(){
        if (this.producto != null){
            this.subtotal = cantidad * this.producto.getPrecio();
        }
    }

    @Override
    public String toString() {
        return "Item{" +
                "cantidad=" + cantidad +
                ", producto=" + producto +
                ", subtotal=" + subtotal +
                '}';
    }
}
