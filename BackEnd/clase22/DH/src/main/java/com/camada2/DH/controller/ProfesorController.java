package com.camada2.DH.controller;

import com.camada2.DH.model.Profesor;
import com.camada2.DH.service.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("profesor")
public class ProfesorController {
    @Autowired
    private ProfesorService profesorService;

   @PostMapping
    public ResponseEntity<Profesor> guardarProfesor(@RequestBody Profesor profesor){
        return ResponseEntity.ok(profesorService.guardarProfesor(profesor));
    }
    @GetMapping
    public ResponseEntity<List<Profesor>> obtenerListaProfesores(){
       return ResponseEntity.ok(profesorService.listarTodos());
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarProfesor(@PathVariable Long id){
       Optional<Profesor> profesorBuscado= profesorService.buscarPorId(id);
       if(profesorBuscado.isPresent()){
           profesorService.eliminarProfesor(id);
           return ResponseEntity.ok("Profesor Eliminado con exito");
       }else{
           return ResponseEntity.ok("Profesor no encontrado en bdd");
       }
    }
}
