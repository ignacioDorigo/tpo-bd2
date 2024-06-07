package negocio;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<Item> items;
    private String referenciaUsuario;

    public Carrito(String id) {
        this.referenciaUsuario = id;
        this.items = new ArrayList<Item>();
    }

    public void agregarItem(Item item) {
        this.items.add(item);
    }

}
