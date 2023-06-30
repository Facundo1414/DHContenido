package com.company;

public class Main {
    public static void main(String[] args) {

        Nave navecita = new Nave(0, 0, 'N', 10, 100);
        System.out.println(navecita.toString());
//        navecita.restaVida(20);
        navecita.irA(0, 2, 'N');
        System.out.println(navecita.toString());


    }
}