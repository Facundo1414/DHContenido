public class Main {
    public static void main(String[] args) {
        Almacen almacen = new Almacen();

        try {
            ProdcutoFactory.getInstance();
            Producto cajita = ProdcutoFactory.crearProducto(ProdcutoFactory.cj);
            Producto pelotaF = ProdcutoFactory.crearProducto(ProdcutoFactory.pf);
            Producto pelotat = ProdcutoFactory.crearProducto(ProdcutoFactory.pl);
//            Producto pelotaa = ProdcutoFactory.crearProducto("null");

            System.out.println(cajita.calcularEspacio());

            almacen.addProductos(cajita);
            almacen.addProductos(pelotaF);
            almacen.addProductos(pelotat);

        }catch (ExceptionInInitializerError e){
            System.out.println("Ingrese nuevamente");
        }









    }
}