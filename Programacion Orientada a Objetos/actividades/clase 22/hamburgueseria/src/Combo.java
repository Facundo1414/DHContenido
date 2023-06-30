import java.util.ArrayList;

public class Combo extends Item{
    private ArrayList<Item> items;
    private double descuento;

    public Combo(String nombre, double descuento) {
        super(nombre);
        this.descuento = descuento;
        items = new ArrayList<>();
    }

    public void addItem(Item item){
        items.add(item);
    }
    public void deleteItem(Item item){
        items.add(item);
    }

    @Override
    public double getPrecio() {
        double total = 0;
        for (Item i: items) {
            total += i.getPrecio();
        }
        return total -= descuento;
    }

    @Override
    public String toString() {
        return "Combo " + super.toString() +  items  + ",\t Descuento =" + descuento + "\t TotalCombo =" + getPrecio()  ;
    }
}
