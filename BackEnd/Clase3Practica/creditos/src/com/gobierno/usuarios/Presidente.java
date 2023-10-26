package com.gobierno.usuarios;

import com.gobierno.Documento;
import com.gobierno.UsuarioGobierno;

public class Presidente extends UsuarioGobierno {

    public Presidente() {
        super(3);
    }

    @Override
    public void leerDocumento(Documento documento) {
        if (documento.getTipo() <= 3){
            System.out.println("Leyendo documento como Presidente");
        }
        else {
            System.out.println("NO PUEDO LEER EL DOCUMENTO COMO Presidente");
        }
        if (this.sigUser != null){
            this.sigUser.leerDocumento(documento);
        }
    }
}
