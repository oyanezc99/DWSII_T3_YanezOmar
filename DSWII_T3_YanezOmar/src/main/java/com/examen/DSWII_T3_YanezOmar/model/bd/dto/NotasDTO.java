package com.examen.DSWII_T3_YanezOmar.model.bd.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotasDTO {
    private double exaparcial;
    private double exafinal;
    private String nombreCurso;
    private String apellidoAlumno;
    private String nombreAlumno;
}

