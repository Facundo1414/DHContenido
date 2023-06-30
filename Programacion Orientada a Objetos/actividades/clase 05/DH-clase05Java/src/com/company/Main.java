package com.company;

public class Main {
    public static void main(String[] args) {
        UsuarioJuego juan = new UsuarioJuego("Juan","123");
        juan.aumentarPuntaje();
        juan.subirNivel();
        juan.subirNivel();
        juan.bonus(5);
        System.out.println(juan.toString());

        UsuarioJuego lucia = new UsuarioJuego("lucia","1234");
        lucia.aumentarPuntaje();
        lucia.subirNivel();
        System.out.println(lucia.toString());



    }
}