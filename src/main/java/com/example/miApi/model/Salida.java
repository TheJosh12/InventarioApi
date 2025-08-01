package com.example.miApi.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Salida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Relación con el producto asociado a esta salida
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "producto_id", nullable = false)
    private Producto producto;

    private int cantidad;  // Cantidad que sale del inventario

    private String observaciones;  // Comentarios o notas sobre la salida (opcional)

    private LocalDateTime fecha = LocalDateTime.now();  // Fecha y hora de la salida
}
