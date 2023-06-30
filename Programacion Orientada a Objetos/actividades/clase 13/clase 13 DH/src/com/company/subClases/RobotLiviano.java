package com.company.subClases;

import com.company.SistemaArmas;
import com.company.interfaces.Atacar;
import com.company.interfaces.Defender;
import com.company.interfaces.Volar;

public class RobotLiviano extends SistemaArmas implements Atacar, Defender, Volar {

    public RobotLiviano(Integer energia) {
        super(energia);
    }

    @Override
    public void mostrar() {

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
