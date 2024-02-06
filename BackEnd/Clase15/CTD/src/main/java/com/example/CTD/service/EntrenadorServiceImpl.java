package com.example.CTD.service;

import com.example.CTD.model.Entrenador;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EntrenadorServiceImpl implements EntrenadorService{

    @Override
    public List<Entrenador> obtenerListEntrenadores() {
        // aca se deberia conectar con la clase de DAO para conectarse con la DB
        return Arrays.asList(new Entrenador("Jose"), new Entrenador("Marcelo"), new Entrenador("Manuel"));
    }
}
