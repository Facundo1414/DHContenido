package patronFacade;

import patronFacade.hotelesYvuelos.Vuelo;

import java.util.ArrayList;
import java.util.Date;

public class BusquedaVuelo implements Busqueda{
    private ArrayList<Vuelo> vuelos = new ArrayList<>();

    public BusquedaVuelo() {
        vuelos.add(new Vuelo("10/10/2023","20/10/2023","Cordoba","Santiago"));
        vuelos.add(new Vuelo("10/10/2023","20/10/2023","Tucuman","Santiago"));
    }

    @Override
    public String buscarReserva(String ciudad, String fecha) {
        for (Vuelo vuelo : vuelos) {
            if (vuelo.getOrigen().equalsIgnoreCase(ciudad) && vuelo.getFechaSalida().equalsIgnoreCase(fecha)){
                return "Vuelo a "+ ciudad + " para la fecha " + fecha;
            }
        }
        return "-";
    }
}
