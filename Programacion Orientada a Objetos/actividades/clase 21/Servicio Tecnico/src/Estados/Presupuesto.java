package Estados;
import Articulos.Articulo;

import java.util.Scanner;


public class Presupuesto implements State{
    private Articulo articulo;

    public Presupuesto(Articulo articulo) {
        this.articulo = articulo;
    }

    @Override
    public void cambiarDireccion() throws Exception {
        throw new Exception("No se puede aplicar dicho metodo en este estado");
    }

    @Override
    public void darValorDePresupuesto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese Valor de Presupuesto Inicial: ");
        Double valor = scanner.nextDouble();
        articulo.setValorDePresupuesto(valor);
    }

    @Override
    public void agregarRepuestos() throws Exception {
        throw new Exception("No se puede aplicar dicho metodo en este estado");
    }

    @Override
    public void pasarAlSiguientePaso() {

        articulo.setEstado(new Reparacion(articulo));
    }
}
