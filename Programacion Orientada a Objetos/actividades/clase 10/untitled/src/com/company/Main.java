package com.company;


import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Cliente juancito = new Cliente(1, "Rodriguez", "25423523", "22-25423523-2");

        CajaDeAhorro juancitoCaja = new CajaDeAhorro(juancito, 1000, 200);

        juancitoCaja.depositar(300);
        System.out.println(juancitoCaja.extraer(300));
        System.out.println(juancitoCaja.informarSaldo());
        juancitoCaja.cobrarIntereses();
        System.out.println(juancitoCaja.informarSaldo());
        //
        Date date = new Date(2002, Calendar.MAY,23);
        Cheque cheque = new Cheque(500,"Santander", date);
        //
        CuentaCorriente juancitoLaburo = new CuentaCorriente(juancito,1200,400);
        juancitoLaburo.depositar(300);
        juancitoLaburo.depositar(cheque);
        System.out.println(juancitoLaburo.extraer(2300));
        System.out.println(juancitoLaburo.informarSaldo());


    }
}
