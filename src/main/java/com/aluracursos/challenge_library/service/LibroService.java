package com.aluracursos.challenge_library.service;


import com.aluracursos.challenge_library.model.Libro;
import com.aluracursos.challenge_library.repositorio.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService {
    @Autowired
    public LibroRepository libroRepository;

    public List<String> obtenerDistintosIdiomas(){
        return libroRepository.findDistinctIdiomas();
    }

    public List<Libro> obtenerLibrosPorIdioma(String idioma){
        return libroRepository.findByIdioma(idioma);
    }
}
