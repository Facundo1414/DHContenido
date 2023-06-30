public abstract class Item {
    private String nombre;

    public Item(String nombre) {
        this.nombre = nombre;
    }
    abstract double getPrecio();

    @Override
    public String toString() {
        return " - "+nombre ;
    }
}
