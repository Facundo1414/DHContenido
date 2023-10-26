package patron;

import org.junit.jupiter.api.Test;

public class BosqueTest {

    @Test
    public void crearBosque(){
        ArbolFactory arbolFactory = new ArbolFactory();

        for (int i = 0; i < 500000; i++) {
            arbolFactory.plantarArbol("frutales");
        }
        for (int i = 0; i < 500000; i++) {
            arbolFactory.plantarArbol("ornamentales");
        }



        System.out.println("cantidad de arboles plantados = "  + arbolFactory.getArbolesPlantados());


        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memoria usada: " + (runtime.totalMemory() -
                runtime.freeMemory()) / (1024 * 1024));
    }

}
