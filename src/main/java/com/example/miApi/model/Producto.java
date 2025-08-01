package com.example.miApi.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private double precio;
    private String imgUrl;
    private String categoria;
    private long codigo;

    private int stock;  // Campo único para controlar la cantidad disponible
}
