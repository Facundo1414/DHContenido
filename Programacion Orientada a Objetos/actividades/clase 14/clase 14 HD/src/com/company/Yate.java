package com.company;

import java.util.Date;

public class Yate extends Emabarcacion implements Comparable<Yate>{
    private int cantidadDeCamarotes;

    public Yate(Capitan capitan, double precioBase, double valorAdicional, Date anioFabricacion, int eslora, int cantidadDeCamarotes) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantidadDeCamarotes = cantidadDeCamarotes;
    }

    @Override
    public int compareTo(Yate o) {
        return this.cantidadDeCamarotes - o.getCantidadDeCamarotes();
    }


    public int getCantidadDeCamarotes() {
        return cantidadDeCamarotes;
    }

    @Override
    public String toString() {
        return "Yate{" +
                "cantidadDeCamarotes=" + cantidadDeCamarotes +
                "} " + super.toString();
    }
}
