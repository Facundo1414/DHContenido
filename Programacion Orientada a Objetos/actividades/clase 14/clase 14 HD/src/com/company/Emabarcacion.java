package com.company;

import java.util.Date;

public abstract class Emabarcacion {
    private Capitan capitan;
    private double precioBase;
    private double valorAdicional;
    private Date anioFabricacion;
    private int eslora;

    public Emabarcacion(Capitan capitan, double precioBase, double valorAdicional, Date anioFabricacion, int eslora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;
    }

    public double calcularMontoAlquiler(){
        double montoAlquiler;
        if (anioFabricacion.getYear() > 2020){
            return montoAlquiler = precioBase + valorAdicional;
        }
        return  montoAlquiler = precioBase;
    }

    @Override
    public String toString() {
        return "Emabarcacion{" +
                "capitan=" + capitan +
                ", precioBase=" + precioBase +
                ", valorAdicional=" + valorAdicional +
                ", anioFabricacion=" + anioFabricacion +
                ", eslora=" + eslora +
                '}';
    }
}
