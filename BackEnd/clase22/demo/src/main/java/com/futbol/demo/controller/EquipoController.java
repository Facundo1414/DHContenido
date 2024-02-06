package com.futbol.demo.controller;


import com.futbol.demo.model.Equipo;
import com.futbol.demo.service.EquipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("equipo")
public class EquipoController {
    private final EquipoService equipoService;

    @Autowired
    public EquipoController(EquipoService equipoService) {
        this.equipoService = equipoService;
    }

    @PostMapping
    public ResponseEntity<Equipo> guardar(@RequestBody Equipo equipo){
        return ResponseEntity.ok(equipoService.agregarEquipo(equipo));
    }
    @GetMapping
    public ResponseEntity<List<Equipo>> listar(){
        return ResponseEntity.ok(equipoService.listar());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminar(@PathVariable Long id){
        Optional<Equipo> optionalEquipo = equipoService.buscarPorID(id);
        if (optionalEquipo.isPresent()){
            equipoService.eliminar(id);
            return ResponseEntity.ok("Equipo eliminado");
        }
        return ResponseEntity.ok("No se encontro el equipo a eliminar");
    }
}
