package com.examen.DSWII_T3_YanezOmar.repository;


import com.examen.DSWII_T3_YanezOmar.model.bd.Notas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotasRepository extends JpaRepository<Notas, Long> {
    // Puedes definir métodos adicionales para consultas personalizadas si es necesario
}
