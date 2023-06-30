package com.company;

import java.util.Date;

public class Velero extends Emabarcacion {
    private int cantidadDeMastiles;

    public Velero(Capitan capitan, double precioBase, double valorAdicional, Date anioFabricacion, int eslora, int cantidadDeMastiles) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantidadDeMastiles = cantidadDeMastiles;
    }

    public boolean isGrande() {
        return cantidadDeMastiles > 4;
    }
}
