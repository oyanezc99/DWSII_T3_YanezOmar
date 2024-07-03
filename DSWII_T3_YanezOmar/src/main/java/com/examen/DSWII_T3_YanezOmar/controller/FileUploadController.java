package com.examen.DSWII_T3_YanezOmar.controller;

import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
@RequiredArgsConstructor
public class FileUploadController {

    @Value("${upload-dir}")
    private String uploadDir;

    @PostMapping("/api/filesdoc")
    public ResponseEntity<String> handleFileUpload(@RequestParam("file") MultipartFile file) {
        if (!file.isEmpty()) {
            try {
                if (!file.getOriginalFilename().endsWith(".doc")) {
                    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Solo se permiten archivos .doc");
                }

                if (file.getSize() > 2 * 1024 * 1024) {
                    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("El tamaño máximo del archivo es de 2MB");
                }

                byte[] bytes = file.getBytes();
                Path path = Paths.get(uploadDir + file.getOriginalFilename());
                Files.write(path, bytes);

                return ResponseEntity.status(HttpStatus.OK).body("Archivo subido correctamente");
            } catch (IOException e) {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al subir el archivo");
            }
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("El archivo está vacío");
        }
    }
}
