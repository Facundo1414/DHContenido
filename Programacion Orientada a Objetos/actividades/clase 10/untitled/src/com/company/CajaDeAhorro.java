package com.company;

public class CajaDeAhorro extends Cuenta{
    private double saldo;
    private double tasaDeInteres;


    public CajaDeAhorro(Cliente cliente, double saldo, double tasaDeInteres) {
        super(cliente);
        this.saldo = saldo;
        this.tasaDeInteres = tasaDeInteres;
    }

    @Override
    public void depositar(double dinero) {
        saldo += dinero;
    }

    @Override
    public double extraer(double dinero) {
        if (saldo >= dinero){
            saldo -= dinero;
            return dinero;
        }
        return 0;
    }

    @Override
    public String informarSaldo() {
        return "Su saldo es "+ saldo;
    }

    public void cobrarIntereses(){
        saldo += tasaDeInteres;
        tasaDeInteres = 0;
    }

    //

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTasaDeInteres(double tasaDeInteres) {
        this.tasaDeInteres = tasaDeInteres;
    }
}
