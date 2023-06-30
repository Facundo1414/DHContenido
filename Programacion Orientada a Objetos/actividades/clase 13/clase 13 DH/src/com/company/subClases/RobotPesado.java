package com.company.subClases;

import com.company.SistemaArmas;
import com.company.interfaces.Atacar;
import com.company.interfaces.Defender;
import com.company.interfaces.Volar;

public class RobotPesado extends SistemaArmas implements Atacar, Defender, Volar {

    public RobotPesado(Integer energia) {
        super(energia);
    }

    @Override
    public void mostrar() {
        System.out.println("Cantidad de Energia del Robot Pesado = "+ getEnergia());
    }

    @Override
    public void atacar() {

    }

    @Override
    public void defender() {

    }

    @Override
    public void volar() {

    }
}
