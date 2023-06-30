package com.company;

public class CuentaCorriente extends Cuenta{
    private double montoAutorizado;

    public CuentaCorriente(Cliente cliente, double saldo, double montoAutorizado) {
        super(cliente, saldo);
        this.montoAutorizado = montoAutorizado;
    }


    @Override
    public void depositar(double monto) {
        setSaldo(getSaldo() + monto);
    }

    public void depositar(Cheque cheque){
        setSaldo(getSaldo() + cheque.getMonto());
    }

    @Override
    public double extraer(double monto) {
        if (monto <= getSaldo() + montoAutorizado){
            setSaldo(getSaldo()- monto);
            return monto;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "montoAutorizado=" + montoAutorizado +
                "} " + super.toString();
    }
}
