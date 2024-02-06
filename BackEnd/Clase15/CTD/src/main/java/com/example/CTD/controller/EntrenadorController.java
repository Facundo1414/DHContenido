package com.example.CTD.controller;

import com.example.CTD.model.Entrenador;
import com.example.CTD.service.EntrenadorService;
import com.example.CTD.service.EntrenadorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/entrenador")
public class EntrenadorController {
    // necesito asociarme con el service
    private EntrenadorService entrenadorService ;

    @Autowired
    // genera un constructor de ser necesario


    public EntrenadorController(EntrenadorService entrenadorService) {
        this.entrenadorService = entrenadorService;
    }

    @GetMapping("/lista")
    public List<Entrenador> obtenerLista(){
        return entrenadorService.obtenerListEntrenadores();
    }
}
