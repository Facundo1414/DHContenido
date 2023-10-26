import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Leon leon = new Leon("jose",5,true);
//        leon.esMayorA10();
        
        // Caso con mas de 5 elementos
        System.out.println("Caso 1");
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            arrayList1.add(i);
        }
        App app1 = new App(arrayList1);
        app1.check();

        // Caso con mas de 10 elementos
        System.out.println("\nCaso 2");
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            arrayList2.add(i);
        }
        App app2 = new App(arrayList2);
        app2.check();

        // Caso con 0 elementos
        System.out.println("\nCaso 3");
        ArrayList<Integer> arrayList3 = new ArrayList<>();
        App app3 = new App(arrayList3);
        app3.check();
    }
}
