package com.company;

import java.util.Date;

public class PacienteException extends Exception{
    public PacienteException() {
        super();
    }
    public PacienteException(String message) {
        super(message);
    }
    @Override
    public String toString() {
        return "Tipo Exception" + getClass().getName() + " error " +  getMessage();
    }
}
