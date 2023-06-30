package com.company;

public class PacienteException extends Exception{

    public PacienteException() {
        super();
    }

    public PacienteException(String message) {
        super(message);
    }

    public String toString() {
        return "Tipo Exception" + getClass().getName() + " error " +  getMessage();
    }

}
