package com.example.veterinaria.veterinaria.controller;


import com.example.veterinaria.veterinaria.model.Mascota;
import com.example.veterinaria.veterinaria.service.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mascotas")
public class MascotaController {
    private final MascotaService mascotaService;

    @Autowired
    public MascotaController(MascotaService mascotaService) {
        this.mascotaService = mascotaService;
    }

    @PostMapping
    public ResponseEntity<Mascota> saveMascota(@RequestBody Mascota mascota){
        return ResponseEntity.ok(mascotaService.saveMascota(mascota));
    }
}
