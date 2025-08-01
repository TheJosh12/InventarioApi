package com.example.miApi.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.miApi.model.Entrada;

public interface EntradaRepository extends JpaRepository<Entrada, Long>{
    
}
