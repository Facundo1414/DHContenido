package com.example.veterinaria.veterinaria.service;

import com.example.veterinaria.veterinaria.model.Veterinaria;
import com.example.veterinaria.veterinaria.repository.VeterinariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VeterinariaService {
    private final VeterinariaRepository veterinariaRepository;

    @Autowired
    public VeterinariaService(VeterinariaRepository veterinariaRepository) {
        this.veterinariaRepository = veterinariaRepository;
    }

    public Veterinaria saveVeterinaria(Veterinaria veterinaria){
        return veterinariaRepository.save(veterinaria);
    }

    public Optional<Veterinaria> findVeterinariaBynombre(String nombre){
        return veterinariaRepository.findVeterinariaBynombre(nombre);
    }

    public Optional<Veterinaria> addMascota(String nombre){
        return veterinariaRepository.addMascota(nombre);}

}
