package com.examen.DSWII_T3_YanezOmar.model.bd;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table()
@Data
public class Curso {

    @Id
    private String IdCurso;
    private String NomCurso;
    private int Credito;
}