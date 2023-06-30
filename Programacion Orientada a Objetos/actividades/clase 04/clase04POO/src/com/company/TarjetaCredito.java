package com.company;

public class TarjetaCredito {
    private String numeroTarjeta;
    private double montoLimite;
    private double saldoConsumido;
    private double saldoImpago;
    private int cantidadMaximaCuotas;
    private double interes;

    public TarjetaCredito(){}

    public TarjetaCredito(String numeroTarjeta, double montoLimite, double saldoConsumido, double saldoImpago, int cantidadMaximaCuotas, double interes) {
        this.numeroTarjeta = numeroTarjeta;
        this.montoLimite = montoLimite;
        this.saldoConsumido = saldoConsumido;
        this.saldoImpago = saldoImpago;
        this.cantidadMaximaCuotas = cantidadMaximaCuotas;
        this.interes = interes;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public double getMontoLimite() {
        return montoLimite;
    }

    public double getSaldoConsumido() {
        return saldoConsumido;
    }

    public double getSaldoImpago() {
        return saldoImpago;
    }

    public int getCantidadMaximaCuotas() {
        return cantidadMaximaCuotas;
    }

    public double getInteres() {
        return interes;
    }

    //
    public void comprar(double importe, int cantidadCuotas){}
    public void pagar(double importe){}

}
