package patronFlyweight;

import java.util.HashMap;

public class ListaDeReproduccion {
    private HashMap<String, Cancion> nuevaLista = new HashMap<>();
    private String nombre;

    public ListaDeReproduccion(String nombre) {
        this.nombre = nombre;
    }

    public HashMap<String, Cancion> getNuevaLista() {
        return nuevaLista;
    }

    public Cancion buscarCancion(Cancion cancion){
        nuevaLista.putIfAbsent(cancion.getNombre(), cancion);
        return cancion;
    }

    public void deleteCancion(Cancion cancion){
        nuevaLista.remove(cancion.getNombre());
    }

    public String getNombre() {
        return nombre;
    }
}
