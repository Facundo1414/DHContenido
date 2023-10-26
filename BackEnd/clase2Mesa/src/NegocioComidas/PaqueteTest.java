package NegocioComidas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PaqueteTest {

    @Test
    void armandoPaquete(){
        Menu menu1 = new MenuClasico(30);
        Menu menu2 = new MenuClasico(20);
        Menu menu3 = new MenuVegetariano(100);
        Menu menu4 = new MenuVegetariano(50);
        Menu menu5 = new MenuInfantil(30);

        //

        List<Menu> list = new ArrayList<>();

        list.add(menu1);
        list.add(menu2);
        list.add(menu3);
        list.add(menu4);
        list.add(menu5);

        //
        Paquete paquete = new Paquete(list);
        boolean response = paquete.armarMenu();

        Assertions.assertTrue(response);
    }

}
