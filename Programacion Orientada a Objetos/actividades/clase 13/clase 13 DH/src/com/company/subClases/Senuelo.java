package com.company.subClases;

import com.company.SistemaArmas;
import com.company.interfaces.Atacar;
import com.company.interfaces.Defender;
import com.company.interfaces.Volar;

public class Senuelo extends SistemaArmas implements Atacar, Defender {

    public Senuelo(Integer energia) {
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
