package com.Camada2.DirectorTecnico.entity;

import javax.persistence.*;

@Entity
@Table(name = "jugadores")
public class Jugador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String clubFavorito;
    @ManyToOne
    @JoinColumn(name = "tecnico_id")
    private DirectorTecnico directorTecnico; //<--- es la relacion de vinculo que hay con la clase DirectorTecnico

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClubFavorito() {
        return clubFavorito;
    }

    public void setClubFavorito(String clubFavorito) {
        this.clubFavorito = clubFavorito;
    }
}
