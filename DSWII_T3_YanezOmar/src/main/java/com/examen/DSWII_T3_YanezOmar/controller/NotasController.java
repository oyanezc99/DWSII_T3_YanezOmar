package com.examen.DSWII_T3_YanezOmar.controller;

import com.examen.DSWII_T3_YanezOmar.model.bd.dto.NotasDTO;
import com.examen.DSWII_T3_YanezOmar.service.NotasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NotasController {

    @Autowired
    private NotasService notasService;

    @GetMapping("/api/pubs-dto")
    public List<NotasDTO> obtenerNotasDTO() {
        return notasService.obtenerNotasDTO();
    }
}
