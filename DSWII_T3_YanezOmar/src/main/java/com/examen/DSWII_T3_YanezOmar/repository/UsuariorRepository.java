package com.examen.DSWII_T3_YanezOmar.repository;

import com.examen.DSWII_T3_YanezOmar.model.bd.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuariorRepository extends JpaRepository<Usuario, Long> {
    Usuario findByUserName(String userName);
}

