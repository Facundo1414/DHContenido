package com.company;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Reserva> listaDeReservas;

    public Empresa() {
        this.listaDeReservas = new ArrayList<Reserva>();
    }

    public void addReserva(Reserva reserva) {
        listaDeReservas.add(reserva);
    }

    public int recaudacionTotal() {
        int total = 0;
        for (Reserva r : listaDeReservas) {
            total += r.precio();
        }
        return total;
    }

    public int cantidadDeVecesRecorrida(int estacion) {
        int cantidadDePersonas = 0;
        Estacion estacionx = new Estacion(estacion);
        for (int i = 0; i < listaDeReservas.size(); i++) {
            if (estacionx.getNombre() == listaDeReservas.get(i).getRecorridoNombre())
            {   cantidadDePersonas += listaDeReservas.get(i).getRecorridoNombre()}
        }
        return cantidadDePersonas;
    }
}
