package com.company;

public class Main {
    public static void main(String[] args) {
        Puerto puerto = new Puerto();
        Contenedor contenedor1 = new Contenedor(10,"Suecia",false);
        Contenedor contenedor2 = new Contenedor(120,"Francia",true);
        Contenedor contenedor3 = new Contenedor(13,"Desconocido",true);
        Contenedor contenedor4 = new Contenedor(106,"Desconocido",false);
        Contenedor contenedor5 = new Contenedor(1,"Suecia",false);

        puerto.addContenedor(contenedor1);
        puerto.addContenedor(contenedor2);
        puerto.addContenedor(contenedor3);
        puerto.addContenedor(contenedor4);
        puerto.addContenedor(contenedor5);

        puerto.mostrarContenedoresOrdenados();
        System.out.println("Cantidad de contenedores Peligrosos = " + puerto.cantidadDeContenedoresPeligrosos());

    }
}