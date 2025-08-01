package com.example.miApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.miApi.model.Entrada;
import com.example.miApi.service.EntradaService;

import lombok.experimental.Delegate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/entradas")
public class EntradaController {

    private final EntradaService service;

    public EntradaController(EntradaService service) {

        this.service = service;
    }

    @GetMapping
    public List<Entrada> listar() {

        return service.listarTodas();
    }

    @PostMapping
    public Entrada guardar(@RequestBody Entrada entrada) {

        return service.guardar(entrada);

    }

    @DeleteMapping("/{id}")

    public void eliminar(@PathVariable Long id) {

        service.eliminar(id);

    }

    @GetMapping("/{id}")

    public Entrada obtenerPorId(@PathVariable Long id) {

        return service.obtenerId(id);
    }

}
