package Estados;

import Articulos.Articulo;

import java.util.Scanner;

public class Reparacion implements State{
    private Articulo articulo;

    public Reparacion(Articulo articulo) {
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
    public void agregarRepuestos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese Valor de Respuesto: ");
        Double valor = scanner.nextDouble();
        articulo.setValorDePresupuesto(articulo.getValorDePresupuesto() + valor);
    }

    @Override
    public void pasarAlSiguientePaso() {

        articulo.setEstado(new ParaEnvio(articulo));
    }
}
