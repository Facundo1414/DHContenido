package com.company;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(1,"Allende","312321","12323123");
        CajaDeAhorro cajaDeAhorro1 = new CajaDeAhorro(cliente1, 1000,200);
        cajaDeAhorro1.informarSaldo();
        cajaDeAhorro1.extraer(100);
        cajaDeAhorro1.depositar(300);
        cajaDeAhorro1.cobrarInteres();
        System.out.println(cajaDeAhorro1);
        //
        Date date = new Date(2002);
        Cheque cheque = new Cheque(1000,"Banco Nacion", date);
        //
        CuentaCorriente cuentaCorriente1 = new CuentaCorriente(cliente1, 2000, 200);
        cuentaCorriente1.informarSaldo();
        cuentaCorriente1.extraer(2100);
        cuentaCorriente1.informarSaldo();
        cuentaCorriente1.depositar(100);
        cuentaCorriente1.depositar(cheque);
        System.out.println(cuentaCorriente1);
    }
}