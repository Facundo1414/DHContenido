package archivos;

import java.util.ArrayList;

public class Carpeta implements Archivo{
    private ArrayList<Archivo> archivos;

    public Carpeta() {
        this.archivos = new ArrayList<>();
    }


    @Override
    public void agregar(String name) {
        archivos.add(name);
    }

    @Override
    public void eliminar(String name) {

    }
}
