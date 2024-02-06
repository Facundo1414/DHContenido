import dao.BD;
import model.Domicilio;
import model.Paciente;
import org.junit.jupiter.api.Test;
import service.PacienteService;

import java.time.LocalDate;

public class PacienteTest {

    @Test
    void savePaciente(){
        BD.crearTabla();
        Paciente paciente= new Paciente("Carlos","Maslatone","122334", LocalDate.of(2023,10,03),new Domicilio("Calle 1",2,"La Rioja","La Rioja"));
        PacienteService pacienteService= new PacienteService();
        pacienteService.guardarPaciente(paciente);

        System.out.println(pacienteService.buscarPorId(1));

    }

}
