package com.company;

public class EmpleadoRelacionDependencia extends Empleado{

    private double sueldoMensual;

    public EmpleadoRelacionDependencia() {
        super();
        sueldoMensual=1000;
    }

    public EmpleadoRelacionDependencia(String nombre, String apellido, int legajo) {
        super(nombre, apellido, legajo);
        sueldoMensual=1000;
    }

    @Override
    public double calcularSueldo() {
        return 0;
    }
}
