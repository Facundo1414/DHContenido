package com.company;

public class Nave extends Objeto {
    private double velocidad;
    private int vida;

    public Nave(int posX, int posY, char direccion, double velocidad, int vida) {
        super(posX, posY, direccion);
        this.velocidad = velocidad;
        this.vida = vida;
    }


    @Override
    public void irA(int posX, int posY, char direccion) {


        if (!chequeoDire(direccion)){ // si la dire no coincide
            girar(direccion);
            if (direccion == 'S'{
                
                setPosY();
            }
            else {
                girar(direccion);
                setPosY(posY);
            }

        }





    }

    private boolean chequeoDire(char direccion){
        return direccion == getDireccion();
    }

    // Mover nave si la direccion coincide con la actual
    //    si no coincide girar la nave y luego mover
    // si la direccion no coincide con la pos enviada girar tambien


    private void girar(char direccion) {
        setDireccion(direccion);
    }

    public void restaVida(int valor) {
        vida -= valor;
    }


    @Override
    public String toString() {
        return "Nave{" +
                "velocidad=" + velocidad +
                ", vida=" + vida +
                "} " + super.toString();
    }

}
