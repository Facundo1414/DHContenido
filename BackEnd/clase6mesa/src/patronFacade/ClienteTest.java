package patronFacade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import patronFacade.hotelesYvuelos.Hotel;
import patronFacade.hotelesYvuelos.Vuelo;

public class ClienteTest {

    @Test
    void reserva(){
        Facade facade = new Facade();

        String response = facade.buscarReserva("Cordoba","10/10/2023");
        Assertions.assertEquals(response,"Vuelo a Cordoba para la fecha 10/10/2023 ::: Hotel en la ciudad de Cordoba");
        System.out.println(response);
    }

    @Test
    void reservaErronea(){
        Facade facade = new Facade();

        String response = facade.buscarReserva("Tucuman","10/10/2023");
        Assertions.assertEquals(response,"No hay disponibilidad para la ciudad/fecha elegida");
        System.out.println(response);

    }


}
