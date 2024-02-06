package com.ORM.demo.controller;

import com.ORM.demo.model.Usuario;
import com.ORM.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UsuarioController {
    private final UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public ResponseEntity<Usuario> registrarUsuario(@RequestBody Usuario usuario){
        return ResponseEntity.ok((usuarioService.registrarUsuario(usuario)));
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> listarUsuarios (){
        return ResponseEntity.ok(usuarioService.listarTodos());
    }
}
