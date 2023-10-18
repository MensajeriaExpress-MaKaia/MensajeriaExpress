package com.example.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    @NotNull
    @Size(max = 20)
    @Column(name = "identificacion_cliente")
    private Integer cedulaCliente;
    @NotNull
    @Size(max = 100)
    @Column(name = "nombre_cliente")
    private String nombre;
    @NotNull
    @Size(max = 100)
    @Column(name = "apellido_cliente")
    private String apellidos;
    @NotNull
    @Size(max = 50)
    @Column(name = "celular_cliente")
    private Integer celular;
    @NotNull
    @Size(max = 100)
    @Column(name = "email_cliente")
    private String email;
    @NotNull
    @Size(max = 100)
    @Column(name = "direccion_cliente")
    private String direccionResidencia;
    @NotNull
    @Size(max = 100)
    @Column(name = "ciudad_cliente")
    private String ciudad;

    public Cliente() {
    }

    public Cliente(Integer cedulaCliente, String nombre, String apellidos, Integer celular, String email, String direcdionResidencia, String ciudad) {
        this.cedulaCliente = cedulaCliente;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.celular = celular;
        this.email = email;
        this.direccionResidencia = direcdionResidencia;
        this.ciudad = ciudad;
    }

    @OneToMany(mappedBy = "cliente")
    private List<Envio> envios;


}
