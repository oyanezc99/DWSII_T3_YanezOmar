package com.examen.DSWII_T3_YanezOmar.service;

import com.examen.DSWII_T3_YanezOmar.model.bd.Notas;
import com.examen.DSWII_T3_YanezOmar.model.bd.dto.NotasDTO;
import com.examen.DSWII_T3_YanezOmar.repository.NotasRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class NotasService {

    @Autowired
    private NotasRepository notasRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<NotasDTO> obtenerNotasDTO() {
        List<Notas> notas = notasRepository.findAll();
        return notas.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    private NotasDTO convertToDto(Notas notas) {
        return modelMapper.map(notas, NotasDTO.class);
    }
}
