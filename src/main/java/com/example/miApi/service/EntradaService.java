package com.example.miApi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.miApi.repository.EntradaRepository;
import com.example.miApi.model.Entrada;

@Service
public class EntradaService {

    // Inyectamos el repositorio puente creado
    private final EntradaRepository entradaRepository;

    public EntradaService(EntradaRepository entradaRepository) {
        this.entradaRepository = entradaRepository;
    }

    // Listar toodo

    public List<Entrada> listarTodas() {
        return entradaRepository.findAll();
    }

    // Guardar Elementos
    public Entrada guardar(Entrada entrada) {

        return entradaRepository.save(entrada);
    }

    // Obtener por id

    public Entrada obtenerId(Long id) {

        Optional<Entrada> entrada = entradaRepository.findById(id);
        return entrada.orElse(null);
    }

    // Eliminar Registro

    public void eliminar(Long id) {

        entradaRepository.deleteById(id);
    }

}
