package com.example.miApi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.miApi.model.Salida;
import com.example.miApi.repository.SalidaRepository;

@Service
public class SalidaService {

    // Inyectar el repositorio

    private final SalidaRepository salidaRepository;

    public SalidaService(SalidaRepository salidaRepository) {

        this.salidaRepository = salidaRepository;
    }

    // Listar todos los registros

    public List<Salida> listarTodas() {

        return salidaRepository.findAll();
    }

    // Guardar registros

    public Salida guardar(Salida salida) {

        return salidaRepository.save(salida);
    }

    // obtener registro

    public Salida obtenerId(Long id) {

        Optional<Salida> salida = salidaRepository.findById(id);
        return salida.orElse(null);

    }
    // Eliminar registro

    public void eliminar(Long id) {

        salidaRepository.deleteById(id);
    }

}
