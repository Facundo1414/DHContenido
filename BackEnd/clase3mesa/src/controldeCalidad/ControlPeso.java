package controldeCalidad;

public class ControlPeso extends AnalistaDeCalidad{


    @Override
    public String validarCalidadDelProducto(Producto producto) {
        if (producto.getPeso() > 1200 && producto.getPeso() < 1300){
            System.out.println("Control de Peso exitoso");
            return getSigAnalistaDeCalidad().validarCalidadDelProducto(producto);
        }
        System.out.println("Control de Peso fracasado");
        return "Producto rechazado";
    }
}
