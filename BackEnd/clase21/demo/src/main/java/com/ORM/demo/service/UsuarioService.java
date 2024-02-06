package com.ORM.demo.service;

import com.ORM.demo.model.Usuario;
import com.ORM.demo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    //metodos CRUD

    public Usuario registrarUsuario (Usuario usuario){
        return usuarioRepository.save(usuario);
    }
    public List<Usuario> listarTodos (){
        return usuarioRepository.findAll();
    }
}
