package com.example.miApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.miApi.model.Salida;
import com.example.miApi.service.SalidaService;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/salidas")
public class SalidaController {

    private final SalidaService service;

    public SalidaController(SalidaService service) {

        this.service = service;
    }

    @GetMapping
    public List<Salida> listar() {

        return service.listarTodas();
    }

    @PostMapping
    public Salida guardar(@RequestBody Salida salida) {

        return service.guardar(salida);

    }

    @DeleteMapping("/{id}")

    public void eliminar(@PathVariable Long id) {

        service.eliminar(id);

    }

    @GetMapping("/{id}")

    public Salida obtenerPorId(@PathVariable Long id) {

        return service.obtenerId(id);
    }

}
