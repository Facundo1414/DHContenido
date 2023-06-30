package Estados;

import Articulos.Articulo;

public class Finalizado implements State{
    private Articulo articulo;

    public Finalizado(Articulo articulo) {
        this.articulo = articulo;
    }

    @Override
    public void cambiarDireccion() throws Exception {
        throw new Exception("No se puede aplicar dicho metodo en este estado");
    }

    @Override
    public void darValorDePresupuesto() throws Exception {
        throw new Exception("No se puede aplicar dicho metodo en este estado");
    }

    @Override
    public void agregarRepuestos() throws Exception {
        throw new Exception("No se puede aplicar dicho metodo en este estado");
    }

    @Override
    public void pasarAlSiguientePaso() {
        System.out.println("Reparacion Finalizada");
        System.out.println(articulo.toString());

    }
}
