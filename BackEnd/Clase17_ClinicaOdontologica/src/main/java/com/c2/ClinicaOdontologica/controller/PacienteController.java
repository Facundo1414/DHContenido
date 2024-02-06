package com.c2.ClinicaOdontologica.controller;

import com.c2.ClinicaOdontologica.model.Paciente;
import com.c2.ClinicaOdontologica.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/paciente")
public class PacienteController {
    private PacienteService pacienteService;

    @Autowired
    public PacienteController(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

    @GetMapping("/{id}")
    public Paciente buscarPacientePorID(@PathVariable Integer id){
        return pacienteService.buscarPorId(id);
    }
    @PostMapping
    public  Paciente registrarPaciente(@RequestBody Paciente paciente){
        return pacienteService.guardarPaciente(paciente);
    }
    @PutMapping
    public String actualizarPaciente(@RequestBody Paciente paciente){
        Paciente pacienteBuscado= pacienteService.buscarPorId(paciente.getId());
        if(pacienteBuscado!=null) {
            pacienteService.actualizarPaciente(paciente);
            return "paciente actualizado";
        }else{
            return "paciente no encontrado";
        }
    }
    @GetMapping
    public String buscarPacientePorCorreo(Model model, @RequestParam("email") String correo){
        Paciente paciente= pacienteService.buscarPorEmail(correo);
        model.addAttribute("nombre",paciente.getNombre());
        model.addAttribute("apellido",paciente.getApellido());
        return "index";
    }

    @DeleteMapping("/{id}")
    public String eliminarPaciente(@PathVariable Integer id){
        Paciente pacienteAeliminar = pacienteService.buscarPorId(id);
        if (pacienteAeliminar!=null){
            pacienteService.eliminarPaciente(id);
            return "Paciente eliminado";
        }
        return "Paciente no encontrado en el sistema";
    }

    @GetMapping
    public Object listarTodosLosPacientes(){
        return pacienteService.obtenerTodosLosPacientes();
    }

}
