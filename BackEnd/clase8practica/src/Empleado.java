public class Empleado {
    private int id;
    private String nombre;
    private int edad;
    private String empresa;
    private String fechaContratado;

    public Empleado(int id, String nombre, int edad, String empresa, String fechaContratado) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.empresa = empresa;
        this.fechaContratado = fechaContratado;
    }

    public String getEmpresa() {
        return empresa;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getFechaContratado() {
        return fechaContratado;
    }
}
