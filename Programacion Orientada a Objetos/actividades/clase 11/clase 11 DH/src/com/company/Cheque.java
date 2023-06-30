package com.company;

import java.util.Date;

public class Cheque {
    private double monto;
    private String bancoEmisor;
    private Date fechaDePago;

    public Cheque(double monto, String bancoEmisor, Date fechaDePago) {
        this.monto = monto;
        this.bancoEmisor = bancoEmisor;
        this.fechaDePago = fechaDePago;
    }

    public double getMonto() {
        return monto;
    }

}
