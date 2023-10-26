package patronFacade;

import java.util.Date;

public class Facade implements Busqueda{


    @Override
    public String buscarReserva(String ciudad, String fecha) {
        BusquedaVuelo busquedaVuelo = new BusquedaVuelo();
        String vuelo = busquedaVuelo.buscarReserva(ciudad,fecha);

        BusquedaHotel busquedaHotel = new BusquedaHotel();
        String hotel = busquedaHotel.buscarReserva(ciudad,fecha);

        if (vuelo.equals("-") || hotel.equals("-")){
            return "No hay disponibilidad para la ciudad/fecha elegida";
        }
        return vuelo + " ::: " +  hotel ;
    }
}
