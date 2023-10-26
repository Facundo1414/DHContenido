package com.gobierno.usuarios;

import com.gobierno.Documento;
import com.gobierno.UsuarioGobierno;

public class Ministro extends UsuarioGobierno {

    public Ministro() {
        super(2);
    }

    @Override
    public void leerDocumento(Documento documento) {
        if (documento.getTipo() <= 2){
            System.out.println("Leyendo documento como Ministro");
        }
        else {
            System.out.println("NO PUEDO LEER EL DOCUMENTO COMO Ministro");
        }
        if (this.sigUser != null){
            this.sigUser.leerDocumento(documento);
        }
    }
}
