package com.camada2.DH.model;

import javax.persistence.*;

@Entity
@Table(name = "alumnos")
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nombre;
    @Column
    private Integer edad;
    @ManyToOne
    @JoinColumn(name = "profesor_id",nullable = false)
    private Profesor profesor; //<---mappedBy
}
