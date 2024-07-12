package com.aluracursos.challenge_library.service;

import com.aluracursos.challenge_library.model.Autor;
import com.aluracursos.challenge_library.repositorio.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {
    @Autowired
    private AutorRepository autorRepository;

    public List<Autor> getAutoresVivosPorAnio(int year){
        return  autorRepository.findAutorByFecha(year);
    }
}
