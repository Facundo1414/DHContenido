package Estados;

public class Cerrado implements Estado{
    private Carrito carrito;

    public Cerrado(Carrito carrito) {
        this.carrito = carrito;
    }

    @Override
    public void addProducto(Producto p) {
        System.out.println("NO acepto mas prodcutos");
    }

    @Override
    public void cancelarCarrito() {
        System.out.println("NO puedo cancelar");
    }

    @Override
    public void volverAlPuntoAnterior() {
        System.out.println("NO puede volver");
    }

    @Override
    public void pasarAlSiguienteEstado() {
        carrito.vaciarList();
        carrito.setEstado(new Vacio(carrito));
    }
}
