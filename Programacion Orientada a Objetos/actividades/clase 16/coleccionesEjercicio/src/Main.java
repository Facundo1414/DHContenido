public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("FACU","Allende",21);

        Cuenta cuenta1 = new Cuenta(1,200.50);
        Cuenta cuenta2 = new Cuenta(2,500.50);
        Cuenta cuenta3 = new Cuenta(3,300.50);
        Cuenta cuenta4 = new Cuenta(4,8700.0);
        Cuenta cuenta5 = new Cuenta(5,600.0);
        Cuenta cuenta6 = new Cuenta(6,2800.0);

        persona.addCuenta(cuenta2);
        persona.addCuenta(cuenta1);
        persona.addCuenta(cuenta4);
        persona.addCuenta(cuenta5);
        persona.addCuenta(cuenta3);
        persona.addCuenta(cuenta6);


        System.out.println(persona.getNombreCompleto());
        System.out.println(persona.esMayorEdad());
        System.out.println(persona.getSaldoTotal());
        persona.mostrarCuentas();




    }
}