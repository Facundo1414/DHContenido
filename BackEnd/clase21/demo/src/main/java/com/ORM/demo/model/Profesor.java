package com.ORM.demo.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Profesores")
@Data
public class Profesor {
    @Id
    @SequenceGenerator(name = "profesor_sequence",sequenceName = "profesor_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "profesor_sequence")
    private Long id;
    private String nombre;
    private String titulo;
    @JsonIgnore
    @OneToMany(mappedBy = "profesor", fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
    private java.util.Set<Alumno> alumnos = new HashSet<>();
}
