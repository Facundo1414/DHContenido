package com.company;

public class CuentaCorriente extends Cuenta{
    private double saldo;
    private double montoAutorizado;

    public CuentaCorriente(Cliente cliente, double saldo, double montoAutorizado) {
        super(cliente);
        this.saldo = saldo;
        this.montoAutorizado = montoAutorizado;
    }

    @Override
    public void depositar(double dinero) {
        saldo += dinero;
    }

    public void depositar(Cheque cheque){
        saldo += cheque.getMonto();
    }

    @Override
    public double extraer(double dinero) {
        if (saldo >= dinero || saldo + montoAutorizado >= dinero ){
            saldo -= dinero;
            return dinero;
        }
        return 0;

    }

    @Override
    public String informarSaldo() {
        return "Su saldo es "+ saldo;
    }

    //


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setMontoAutorizado(double montoAutorizado) {
        this.montoAutorizado = montoAutorizado;
    }
}
