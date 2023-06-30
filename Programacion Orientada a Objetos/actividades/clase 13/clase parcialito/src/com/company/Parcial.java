package com.company;

public class Parcial extends Examen{
    private int numeroUnidad;
    private int reintentos;

    public Parcial(String titulo, String enunciado, Integer nota, Alumno alumno, int numeroUnidad) {
        super(titulo, enunciado, nota, alumno);
        this.numeroUnidad = numeroUnidad;
        if (numeroUnidad <= 3){
            reintentos = 3;
        }
        else {reintentos = 2;}
    }

    public boolean isRecuperarParcial(){
        if (reintentos != 0){
            System.out.println("Cantidad de intentos: " + reintentos);
            return true;
        }
        System.out.println("No podes recuperar mas paricales");
        return  false;
        }




     public void restarIntentos(){
        reintentos --;
     }




    public int getNumeroUnidad() {
        return numeroUnidad;
    }

    public void setNumeroUnidad(int numeroUnidad) {
        this.numeroUnidad = numeroUnidad;
    }

    public int getReintentos() {
        return reintentos;
    }

    public void setReintentos(int reintentos) {
        this.reintentos = reintentos;
    }
}
