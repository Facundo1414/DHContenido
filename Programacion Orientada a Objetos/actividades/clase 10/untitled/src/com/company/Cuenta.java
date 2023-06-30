package com.company;

public abstract class Cuenta {
    private Cliente cliente;

    public Cuenta(Cliente cliente) {
        this.cliente = cliente;
    }


    public abstract void depositar(double dinero);
    public abstract double extraer(double dinero);
    public abstract String informarSaldo();
}
