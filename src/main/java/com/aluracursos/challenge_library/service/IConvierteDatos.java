package com.aluracursos.challenge_library.service;

public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class<T> clase);
}
