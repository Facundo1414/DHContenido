package patron;

import java.util.HashMap;
import java.util.Objects;

public class ArbolFactory {
    private static final HashMap<String, Arbol> bosque = new HashMap<>();
    private static int arbolesPlantados;

    public void plantarArbol(final String tipoDeArbol){
        arbolesPlantados++;

        Arbol arbol = bosque.get(tipoDeArbol);

        if (Objects.isNull(arbol)){
            switch (tipoDeArbol.toLowerCase()){
                case "ornamentales":
                    arbol = new Arbol(200,400,"verde");
                    bosque.put("ornamentales",arbol);
                case "frutales":
                    arbol = new Arbol(500,300,"rojo");
                    bosque.put("frutales",arbol);

                case "florales":
                    arbol = new Arbol(100,200,"celeste");
                    bosque.put("florales",arbol);
                default:;
            }
            System.out.println("creando arbol "+ tipoDeArbol);
        }

    }

    public int getArbolesPlantados() {
        return arbolesPlantados;
    }
}
