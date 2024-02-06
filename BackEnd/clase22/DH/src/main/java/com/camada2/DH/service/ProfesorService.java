package com.camada2.DH.service;

import com.camada2.DH.model.Profesor;
import com.camada2.DH.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfesorService {
    @Autowired
    private ProfesorRepository profesorRepository;
    //metodos
    public Profesor guardarProfesor(Profesor profesor){
        return profesorRepository.save(profesor);
    }
    public List<Profesor> listarTodos(){
        return  profesorRepository.findAll();
    }
    public void eliminarProfesor(Long id){
        profesorRepository.deleteById(id);
    }
    public Optional<Profesor> buscarPorId(Long id){
        return profesorRepository.findById(id);
    }
}
