package com.company;

import java.util.ArrayList;

public class Puerto {
    private ArrayList<Contenedor> contenedores;

    public Puerto() {
        this.contenedores = new ArrayList<>();
    }

    public void addContenedor(Contenedor contenedor) {
        contenedores.add(contenedor);
    }

    public void mostrarContenedoresOrdenados() {
        contenedores.sort(null);
        for (Contenedor c : contenedores) {
            System.out.println(c);
        }
    }


    public int cantidadDeContenedoresPeligrosos(){
        int cantidad = 0;
        for (Contenedor c:contenedores) {
            if (c.getPaisDeProcedencia().equalsIgnoreCase("desconocido")){
                cantidad+=1;
            };
        }
        return cantidad;
    }



}
