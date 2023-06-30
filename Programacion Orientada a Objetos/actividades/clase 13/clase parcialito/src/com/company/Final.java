package com.company;

public class Final extends Examen implements Comparable<Final> {
    private Integer notaDeOral;
    private String descripcion;

    public Final(String titulo, String enunciado, Integer nota, Alumno alumno, Integer notaDeOral, String descripcion) {
        super(titulo, enunciado, nota, alumno);
        this.notaDeOral = notaDeOral;
        this.descripcion = descripcion;
    }

    public Integer getNotaDeOral() {
        return notaDeOral;
    }

    public void setNotaDeOral(Integer notaDeOral) {
        this.notaDeOral = notaDeOral;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int compareTo(Final o) {
        double promedioA = ((double) notaDeOral + (double) getNota()) / 2.0;
        double promedioB = ((double) o.getNotaDeOral() + (double) o.getNota()) / 2.0;
        double restultado = promedioA - promedioB;
        if (restultado > 0) {
            return 1;
        } else if (restultado < 0) {
            return -1;}
            return 0;

    }



}
