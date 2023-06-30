package com.company;

public abstract class Cuenta {
    private Cliente cliente;
    private double saldo;

    public Cuenta(Cliente cliente, double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }


    public abstract void depositar(double monto);

    public abstract double extraer(double monto);

    public  void informarSaldo(){
        System.out.println("Su saldo es: $ "+ saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    @Override
    public String toString() {
        return "Cuenta{" +
                "cliente=" + cliente +
                ", saldo=" + saldo +
                '}';
    }
}
