package com.futbol.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Jugador")
@Data
public class Jugador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String puesto;
    private int numero;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "jugador_id",nullable = false)
    private Equipo equipo;

}
