package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        try {
            Date fechaInternacion = new Date();
            System.out.println(fechaInternacion);
            Paciente paciente=new Paciente("Juan","Perez","12345",fechaInternacion);
        }catch (PacienteException e){
            System.err.println(e);
        }
    }
}
