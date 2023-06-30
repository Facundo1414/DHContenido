package Estados;

public class Pagando implements Estado{
    private Carrito carrito;

    public Pagando(Carrito carrito) {
        this.carrito = carrito;
    }

    @Override
    public void addProducto(Producto p) {
        System.out.println("NO acepto mas prodcutos en estado de PAGANDO");
    }

    @Override
    public void cancelarCarrito() {
        carrito.vaciarList();
        System.out.println("Cancelando Carrito");
        carrito.setEstado(new Vacio(carrito));
    }

    @Override
    public void volverAlPuntoAnterior() {
        System.out.println("volviendo al estado Cargando");
        carrito.setEstado(new Cargando(carrito));
    }

    @Override
    public void pasarAlSiguienteEstado() {
        System.out.println("Pasando al estado Cerrado");
        carrito.setEstado(new Cerrado(carrito));
    }
}
