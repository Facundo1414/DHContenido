package com.c2.ClinicaOdontologica.controller;


import com.c2.ClinicaOdontologica.model.Odontologo;
import com.c2.ClinicaOdontologica.model.Paciente;
import com.c2.ClinicaOdontologica.service.OdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/odontologo")
public class OdontologoController {
    //relacion de asociacion con el servicio
    private OdontologoService odontologoService;

    @Autowired
    public OdontologoController(OdontologoService odontologoService) {
        this.odontologoService = odontologoService;
    }

    @GetMapping("/{id}")
    public Odontologo buscarOdontologobyId(@PathVariable Integer id){
        return odontologoService.buscarPorID(id);
    }
    @PostMapping
    public Odontologo registrarOdontologo(@RequestBody Odontologo odontologo){
        return odontologoService.guardarOdontologo(odontologo);
    }

    @PutMapping
    public String actualizarOdontologo(@RequestBody Odontologo odontologo){
        Odontologo odontologobuscado= odontologoService.buscarPorID(odontologo.getId());
        if(odontologobuscado!=null) {
            odontologoService.actualizarOdontologo(odontologo);
            return "odontologo actualizado";
        }else{
            return "odontologo no encontrado";
        }
    }

    @DeleteMapping("/{id}")
    public void eliminarOdontologo(@PathVariable Integer id){
        odontologoService.eliminarOdontologo(id);
    }

    @GetMapping("/all")
    public List<Odontologo> listarTodosLosOdontologos(){
        return odontologoService.listarOdontologos();
    }
}
