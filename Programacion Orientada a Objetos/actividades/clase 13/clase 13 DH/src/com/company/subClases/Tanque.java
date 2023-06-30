package com.company.subClases;

import com.company.SistemaArmas;
import com.company.interfaces.Atacar;
import com.company.interfaces.Defender;


public class Tanque extends SistemaArmas implements Atacar, Defender {

    public Tanque(Integer energia) {
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



}
