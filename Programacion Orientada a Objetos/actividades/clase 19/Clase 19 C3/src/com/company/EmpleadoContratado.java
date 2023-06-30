package com.company;

public class EmpleadoContratado extends Empleado{
    private double importeHora;
    private double retencionImpuesto;

    public EmpleadoContratado() {
        super();
        retencionImpuesto=14;
        importeHora=7;
    }

    public EmpleadoContratado(String nombre, String apellido, int legajo) {
        super(nombre, apellido, legajo);
        retencionImpuesto=14;
        importeHora=7;
    }

    @Override
    public double calcularSueldo() {
       double sueldo=importeHora*8*30;
       return sueldo-sueldo*retencionImpuesto/100;
    }
}
