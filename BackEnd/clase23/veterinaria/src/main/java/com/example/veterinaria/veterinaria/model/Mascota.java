package com.example.veterinaria.veterinaria.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "mascotas")
@Data
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nombre;
    @Column
    private String tipo;

    @ManyToOne()
    @JoinColumn(name = "veterinaria_id")
    private Veterinaria veterinaria;
}
