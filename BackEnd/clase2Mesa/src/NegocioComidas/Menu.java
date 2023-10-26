package NegocioComidas;

public abstract class Menu {
    private double total;
    private String name;

    public Menu(double precioBase, String name) {
        this.total = precioBase;
        this.name = name;
    }

    public double getPrecio() {
        return total;
    }

    public double precioFinal() {
        return getPrecio();
    }

    public String getName() {
        return name;
    }
}
