import dao.BD;
import dao.OdontologoDAOH2;
import model.Odontologo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.OdontologoService;

public class OdontologoTest {

    @Test
    void odontologoDAOH2(){

        BD.crearTabla();
        Odontologo odontologo = new Odontologo(312321231,"Jorge","Sanchez");
        OdontologoService odontologoService = new OdontologoService(new OdontologoDAOH2());

        //resultado
        Odontologo odontologorestulado = odontologoService.guardar(odontologo);

        odontologoService.listarOdontologos();
        //
        Assertions.assertEquals(odontologorestulado.getId(),3);


    }


}
