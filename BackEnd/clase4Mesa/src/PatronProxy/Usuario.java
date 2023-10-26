package PatronProxy;

public class Usuario {
    private String id;
    private String tipoDeUsuario;

//    enum TipoUsuario {
//        Free,
//        Premium
//    }


    public Usuario(String id, String tipoDeUsuario) {
        this.id = id;
        this.tipoDeUsuario = tipoDeUsuario;
    }

    public String getId() {
        return id;
    }

    public String getTipoDeUsuario() {
        return tipoDeUsuario;
    }
}
