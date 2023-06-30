package com.company;

import com.company.subClases.RobotPesado;
import com.company.subClases.Tanque;

public class Main {
    public static void main(String[] args) {
        SistemaArmas robotHeavy01 = new RobotPesado(100);
        SistemaArmas panzer3Tank = new Tanque(1000);
        SistemaArmas tigerTank = new Tanque(500);

        // mostrar vida
        robotHeavy01.mostrar();


        // comparando energia
        if (panzer3Tank.compareTo(tigerTank) > 0){
            mostrarEnergia("Mayor");
        } else if (panzer3Tank.compareTo(tigerTank) < 0) {
            mostrarEnergia("Menor");
        }
        else {mostrarEnergia("Igual");}
    }


    public static void mostrarEnergia(String string){
        System.out.println("Panzer tank tiene "+ string +" Energia que Tiger Tank");
    }
}