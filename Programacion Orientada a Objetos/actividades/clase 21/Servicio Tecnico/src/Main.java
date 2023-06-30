import Articulos.Articulo;

public class Main {
    public static void main(String[] args) {
        Articulo articulo1 = new Articulo("batidora");
        try {
            articulo1.darValorDePresupuesto();
//            articulo1.agregarRepuestos();
            articulo1.pasarAlSiguientePaso();
            articulo1.agregarRepuestos();
            articulo1.pasarAlSiguientePaso();
            articulo1.setDireccionDeEntrega("Manir Fatala");
            articulo1.pasarAlSiguientePaso();
            articulo1.pasarAlSiguientePaso();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }


}