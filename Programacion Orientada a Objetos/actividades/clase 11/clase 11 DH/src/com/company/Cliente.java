package com.company;

public class Cliente {
    private int numeroDeCliente;
    private String apellido;
    private String DNI;
    private String CUIT;

    public Cliente(int numeroDeCliente, String apellido, String DNI, String CUIT) {
        this.numeroDeCliente = numeroDeCliente;
        this.apellido = apellido;
        this.DNI = DNI;
        this.CUIT = CUIT;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "numeroDeCliente=" + numeroDeCliente +
                ", apellido='" + apellido + '\'' +
                ", DNI='" + DNI + '\'' +
                ", CUIT='" + CUIT + '\'' +
                '}';
    }
}
