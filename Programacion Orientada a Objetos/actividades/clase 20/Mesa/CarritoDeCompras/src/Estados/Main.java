package Estados;

public class Main {
    public static void main(String[] args) {

        Carrito carrito = new Carrito();

        Producto producto1 = new Producto("Papas",220.0);
        Producto producto2 = new Producto("Gaseosa",100.4);
        Producto producto3 = new Producto("Ensalada",220.5);
        Producto producto4 = new Producto("Rollo de Cocina",220.5);

        System.out.println(carrito.getEstado());
        carrito.addProdcuto(producto1);
        System.out.println(carrito.getEstado());
        carrito.addProdcuto(producto2);
        carrito.addProdcuto(producto3);

        carrito.pasarAlSiguienteEstado();
        System.out.println(carrito.getEstado());
        carrito.volverAlPuntoAnterior();
        System.out.println(carrito.getEstado());
        System.out.println();
        carrito.pasarAlSiguienteEstado();
        carrito.pasarAlSiguienteEstado();
        System.out.println();
        carrito.addProdcuto(producto4);

        carrito.mostrarProductos();
        carrito.cancelarCarrito();
        carrito.pasarAlSiguienteEstado();
    }
}