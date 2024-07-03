package com.examen.DSWII_T3_YanezOmar.model.bd;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "Pagos")
@Data
public class Pagos {

    @EmbeddedId
    private PagosId id;

    @Column(name = "Monto", nullable = false)
    private double monto;

    @Column(name = "Fecha")
    private LocalDateTime fecha;
}

@Embeddable
@Data
class PagosId {
    @Column(name = "IdAlumno", length = 5)
    private String idAlumno;

    @Column(name = "Ciclo", length = 6)
    private String ciclo;

    @Column(name = "Ncuota")
    private int ncuota;
}