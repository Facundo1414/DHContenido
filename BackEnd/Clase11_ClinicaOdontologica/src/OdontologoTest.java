import dao.BD;
import dao.OdontologoDAOH2;
import model.Odontologo;
import org.junit.jupiter.api.Test;
import service.OdontologoService;

public class OdontologoTest {

    @Test
    void guardarodontologoDAOH2(){

        BD.crearTabla();

        Odontologo odontologo = new Odontologo(312321231,"Jorge","Sanchez");
        OdontologoService odontologoService = new OdontologoService(new OdontologoDAOH2());

        odontologoService.guardar(odontologo);

    }
}
