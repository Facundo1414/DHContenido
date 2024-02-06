package com.Camada2.DirectorTecnico.repository;

import com.Camada2.DirectorTecnico.entity.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JugadorRepository extends JpaRepository<Jugador,Long> {
}
