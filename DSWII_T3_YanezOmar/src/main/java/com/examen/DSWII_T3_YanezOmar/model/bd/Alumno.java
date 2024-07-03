package com.examen.DSWII_T3_YanezOmar.model.bd;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table()
@Data
public class Alumno {

    @Id
    private String IdAlumno;
    private String ApeAlumno;
    private String NomAlumno;
    private String proce;

    @ManyToOne()
    @JoinColumn(name = "IdEsp")
    private Especialidad especialidad;


}