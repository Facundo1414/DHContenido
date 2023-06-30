import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private List<Cuenta> cuentas = new ArrayList<Cuenta>();

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public void addCuenta(Cuenta cuenta){
        cuentas.add((Cuenta) cuenta);
    }

    public String getNombreCompleto(){
        return nombre + apellido;
    }

    public boolean esMayorEdad(){
        return edad > 60;
    }

    public double getSaldoTotal(){
        double saldoTotal = 0;
        for (Cuenta cuenta: cuentas) {
            saldoTotal += cuenta.getSaldo();
        }
        return saldoTotal;
    }

    public void mostrarCuentas(){
        cuentas.sort(null);
        for (Cuenta cuenta: cuentas) {
            System.out.println("SALDO: " + cuenta.getSaldo() + " DE LA CUENTA "+ cuenta.getNumeroCuenta());
        }


    }
}

