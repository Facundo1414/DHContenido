package com.gobierno;

import com.dh.banco.service.EmpleadoBanco;
import com.dh.banco.service.impl.Director;
import com.dh.banco.service.impl.EjecutivoCuenta;
import com.dh.banco.service.impl.Gerente;
import com.gobierno.usuarios.Diputado;
import com.gobierno.usuarios.Ministro;
import com.gobierno.usuarios.Presidente;
import org.junit.jupiter.api.Test;

public class mensajeTest {
    @Test
    void envioMensajeAlGobierno(){
        Documento documentoReservado = new Documento("saddsa",1);
        Documento documentoSecreto = new Documento("saddsa",2);
        Documento documentoMuysecreto = new Documento("saddsa",3);


        UsuarioGobierno manejadorBase = new Diputado().setSigUser(new Ministro().setSigUser(new Presidente()));

        manejadorBase.leerDocumento(documentoSecreto);

    }
}
