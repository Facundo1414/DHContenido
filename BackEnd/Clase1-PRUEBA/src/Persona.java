public class Persona {
    private String nombre;
    private String apellido;
    private String email;
    private int edad;

    public Persona(String nombre, String apellido, String email, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.edad = edad;
    }

    String mostrarNombre(){
        return this.nombre + " " + this.apellido;
    }

    boolean esMayor(){
        return this.edad > 17;
    }
}


