package com.company;


import java.util.Objects;
import java.util.Scanner;


public class Main {

    public static String Nombrejugador(int num) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nombre del jugador "+ num+" :");
        return scanner.next();
    }

    public static int cualGana(int eleccionJ1, int eleccionJ2) {
        // piedra = 1 , papel = 2. tijera = 3
        if (eleccionJ1 == eleccionJ2) {
            return 0; //empate
        } else if ((eleccionJ1 == 1 && eleccionJ2 == 3) || (eleccionJ1 == 2 && eleccionJ2 == 1) || (eleccionJ1 == 3 && eleccionJ2 == 2)) {
            return 1;
        } else {
            return 2;
        }

    }

    public static void inicioJuego(String nombreJugador1, String nombreJugador2) {
        Scanner scanner = new Scanner(System.in);
        //
        System.out.println("\tJuego de priedra - papel - tijera\nReglas:\n1 = PIEDRA\n2 = PAPEL\n3 = TIJERA\nPara finalizar marque '*'");
        System.out.println(nombreJugador1 + " Ingrese su opcion: ");
        String opcionJugador1 = scanner.next();
        System.out.println(nombreJugador2 + " Ingrese su opcion: ");
        int opcionJugador2 = scanner.nextInt();
        //
        int puntosjugador1 = 0;
        int puntosjugador2 = 0;
        int i = 1;
        while (!Objects.equals(opcionJugador1, "*")) {
            int opcionJugadorA = Integer.parseInt(opcionJugador1);
            int resultado = cualGana(opcionJugadorA,opcionJugador2);
            if (resultado==0){
                System.out.println("La ronda "+i+" termino en EMPATE");
            } else if (resultado == 1) {
                System.out.println("Ganador de la Ronda " + i + " es " + nombreJugador1);
                puntosjugador1 ++;
            }
            else {System.out.println("Ganador de la Ronda " + i + " es " + nombreJugador2);
                puntosjugador2 ++ ;}
            i ++;
            //
            System.out.println(nombreJugador1 + " Ingrese su opcion: ");
            opcionJugador1 = scanner.next();
            System.out.println(nombreJugador2 + " Ingrese su opcion: ");
            opcionJugador2 = scanner.nextInt();
        }
        if (puntosjugador1 == puntosjugador2){System.out.println("RESULTADO FINAL ES EMPATE");} else if (puntosjugador1 > puntosjugador2) {
            System.out.println("RESULTADO FINAL: Ganador jugador " + nombreJugador1 +" con "+ puntosjugador1 + " puntos");
        }else {System.out.println("RESULTADO FINAL: Ganador jugador " + nombreJugador2 +" con "+ puntosjugador2+ " puntos");}
        System.out.println("\t\tGracias Por Jugar");
    }



    public static void main(String[] args) {
        //deafio 1 - piedra papel y tijera
        // pedir nombre
        String nombreJugador1 = Nombrejugador(1);
        String nombreJugador2 = Nombrejugador(2);
        inicioJuego(nombreJugador1,nombreJugador2);
        //

    }
}