package com.c2.ClinicaOdontologica.security;

import com.c2.ClinicaOdontologica.entities.*;
import com.c2.ClinicaOdontologica.repository.UserRepository;
import com.c2.ClinicaOdontologica.service.OdontologoService;
import com.c2.ClinicaOdontologica.service.PacienteService;
import com.c2.ClinicaOdontologica.service.TurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private OdontologoService odontologoService;
    @Autowired
    private PacienteService pacienteService;
    @Autowired
    private TurnoService turnoService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String passwordCifrado = passwordEncoder.encode("admin"); // asi se cifra la password
        String passwordCifrado2 = passwordEncoder.encode("user");

        userRepository.save(new Usuario("Facu","admin","admin@gmail.com",passwordCifrado, AppUserRoles.ROLE_ADMIN));
        userRepository.save(new Usuario("Facu","user","user@gmail.com",passwordCifrado2,AppUserRoles.ROLE_USER));

        //
//        Odontologo odontologo = new Odontologo("M111","Jose","Lopez");
//        odontologoService.registrarOdontologo(odontologo);
//
//        Paciente paciente = new Paciente("Ariel","Allende","13344", LocalDate.of(2021,10,27),new Domicilio("libertad",2222,"Cordoba","Cordoba"),"ariel@gmail.com");
//        pacienteService.registrarPaciente(paciente);
//
//        Turno turno = new Turno(paciente,odontologo,LocalDate.of(2020,03,13));
//        turnoService.guardarTurno(turno);
    }
}
