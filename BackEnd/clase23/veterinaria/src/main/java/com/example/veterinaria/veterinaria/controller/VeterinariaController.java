package com.example.veterinaria.veterinaria.controller;

import com.example.veterinaria.veterinaria.model.Veterinaria;
import com.example.veterinaria.veterinaria.service.VeterinariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/veterinaria")
public class VeterinariaController {
    @Autowired
    private VeterinariaService veterinariaService;

    @PostMapping
    public ResponseEntity<Veterinaria> saveVeterinaria(@RequestBody Veterinaria veterinaria){
        return ResponseEntity.ok(veterinariaService.saveVeterinaria(veterinaria));
    }

    @GetMapping("/busqueda/{nombre}")
    public ResponseEntity<Veterinaria> findVeterinariaBynombre(@PathVariable String nombre){
        Optional<Veterinaria> veterinariaBuscada = veterinariaService.findVeterinariaBynombre(nombre);
        if (veterinariaBuscada.isPresent()){
            return ResponseEntity.ok(veterinariaBuscada.get());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/agregarMascota/{nombre}")
    public ResponseEntity<Veterinaria> addMascota(@PathVariable String nombre){
        Optional<Veterinaria> veterinariaBuscada = veterinariaService.findVeterinariaBynombre(nombre);
        if (veterinariaBuscada.isPresent()){

        }
        return ResponseEntity.notFound().build();

    }
}
