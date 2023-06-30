package com.company;

public class Cliente {
    private int numeroDeCliente;
    private String apellido;
    private String dni;
    private String cuit;

    public Cliente(int numeroDeCliente, String apellido, String dni, String cuit) {
        this.numeroDeCliente = numeroDeCliente;
        this.apellido = apellido;
        this.dni = dni;
        this.cuit = cuit;
    }

    public int getNumeroDeCliente() {
        return numeroDeCliente;
    }

    public void setNumeroDeCliente(int numeroDeCliente) {
        this.numeroDeCliente = numeroDeCliente;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }
}
