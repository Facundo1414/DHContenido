public class ContadorEmpleadoEfectivo extends Contador{

    @Override
    protected Double calcularSueldo(Empleado empleado) {

        double total = 0.0;

        if (empleado instanceof EmpleadoEfectivo){
            EmpleadoEfectivo ef = (EmpleadoEfectivo) empleado;
            total = ef.getSueldoBasico();
        }

        return total;
    }

    @Override
    protected String emitirRecibo(Empleado empleado) {

        return "Saldo a liquidar = " + calcularSueldo(empleado);
    }
}
