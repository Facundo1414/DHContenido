public class Main {
    public static void main(String[] args) {
        CarritoDeCompra carritoDeCompra = new CarritoDeCompra();

        Producto p1 = new Producto("Hamburguesa",250.0);
        Producto p2 = new Producto("Hamburguesa con doble carne",300.0);
        Producto p3 = new Producto("Papas",150.0);
        Producto p4 = new Producto("Vaso de Coca",150.0);

        Combo comboSimple = new Combo("Simple",50.0);
        comboSimple.addItem(p1);
        comboSimple.addItem(p3);
        comboSimple.addItem(p4);

        carritoDeCompra.addItem(comboSimple);
        carritoDeCompra.addItem(comboSimple);

        System.out.println(carritoDeCompra);
    }
}