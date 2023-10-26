public class ContadorEmpleadoContratado extends Contador{
    private String liquidarSueldo;

    @Override
    protected Double calcularSueldo(Empleado empleado) {
        double total = 0.0;
        if (empleado instanceof EmpleadoContratado){
            EmpleadoContratado ec = (EmpleadoContratado) empleado;
            total = ec.getPrecioPorHs() * ec.getCantidadHs();
        }
        return total;
    }

    @Override
    protected String emitirRecibo(Empleado empleado) {
        return "La liquidacion generada es un documento digital. Saldo a liquidar = " + calcularSueldo(empleado);
    }
}
