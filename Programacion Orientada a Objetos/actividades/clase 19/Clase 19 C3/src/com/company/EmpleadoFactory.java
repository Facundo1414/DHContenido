package com.company;

public class EmpleadoFactory {
    private static EmpleadoFactory empleadoFactory;
    public final static String EMP_RD="Empleado relacion dependencia";
    public final static String EMP_PH="Empleado contratado";
    private EmpleadoFactory() {
    }
    public static EmpleadoFactory obtenerInstancia()
    {
        if (empleadoFactory==null) {
            empleadoFactory =new EmpleadoFactory();
            return empleadoFactory;
        }
        else
            return empleadoFactory;
    }
    public Empleado crearEmpleado(String codigo, String nombre, String apellido, int legajo)
    {
        switch (codigo)
        {
            case "Empleado relacion dependencia":
                return new EmpleadoRelacionDependencia(nombre, apellido, legajo);
            case "Empleado contratado":
                return new EmpleadoContratado(nombre, apellido, legajo);
        }
        return null;
    }

}
