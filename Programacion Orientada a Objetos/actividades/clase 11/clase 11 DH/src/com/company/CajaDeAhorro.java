package com.company;

public class CajaDeAhorro extends Cuenta {
    private double tasaDeInteres;

    public CajaDeAhorro(Cliente cliente, double saldo, double tasaDeInteres) {
        super(cliente, saldo);
        this.tasaDeInteres = tasaDeInteres;
    }

    @Override
    public void depositar(double monto) {
        setSaldo(getSaldo() + monto);
    }

    @Override
    public double extraer(double monto) {
        if (getSaldo() >= monto) {
            setSaldo(getSaldo() - monto);
            return monto;
        }
        return 0;
    }

    public void cobrarInteres() {
        setSaldo(getSaldo() + tasaDeInteres);
        tasaDeInteres = 0;
    }

    @Override
    public String toString() {
        return "CajaDeAhorro{" +
                "tasaDeInteres=" + tasaDeInteres +
                "} " + super.toString();
    }
}
