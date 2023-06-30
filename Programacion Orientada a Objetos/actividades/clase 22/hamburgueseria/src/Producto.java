public class Producto extends Item{
    private double precio;

    public Producto(String nombre, double precio) {
        super(nombre);
        this.precio = precio;
    }

    @Override
    double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return super.toString() + " - Precio: " + precio;
    }
}
