package com.company;

public class Main {
    public static void main(String[] args) {
        Perrito pepe = new Perrito("Pastor Aleman",
                2019,
                8.5,
                true,
                false,
                "pepe");
        pepe.sePuedeAdoptar();
        System.out.println("Se puede adoptar? " + pepe.isAdopcion());
        System.out.println(pepe.sePuedePerder());
        System.out.println("Edad = " + pepe.getEdad());


    }
}