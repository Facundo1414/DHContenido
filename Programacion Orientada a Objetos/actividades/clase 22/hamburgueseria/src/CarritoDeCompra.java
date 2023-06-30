import java.util.ArrayList;

public class CarritoDeCompra {
    private ArrayList<Item> items;

    public CarritoDeCompra() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void deleteItem(Item item) {
        items.add(item);
    }

    @Override
    public String toString() {
        return "\tCarritoDeCompra\n" + items +
                " \nTotal Carrito = " + MostrarTotal();
    }

    private double MostrarTotal() {
        double total = 0;
        for (Item i : items) {
            total += i.getPrecio();
        }
        return total;

    }
}
