package com.company;

public class UsuarioJuego {
    // atributos
    private String nombre;
    private String clave;
    private Double puntaje;
    private int nivel;


    // constructor

    public UsuarioJuego(String nombre, String clave) {
        this.nombre = nombre;
        this.clave = clave;
        this.puntaje = 0.0;
        this.nivel = 0;
    }

    // metodos

    public void aumentarPuntaje(){
        this.puntaje ++;
    }
    public void subirNivel(){
        this.nivel ++;
    }
    public void bonus(int valor){
        this.puntaje += valor;
    }

    public String toString() {
        return "UsuarioJuego{" +
                "nombre='" + nombre + '\'' +
                ", puntaje=" + puntaje +
                ", nivel=" + nivel +
                '}';
    }
}
