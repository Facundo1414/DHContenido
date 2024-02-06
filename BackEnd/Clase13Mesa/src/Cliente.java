import dao.BD;
import dao.OdontologoDAOH2;
import model.Domicilio;
import model.Odontologo;
import model.Paciente;
import org.junit.jupiter.api.Assertions;
import service.OdontologoService;
import service.PacienteService;

import java.time.LocalDate;
import java.util.Date;

public class Cliente {
    public static void main(String[] args) {
        BD.crearTabla();
        Paciente paciente= new Paciente("Carlos","Maslatone","122334", LocalDate.of(2023,10,03),new Domicilio("Calle 1",2,"La Rioja","La Rioja"));
        PacienteService pacienteService= new PacienteService();
        pacienteService.guardarPaciente(paciente);


    }
}
