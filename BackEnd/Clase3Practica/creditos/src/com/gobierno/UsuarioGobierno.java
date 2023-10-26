package com.gobierno;

public abstract class UsuarioGobierno {
    private Integer nivelDeAcceso;
    protected UsuarioGobierno sigUser;

    public UsuarioGobierno(Integer nivelDeAcceso) {
        this.nivelDeAcceso = nivelDeAcceso;
    }

    public abstract void leerDocumento(Documento documento);

    public UsuarioGobierno setSigUser(UsuarioGobierno sigUser) {
        this.sigUser = sigUser;
        return this;
    }

    public UsuarioGobierno getSigUser() {
        return sigUser;
    }
}
