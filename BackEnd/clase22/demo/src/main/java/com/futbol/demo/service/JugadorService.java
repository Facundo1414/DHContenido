package com.futbol.demo.service;

import com.futbol.demo.model.Jugador;
import com.futbol.demo.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JugadorService {
    private final JugadorRepository jugadorRepository;

    @Autowired
    public JugadorService(JugadorRepository jugadorRepository) {
        this.jugadorRepository = jugadorRepository;
    }

    // metodos
    public Jugador agregarJugador(Jugador jugador){
        return jugadorRepository.save(jugador);
    }
    public List<Jugador> listar(){
        return jugadorRepository.findAll();
    }
}
