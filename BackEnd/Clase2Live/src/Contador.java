public abstract class Contador {

    public String liquidarSueldo(Empleado empleado){
        String respuesta = "No se pudo liquidar el salario";
        Double sueldo = calcularSueldo(empleado);

        if (sueldo>0){
            String recibo = emitirRecibo(empleado);
            respuesta = recibo + " :Sueldo a liquidar = " + sueldo;
        }
        return respuesta;
    }

    private String depositarSueldo(Empleado empleado){
        return "Orden de pago en la cuenta de :" + empleado.getNombre();
    }

    protected abstract Double calcularSueldo(Empleado empleado);
    protected abstract String emitirRecibo(Empleado empleado);


}
