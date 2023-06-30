package com.company;


public abstract class SistemaArmas implements Comparable<SistemaArmas> {
    private Integer energia;

    public SistemaArmas(Integer energia) {
        this.energia = energia;
    }

    public abstract void mostrar();

    public Integer getEnergia() {
        return energia;
    }

    public void setEnergia(Integer energia) {
        this.energia = energia;
    }

    @Override
    public int compareTo(SistemaArmas o) {
        return energia - o.getEnergia();
    }
}
