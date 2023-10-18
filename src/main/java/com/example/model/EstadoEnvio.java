package com.example.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "estado_envio")
public class EstadoEnvio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(max = 50)
    @Column(name = "nombre_estadoPaquete")
    private String nombre;

    public EstadoEnvio() {
    }

    public EstadoEnvio(String nombre) {
        this.nombre = nombre;
    }

}
