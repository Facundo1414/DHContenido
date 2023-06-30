public class ProdcutoFactory {
    private static ProdcutoFactory prodcutoFactory;
    public final static String cj="CAJA10X10";
    public final static String pf="PELOTAFUTBOL";
    public final static String pl="PELOTATENIS";

    private ProdcutoFactory(){}

    public static ProdcutoFactory getInstance(){
        if (prodcutoFactory == null){
            prodcutoFactory = new ProdcutoFactory();

        }
        return prodcutoFactory;
    }

    public static Producto crearProducto(String tipo){
        switch (tipo){
            case "CAJA10X10":
                return new Caja(10, 10, 10, 10);
            case "PELOTAFUTBOL":
                return  new Pelota(10,11);
            case "PELOTATENIS":
                return new Pelota(2,0.32);
            default:
                throw new ExceptionInInitializerError("Producto mal inicializado");
        }
    }


}
