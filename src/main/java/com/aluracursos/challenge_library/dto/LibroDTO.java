package com.aluracursos.challenge_library.dto;

import com.aluracursos.challenge_library.model.Autor;

public record LibroDTO(int idLibro,
                       String titulo,
                       Autor autor,
                       String idioma,
                       Double numDescargas) {
}
