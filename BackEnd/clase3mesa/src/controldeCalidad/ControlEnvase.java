package controldeCalidad;

public class ControlEnvase extends AnalistaDeCalidad{


    @Override
    public String validarCalidadDelProducto(Producto producto) {
        if (producto.getEnvasado().equalsIgnoreCase("sano") || producto.getEnvasado().equalsIgnoreCase("casi sano")){
            System.out.println("Control de Envase exitoso");
            return "Producto Aceptado";
        }
        System.out.println("Control de Envase fracasado");
        return "Producto rechazado";
    }
}
