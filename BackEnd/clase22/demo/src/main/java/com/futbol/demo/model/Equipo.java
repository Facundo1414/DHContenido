package com.futbol.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Equipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String ciudad;
    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
    private Set<Jugador> jugadores = new HashSet<>();
}
