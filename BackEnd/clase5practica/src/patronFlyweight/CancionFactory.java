package patronFlyweight;

import java.util.HashMap;
import java.util.Objects;

public class CancionFactory {
    private static final HashMap<String, ListaDeReproduccion> listas = new HashMap<>();


    public Cancion getCancion(Cancion cancion, String nombrePlayList){

        if (listas.isEmpty()) {
            crearLista(nombrePlayList);
        }
        for (ListaDeReproduccion value : listas.values()) {
            if (!value.getNombre().equalsIgnoreCase(nombrePlayList)){
                crearLista(nombrePlayList);
            }
            System.out.println(cancion.getNombre() +" de la lista: " + value.getNombre());
            return value.buscarCancion(cancion);
        }
        return cancion;
    }

    private void crearLista(String nombre){
        listas.put(nombre,new ListaDeReproduccion(nombre));
    }


    public void deleteCancion(Cancion cancion){
        for (ListaDeReproduccion value : listas.values()) {
            value.deleteCancion(cancion);
        }
    }
    
}
