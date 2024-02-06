package com.Camada2.DirectorTecnico.service;

import com.Camada2.DirectorTecnico.entity.DirectorTecnico;
import com.Camada2.DirectorTecnico.repository.DirectorTecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DirectorTecnicoService {
    //asociamos el repository
    @Autowired
    private DirectorTecnicoRepository directorTecnicoRepository;
    //metodos manuales
    public DirectorTecnico registrarTecnico(DirectorTecnico directorTecnico){
        return directorTecnicoRepository.save(directorTecnico);

    }
    public List<DirectorTecnico> buscarTecnicosMayoresQue(Integer edad){
        return directorTecnicoRepository.findByEdadGreaterThan(edad);
    }
    public Optional<DirectorTecnico> buscarPorNombre(String nombre){
        return directorTecnicoRepository.buscarTecnicoPorNombre(nombre);
    }
}
