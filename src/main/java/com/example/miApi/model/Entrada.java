package com.example.miApi.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Entrada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Relación con el producto al que pertenece esta entrada
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "producto_id", nullable = false)
    private Producto producto;

    private int cantidad;  // Cantidad que entra al inventario

    private String observaciones;  // Comentarios o notas sobre la entrada (opcional)

    private LocalDateTime fecha = LocalDateTime.now();  // Fecha y hora de la entrada
}
