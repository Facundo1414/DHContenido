package com.camada2.DH.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "profesores")
@Data
public class  Profesor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String nombre;
    @Column(unique = true)
    private String titulo;
    @JsonIgnore
    @OneToMany(mappedBy = "profesor",fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
    private Set<Alumno> estudiantes= new HashSet<>();

}
