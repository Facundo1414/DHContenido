package com.company;

public class Contenedor implements Comparable<Contenedor> {
    private int id;
    private String paisDeProcedencia; // nombre o desconocido
    private boolean contieneMaterialPeligroso;


    public Contenedor(int id, String paisDeProcedencia, boolean contieneMaterialPeligroso) {
        this.id = id;
        this.paisDeProcedencia = paisDeProcedencia;
        this.contieneMaterialPeligroso = contieneMaterialPeligroso;
    }

    public int getId() {
        return id;
    }

    public String getPaisDeProcedencia() {
        return paisDeProcedencia;
    }

    @Override
    public int compareTo(Contenedor o) {
        return id - o.getId();
    }

    @Override
    public String toString() {
        return "Contenedor{" +
                "id=" + id +
                ", paisDeProcedencia='" + paisDeProcedencia + '\'' +
                ", contieneMaterialPeligroso=" + contieneMaterialPeligroso +
                '}';
    }
}
