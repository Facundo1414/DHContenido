package com.dh.Clase38.repository;

import com.dh.Clase38.model.Partido;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PartidoRepository extends MongoRepository<Partido,Long> {
}
