package com.gobierno.usuarios;

import com.gobierno.Documento;
import com.gobierno.UsuarioGobierno;

public class Diputado extends UsuarioGobierno {

    public Diputado() {
        super(1);
    }

    @Override
    public void leerDocumento(Documento documento) {
        if (documento.getTipo() == 1){
            System.out.println("Leyendo documento como diputado");
        }
        else {
            System.out.println("NO PUEDO LEER EL DOCUMENTO COMO DIPUTADO");
        }
        if (this.sigUser != null){
            this.sigUser.leerDocumento(documento);
        }
    }
}
