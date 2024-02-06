package com.futbol.demo.controller;


import com.futbol.demo.model.Jugador;
import com.futbol.demo.service.JugadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("jugadores")
public class JugadorController {
    private final JugadorService jugadorService;

    @Autowired
    public JugadorController(JugadorService jugadorService) {
        this.jugadorService = jugadorService;
    }

    @PostMapping
    public ResponseEntity<Jugador> agregarJugador(@RequestBody Jugador jugador){
        return ResponseEntity.ok(jugadorService.agregarJugador(jugador));
    }

    @GetMapping
    public ResponseEntity<List<Jugador>> listarJugadores(){
        return ResponseEntity.ok(jugadorService.listar());
    }

}
