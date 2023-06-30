package com.company;

public class Estacion {
    private String nombre;

    public Estacion(int numNombre){

        switch (numNombre) {
            case 1 -> nombre = "Buenos Aires";
            case 2 -> nombre = "Luján";
            case 3 -> nombre = "Mercedes";
            case 4 -> nombre = "Suipacha";
            case 5 -> nombre = "Chivilcoy";
            case 6 -> nombre = "Alberti";
            case 7 -> nombre = "Bragado";
            default -> nombre = null;
        }
    }

    public String getNombre() {
        return nombre;
    }

}
