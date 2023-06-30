package com.company;


import java.util.Date;

public class Perrito {
    private boolean adopcion = false;
    private String raza;
    private int anioNacimiento;
    private double peso;
    private boolean chip;
    private boolean lastimado;
    private String nombre;

    //
    public Perrito(){}

    public Perrito(String raza, int anioNacimiento, double peso, boolean chip, boolean lastimado, String nombre) {
        this.raza = raza;
        this.anioNacimiento = anioNacimiento;
        this.peso = peso;
        this.chip = chip;
        this.lastimado = lastimado;
        this.nombre = nombre;
    }
    //

    public boolean isAdopcion() {
        return adopcion;
    }


    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isChip() {
        return chip;
    }

    public void setChip(boolean chip) {
        this.chip = chip;
    }

    public boolean isLastimado() {
        return lastimado;
    }

    public void setLastimado(boolean lastimado) {
        this.lastimado = lastimado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    //

    public int getEdad() {
        return 2023 - anioNacimiento;
    }
    public boolean sePuedePerder(){
        return !chip;
    }

    public void sePuedeAdoptar(){
        if (!lastimado && peso > 5){
            adopcion = true;
        }

    }


}
