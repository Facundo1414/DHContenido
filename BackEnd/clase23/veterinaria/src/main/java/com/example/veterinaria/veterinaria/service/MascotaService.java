package com.example.veterinaria.veterinaria.service;


import com.example.veterinaria.veterinaria.model.Mascota;
import com.example.veterinaria.veterinaria.repository.MascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MascotaService {
    private final MascotaRepository mascotaRepository;

    @Autowired
    public MascotaService(MascotaRepository mascotaRepository) {
        this.mascotaRepository = mascotaRepository;
    }

    public Mascota saveMascota(Mascota mascota){
        return mascotaRepository.save(mascota);
    }
}
