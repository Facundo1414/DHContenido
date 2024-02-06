package com.futbol.demo.repository;

import com.futbol.demo.controller.JugadorController;
import com.futbol.demo.model.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JugadorRepository extends JpaRepository<Jugador, Long > {
}
