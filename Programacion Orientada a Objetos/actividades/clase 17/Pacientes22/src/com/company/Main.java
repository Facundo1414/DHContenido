package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        try {
	    Paciente paciente=new Paciente("Juan","Perez","12345",new Date(2002, 8,14));
            System.out.println(paciente.getFechaInternacion());
        }catch (PacienteException e){
            System.err.println(e.toString());
        }
    }
}
