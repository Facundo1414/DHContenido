package Estados;

public class Vacio implements Estado{
    private Carrito carrito;

    public Vacio(Carrito carrito) {
        this.carrito = carrito;
    }


    @Override
    public void addProducto(Producto p) {
        carrito.addProdcutoAlArray(p);
        System.out.println("cambiando de estado a cargando");
        carrito.setEstado(new Cargando(carrito));
    }

    @Override
    public void cancelarCarrito() {
        System.out.println("El carrito se encuentra Vacio");
    }

    @Override
    public void volverAlPuntoAnterior() {
        System.out.println("El carrito se encuentra Vacio");
    }

    @Override
    public void pasarAlSiguienteEstado() {
        carrito.setEstado(new Cargando(carrito));
    }
}
