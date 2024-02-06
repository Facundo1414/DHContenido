package com.example.veterinaria.veterinaria.repository;

import com.example.veterinaria.veterinaria.model.Mascota;
import com.example.veterinaria.veterinaria.model.Veterinaria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface VeterinariaRepository extends JpaRepository<Veterinaria,Long> {

    //1- Un método que cree una nueva Veterinaria.
    //2- Un método para agregar mascotas a la Veterinaria.
    //3- Un método para consultar todas las mascotas de una Veterinaria.
    //4- Un método para consultar todas las mascotas que son perro.

    @Query("INSERT INTO Veterinaria(mascotas) select from m.id, m.name, m.tipo FROM mascotas m where m.name=1?")
    Optional<Veterinaria> addMascota(String nombre);

    @Query("SELECT vt FROM Veterinaria vt WHERE vt.nombre=?1")
    Optional<Veterinaria> findVeterinariaBynombre (String nombre);

    //@Modifying
    //@Query("UPDATE Veterinaria v SET v.mascotas = :mascota WHERE v.nombre = :nombreVeterinaria")
    //void addMascotaToVeterinaria(@Param("mascota") Mascota mascota, @Param("nombreVeterinaria") String nombreVeterinaria);

}
