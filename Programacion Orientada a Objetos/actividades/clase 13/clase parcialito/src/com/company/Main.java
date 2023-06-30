package com.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Alumno alumno1 = new Alumno("Facu", "Allende", "32f3223");

        Examen parcial1 = new Parcial("POO", "interfaces", 4, alumno1, 2);
        Examen parcial2 = new Parcial("POO", "interfaces", 6, alumno1, 5);
        Examen final1 = new Final("POO", "interfaces", 3, alumno1, 3, "sdadas");
        Examen final2 = new Final("BDD", "...", 2, alumno1, 3, "sdadasDSA");

        //
        ArrayList<Examen> examenes = new ArrayList<Examen>();
        examenes.add(parcial1);
        examenes.add(parcial2);
        examenes.add(final1);
        examenes.add(final2);
//        for (Examen examene : examenes) {
//            System.out.println("Notas: " + examene.getNota());
//        }
        //
//
//        System.out.println(parcial1.isAprobado());
//        System.out.println(((Parcial) parcial1).isRecuperarParcial());
//        ((Parcial) parcial1).restarIntentos();

        //
    }
}