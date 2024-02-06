package com.ORM.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Alumnos")
@Data
public class Alumno {
    @Id
    @SequenceGenerator(name = "alumno_sequence",sequenceName = "alumno_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "alumno_sequence")
    private Long id;
    private String nombre;
    private int edad;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "profesor_id", nullable = false)
    private Profesor profesor; //<---mappedBy
}
