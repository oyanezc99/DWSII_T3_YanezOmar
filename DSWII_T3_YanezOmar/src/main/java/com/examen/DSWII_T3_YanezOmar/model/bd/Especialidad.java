package com.examen.DSWII_T3_YanezOmar.model.bd;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Especialidad")
@Data
public class Especialidad {

    @Id
    private String IdEsp;
    private String NomEsp;
    private double Costo;
}

