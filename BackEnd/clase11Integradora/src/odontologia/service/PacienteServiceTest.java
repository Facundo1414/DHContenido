package odontologia.service;

import odontologia.dao.PacienteDAOH2;
import odontologia.entities.Domicilio;
import odontologia.entities.Paciente;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

public class PacienteServiceTest {
    private static final Logger logger= Logger.getLogger(PacienteServiceTest.class);

    @Test
    void guardarPaciente(){
        Domicilio domicilio1 = new Domicilio("libertador",1221,"Cordoba","Cordoba");
        Paciente paciente1 = new Paciente(1L,"Allende","Facundo","231.2312312.1","12/05/2019",domicilio1);

        PacienteService pacienteService = new PacienteService(new PacienteDAOH2());

        pacienteService.guardar(paciente1);


    }
}
