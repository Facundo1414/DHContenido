public class EmpleadoContratado extends Empleado{
    private Integer cantidadHs;
    private Double precioPorHs;

    public EmpleadoContratado(String nombre, String apellido, String cuentaBancaria, Integer cantidadHs, Double precioPorHs) {
        super(nombre, apellido, cuentaBancaria);
        this.cantidadHs = cantidadHs;
        this.precioPorHs = precioPorHs;
    }

    public Integer getCantidadHs() {
        return cantidadHs;
    }

    public Double getPrecioPorHs() {
        return precioPorHs;
    }
}
