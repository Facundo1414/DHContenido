package patronFacade;

import patronFacade.hotelesYvuelos.Hotel;
import patronFacade.hotelesYvuelos.Vuelo;

import java.util.ArrayList;

public class BusquedaHotel implements Busqueda{
    private ArrayList<Hotel> hotels = new ArrayList<>();

    public BusquedaHotel() {
        hotels.add(new Hotel("10/10/2023","20/10/2023","Cordoba"));
        hotels.add(new Hotel("15/05/2023","20/10/2023","Tucuman"));

    }

    @Override
    public String buscarReserva(String ciudad, String fecha) {
        for (Hotel hotel : hotels) {
            if (hotel.getCiudad().equalsIgnoreCase(ciudad) && hotel.getFechaEntrada().equalsIgnoreCase(fecha)){
                return "Hotel en la ciudad de " + ciudad;
            }
        }

        return "-";
    }
}
