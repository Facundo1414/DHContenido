package Estados;

public class Cargando implements Estado{
    private Carrito carrito;

    public Cargando(Carrito carrito) {
        this.carrito = carrito;
    }

    @Override
    public void addProducto(Producto p) {
        carrito.addProdcutoAlArray(p);
        System.out.println("\t\t...agregando productos...");
    }

    @Override
    public void cancelarCarrito() {
        carrito.vaciarList();
        System.out.println("Cancelando Carrito");
        carrito.setEstado(new Vacio(carrito));
    }

    @Override
    public void volverAlPuntoAnterior() {
        System.out.println("volviendo al estado vacio");
        carrito.vaciarList();
        carrito.setEstado(new Vacio(carrito));
    }

    @Override
    public void pasarAlSiguienteEstado() {
        carrito.setEstado(new Pagando(carrito));
    }
}
