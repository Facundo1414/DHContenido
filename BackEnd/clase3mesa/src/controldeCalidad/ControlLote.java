package controldeCalidad;

public class ControlLote extends AnalistaDeCalidad{


    @Override
    public String validarCalidadDelProducto(Producto producto) {
        if (producto.getLote() > 1000 && producto.getLote() < 2000){
            System.out.println("Control de Lote exitoso");
            return getSigAnalistaDeCalidad().validarCalidadDelProducto(producto);
        }
        System.out.println("Control de Lote fracasado");
        return "Producto rechazado";
    }
}
