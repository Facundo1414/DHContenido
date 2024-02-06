package com.ORM.demo.service;

import com.ORM.demo.model.Profesor;
import com.ORM.demo.repository.ProfesorRepository;
import com.ORM.demo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfesorService {
    private final ProfesorRepository profesorRepository;

    @Autowired
    public ProfesorService(ProfesorRepository profesorRepository) {
        this.profesorRepository = profesorRepository;
    }

    // metodos CRUD
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
