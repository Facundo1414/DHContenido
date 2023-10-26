package controldeCalidad;

public abstract class AnalistaDeCalidad {
    private AnalistaDeCalidad sigAnalistaDeCalidad;



    public AnalistaDeCalidad getSigAnalistaDeCalidad() {
        return sigAnalistaDeCalidad;
    }

    public void setSigAnalistaDeCalidad(AnalistaDeCalidad sigAnalistaDeCalidad) {
        this.sigAnalistaDeCalidad = sigAnalistaDeCalidad;
    }

    public abstract String validarCalidadDelProducto(Producto producto);
}
