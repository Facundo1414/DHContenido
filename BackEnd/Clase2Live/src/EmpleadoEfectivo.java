public class EmpleadoEfectivo extends Empleado{
    private Double sueldoBasico;
    private Double descuentos;
    private Double premios;

    public EmpleadoEfectivo(String nombre, String apellido, String cuentaBancaria, Double sueldoBasico, Double descuentos, Double premios) {
        super(nombre, apellido, cuentaBancaria);
        this.sueldoBasico = sueldoBasico;
        this.descuentos = descuentos;
        this.premios = premios;
    }

    public Double getSueldoBasico() {
        return sueldoBasico;
    }

    public Double getDescuentos() {
        return descuentos;
    }

    public Double getPremios() {
        return premios;
    }
}
