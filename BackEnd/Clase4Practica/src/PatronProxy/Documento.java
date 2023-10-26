package PatronProxy;

import java.util.ArrayList;
import java.util.List;

public class Documento {
    private int id;
    private String url;
    private String contenido;
    private List<String> usuarios;

    public Documento(int id, String url, String contenido, List<String> usuarios) {
        this.id = id;
        this.url = url;
        this.contenido = contenido;
        this.usuarios = usuarios;
    }

    public int getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public String getContenido() {
        return contenido;
    }

    public List<String> getUsuarios() {
        return usuarios;
    }
}
