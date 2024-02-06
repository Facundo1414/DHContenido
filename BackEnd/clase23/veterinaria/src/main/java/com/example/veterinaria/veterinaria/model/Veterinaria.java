package com.example.veterinaria.veterinaria.model;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "veterinarias")
@Data
public class Veterinaria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nombre;
    @Column
    private int costo;

    @OneToMany(mappedBy = "veterinaria", fetch = FetchType.LAZY)
    private Set<Mascota> mascotas = new HashSet<>();


    public String getNombre() {
        return nombre;
    }
}
