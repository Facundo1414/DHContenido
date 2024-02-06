package com.Camada2.DirectorTecnico.controller;

import com.Camada2.DirectorTecnico.entity.DirectorTecnico;
import com.Camada2.DirectorTecnico.service.DirectorTecnicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tecnicos")
public class DirectorTecnicoController {
    //asociamos el service
    @Autowired
    private DirectorTecnicoService directorTecnicoService;
    @PostMapping
    public ResponseEntity<DirectorTecnico> registrarTecnico(@RequestBody DirectorTecnico directorTecnico){
        return ResponseEntity.ok(directorTecnicoService.registrarTecnico(directorTecnico));
    }
    @GetMapping("/busqueda/{nombre}")
    public ResponseEntity<DirectorTecnico> buscarPorNombre(@PathVariable String nombre){
        Optional<DirectorTecnico> tecnicoBuscado= directorTecnicoService.buscarPorNombre(nombre);
        if(tecnicoBuscado.isPresent()){
            return ResponseEntity.ok(tecnicoBuscado.get());
        }else{
            return  ResponseEntity.notFound().build();
        }
    }
    @GetMapping("/mayores/{edad}")
    public ResponseEntity<List<DirectorTecnico>> buscarTecnicosMayoresQue(@PathVariable Integer edad){
        return ResponseEntity.ok(directorTecnicoService.buscarTecnicosMayoresQue(edad));
    }
}
