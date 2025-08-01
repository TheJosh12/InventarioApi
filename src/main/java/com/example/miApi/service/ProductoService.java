package com.example.miApi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.miApi.model.Producto;
import com.example.miApi.repository.ProductoRepository;

@Service
public class ProductoService {
    private final ProductoRepository repo;

public ProductoService(ProductoRepository repo){

this.repo=repo;
}
public List<Producto> listarTodos(){
    return repo.findAll();
}

public Producto guardar(Producto p){

    return repo.save(p);
}

public void eliminar(Long id){
    repo.deleteById(id);
}
public Producto obtenerPorId(Long id) {
    return repo.findById(id).orElse(null);
}
}
