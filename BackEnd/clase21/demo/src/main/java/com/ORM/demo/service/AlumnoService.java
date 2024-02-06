package com.ORM.demo.service;

import com.ORM.demo.model.Alumno;
import com.ORM.demo.repository.AlumnoRepository;
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
