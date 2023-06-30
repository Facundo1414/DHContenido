package com.company;

import java.util.Date;

public class Main {

    public static void comparandoYates(int valor){
        if (valor > 0){
            System.out.println("El Primer Yate es mayor");

        } else if (valor < 0) {
            System.out.println("El Segundo Yate es mayor");
        }
        else {

        System.out.println("Los yates Son iguales");
        }
    }

    public static void main(String[] args) {

        Capitan capitan1 = new Capitan("Jack","Sparrow","aa3");
        Velero velero1 = new Velero(capitan1,1000.0,300.0,new Date(1995),30,3);
        Yate yate1 = new Yate(capitan1,4500.0,600.0,new Date(2022),155,30);
        Yate yate2 = new Yate(capitan1,2200.0,600.0,new Date(2022),120,12);

        System.out.println("El velero es grande? " + velero1.isGrande());
        System.out.println("Monto de alquiler del velero 1: $ "+ velero1.calcularMontoAlquiler());
        System.out.println();

        comparandoYates(yate1.compareTo(yate2));
        System.out.println("Monto de alquiler del yate 1: $ "+yate1.calcularMontoAlquiler());
        System.out.println("Monto de alquiler del yate 2: $ "+yate2.calcularMontoAlquiler());


    }
}