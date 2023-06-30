package com.company;

public class Main {

    public static void main(String[] args) {

        Empresa empresa=new Empresa("DH");
        EmpleadoFactory empleadoFactory;
        empleadoFactory=EmpleadoFactory.obtenerInstancia();
        EmpleadoContratado emp1=(EmpleadoContratado)empleadoFactory.crearEmpleado(EmpleadoFactory.EMP_PH,"Juan","Perez",111);
        Empleado emp2=empleadoFactory.crearEmpleado(EmpleadoFactory.EMP_PH,"Juan","Perez",111);
        empresa.agregarEmpleado(emp1);
        empresa.agregarEmpleado(empleadoFactory.crearEmpleado(EmpleadoFactory.EMP_RD,"Carla","Gomez",222));
    }
}
