package com.futbol.demo.service;

import com.futbol.demo.model.Equipo;
import com.futbol.demo.repository.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EquipoService {
    private final EquipoRepository equipoRepository;

    @Autowired
    public EquipoService(EquipoRepository equipoRepository) {
        this.equipoRepository = equipoRepository;
    }

    // metodos
    public Equipo agregarEquipo(Equipo equipo){
        return equipoRepository.save(equipo);
    }
    public List<Equipo> listar(){
        return equipoRepository.findAll();
    }
    public Optional<Equipo> buscarPorID(Long id){return equipoRepository.findById(id);}
    public void eliminar(Long id){equipoRepository.deleteById(id);}
}
