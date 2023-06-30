package com.company;

public class Main {
    public static void main(String[] args) {
        // Creacion De reservas
        Reserva reserva1 = new Reserva("AAA31", 100, 1, 2);
        Reserva reserva2 = new Reserva("AAA32", 100, 1, 7);
        Reserva reserva3 = new Reserva("AAA33", 100, 7, 1);
        Reserva reserva4 = new Reserva("AAA34", 20, 2, 2);
        Reserva reserva5 = new Reserva("AAA35", 50, 3, 2);
        Reserva reserva6 = new Reserva("AAA36", 50, 2, 2);
        Reserva reserva7 = new Reserva("AAA37", 20, 0, 2);

        //
        Empresa empresa = new Empresa();
        empresa.addReserva(reserva1);
        empresa.addReserva(reserva2);
        empresa.addReserva(reserva3);
        empresa.addReserva(reserva4);
        empresa.addReserva(reserva5);
        empresa.addReserva(reserva6);
        empresa.addReserva(reserva7);
        //
        System.out.println("Precio de la reserva 1 : " + reserva1.precio());
        System.out.println("Precio de la reserva 2 con descuento : " + reserva2.precio());
        System.out.println("Precio de la reserva 3 con descuento: " + reserva3.precio());
        //
        System.out.println("recaudacion total: " + empresa.recaudacionTotal());
        //
        System.out.println("Cantidad de veces recorrida la estacion de BS AS : " + empresa.cantidadDeVecesRecorrida(1));
        System.out.println("Cantidad de veces recorrida la estacion x : " + empresa.cantidadDeVecesRecorrida(9));


    }
}