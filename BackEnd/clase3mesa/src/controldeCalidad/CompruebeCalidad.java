package controldeCalidad;

public class CompruebeCalidad {
    private AnalistaDeCalidad controlInicial;

    public CompruebeCalidad() {

        controlInicial = new ControlLote();
        AnalistaDeCalidad controlPeso = new ControlPeso();
        AnalistaDeCalidad controlEnvase = new ControlEnvase();

        controlInicial.setSigAnalistaDeCalidad(controlPeso);
        controlPeso.setSigAnalistaDeCalidad(controlEnvase);
    }

    public String validarCalidadDelProdcuto(Producto producto){
        return controlInicial.validarCalidadDelProducto(producto);
    }
}
