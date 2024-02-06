package com.camada2.DH.service;

import com.camada2.DH.model.Alumno;
import com.camada2.DH.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoService {
    @Autowired
    private AlumnoRepository alumnoRepository;

    public Alumno guardarAlumno(Alumno alumno){
        return alumnoRepository.save(alumno);
    }
    public List<Alumno> listarTodos(){
        return alumnoRepository.findAll();
    }
    public void eliminarAlumno(Long id){
        alumnoRepository.deleteById(id);
    }
}
