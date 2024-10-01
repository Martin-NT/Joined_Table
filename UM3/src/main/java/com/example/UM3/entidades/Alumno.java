package com.example.UM3.entidades;

import com.example.UM3.enumeraciones.Especialidades;
import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Setter
@SuperBuilder

public class Alumno extends Persona{

    private int legajo;

    private Especialidades especialidad;


}