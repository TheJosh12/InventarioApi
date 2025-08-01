package com.example.miApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.miApi.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

    
}