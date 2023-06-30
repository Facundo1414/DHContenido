package Estados;


import Articulos.Articulo;

import java.util.Scanner;

public class ParaEnvio implements State{
    private Articulo articulo;

    public ParaEnvio(Articulo articulo) {
        this.articulo = articulo;
    }

    @Override
    public void cambiarDireccion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese Direccion: ");
        String valor = scanner.next();
        articulo.setDireccionDeEntrega(valor);
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
        articulo.setEstado(new Finalizado(articulo));
    }
}
