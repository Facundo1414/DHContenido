import dao.BD;
import dao.OdontologoDAOH2;
import dao.OdontologoDAOHash;
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

    @Test
    void odontologoDAOHASH(){
        System.out.println("\n\n");
        BD.crearTabla();
        Odontologo odontologo = new Odontologo(312321231,"Jorge","Sanchez");
        Odontologo odontologo2 = new Odontologo(222121,"Samuel","Gomez");
        OdontologoService odontologoService = new OdontologoService(new OdontologoDAOHash());

        odontologoService.guardar(odontologo);
        odontologoService.listarOdontologos();

        //resultado
        Odontologo odontologorestulado = odontologoService.guardar(odontologo2);

        //
        Assertions.assertEquals(odontologorestulado.getId(),2);

    }
}
