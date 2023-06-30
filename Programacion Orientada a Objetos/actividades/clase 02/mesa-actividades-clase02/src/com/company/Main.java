package com.company;

import java.util.Scanner;

public class Main {
    // ejercicio 1
    public static boolean esDivisible(int numero1,int numero2) {
        return numero1 % numero2 == 0;
    }


    public static String esPrimo(int numero){
        for (int i = numero - 1; i > 1; i--){
            if (esDivisible(numero,i)){
                return " No es Primo";
            }
        }
        return " es Primo";
    }

    // ejercicio 2

    public static Integer comparador(Integer numero1 , Integer numero2){
            Integer mayor ;
        if (numero1.compareTo(numero2) == 0){
            mayor = numero1;
        }
        else if (numero1.compareTo(numero2) > 0){
            mayor = numero1;
        }
        else {
            mayor = numero2;
        }
        return mayor;
    }

    public static Integer maximoEntreTresNumeros(Integer unNumeroA, Integer unNumeroB, Integer unNumeroC){
        Integer mayor ;
        // comparando los primeros 2 valores
        mayor = comparador(unNumeroA,unNumeroB);
        // comparando el mayor de los anteriores con el tercer valor
        mayor = comparador(mayor,unNumeroC);
        return mayor;}

    // ejercicio 3

    public static boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB){
        return !unTextoA.equals(unTextoB);
    }



    public static void main(String[] args) {
        System.out.println("\tEjercitando Funciones\n");
        // ejercicio 1
        int num = 7;
        String resultado = esPrimo(num);
        System.out.println("El numero "+ num + resultado);

        // ejercicio 2
        Scanner scanner = new Scanner(System.in);
        //

        System.out.println("Ingrese el primer numero: ");
        Integer unNumeroA = Integer.valueOf(scanner.next());
        System.out.println("Ingrese el segundo numero: ");
        Integer unNumeroB = Integer.valueOf(scanner.next());
        System.out.println("Ingrese el tercer numero: ");
        Integer unNumeroC = Integer.valueOf(scanner.next());
        //
        Integer mayor = maximoEntreTresNumeros(unNumeroA,unNumeroB,unNumeroC);
        System.out.println("El maximo es: " + mayor);

        // ejercicio 3
        System.out.println("Son distintas = "+cadenasDeTextoDistintas("Hola","chau"));
    }
}