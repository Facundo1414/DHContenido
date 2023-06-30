package com.company;

import java.util.ArrayList;
import java.util.Objects;

public class Reserva {
    private String codigo;
    private ArrayList<Estacion> recorrido = new ArrayList<>();
    private Integer cantidadDePasajeros;

    public Reserva(String codigo, Integer cantidadDePasajeros, int numEstacionPartida, int numEstacionLlegada) {
        this.codigo = codigo;
        this.cantidadDePasajeros = cantidadDePasajeros;
        addEstacionPartida(numEstacionPartida);
        addEstacionDestino(numEstacionLlegada);
    }
    private void addEstacionPartida(int numEstacion){
        recorrido.add(0, new Estacion(numEstacion));
    }
    public void addEstacion(int numEstacion){
        recorrido.add(new Estacion(numEstacion));
    }
    private void addEstacionDestino(int numEstacion){
        recorrido.add(recorrido.size()-1,new Estacion(numEstacion));
    }

    public int precio(){
        int precioVal = cantidadDePasajeros * 50;
        int ultimaPos = recorrido.size() - 1;
        if (Objects.equals(recorrido.get(0).getNombre(), "Buenos Aires") && Objects.equals(recorrido.get(ultimaPos).getNombre(), "Buenos Aires"))
        { precioVal -= precioVal*0.20;  }
        return precioVal;
    }

    public ArrayList<Estacion> getRecorrido() {
        return recorrido;
    }
}
