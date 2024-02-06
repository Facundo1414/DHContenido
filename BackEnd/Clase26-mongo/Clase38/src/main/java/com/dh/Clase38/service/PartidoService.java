package com.dh.Clase38.service;

import com.dh.Clase38.model.Partido;
import com.dh.Clase38.repository.PartidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PartidoService {
    private PartidoRepository partidoRepository;
@Autowired
    public PartidoService(PartidoRepository partidoRepository) {
        this.partidoRepository = partidoRepository;
    }
    public Partido registrarPartido(Partido partido){
    return partidoRepository.save(partido);
    } //de esta manera fijense que el cambio en el service es minimo.
}
