package controldeCalidad;

public class Producto {
    private String nombre;
    private int lote;
    private int peso;
    private String envasado;
    // sano - casisano - etc..


    public Producto(String nombre, int lote, int peso, String envasado) {
        this.nombre = nombre;
        this.lote = lote;
        this.peso = peso;
        this.envasado = envasado;
    }








    public String getNombre() {
        return nombre;
    }

    public int getLote() {
        return lote;
    }

    public int getPeso() {
        return peso;
    }

    public String getEnvasado() {
        return envasado;
    }
}
