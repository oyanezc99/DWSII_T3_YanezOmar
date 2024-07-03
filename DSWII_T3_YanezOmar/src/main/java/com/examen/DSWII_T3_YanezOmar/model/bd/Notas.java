package com.examen.DSWII_T3_YanezOmar.model.bd;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Notas")
@Data
public class Notas {

    @EmbeddedId
    private NotasId id;

    @Column(name = "ExaParcial")
    private Double exaParcial;

    @Column(name = "ExaFinal")
    private Double exaFinal;
}

@Embeddable
@Data
class NotasId {
    @Column(name = "IdAlumno", length = 5)
    private String idAlumno;

    @Column(name = "IdCurso", length = 4)
    private String idCurso;
}
