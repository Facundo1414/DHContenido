package com.example.ClinicaOdontologica;

import com.example.ClinicaOdontologica.dao.BD;
import com.example.ClinicaOdontologica.dao.OdontologoDAOH2;
import com.example.ClinicaOdontologica.model.Odontologo;
import com.example.ClinicaOdontologica.service.OdontologoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
 public class ClinicaOdontologicaApplication {

	public static void main(String[] args) {



		SpringApplication.run(ClinicaOdontologicaApplication.class, args);

	}

}
