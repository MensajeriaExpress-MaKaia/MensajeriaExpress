package com.example.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.sql.Time;
@Data
@Entity
@Table(name="envios")
public class Envio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numeroGuia_envio")
    private Long numeroGuia;
    @NotNull
    @Size(max = 20)
    @Column(name = "cedulaCliente_envio")
    private Integer cedulaCliente;
    @NotNull
    @Size(max = 100)
    @Column(name = "ciudadOrigen_envio")
    private String ciudadOrigen;
    @NotNull
    @Size(max = 100)
    @Column(name = "ciudadDestino_envio")
    private String ciudadDestino;
    @NotNull
    @Size(max = 100)
    @Column(name = "direccionDestino_envio")
    private String direccionDestino;
    @NotNull
    @Size(max = 100)
    @Column(name = "destinatario_envio")
    private String destinatario;
    @NotNull
    @Size(max = 50)
    @Column(name = "celularDestinatario_envio")
    private String celularDestinatario;
    @NotNull
    @Size(max = 50)
    @Column(name = "horaEntrega_envio")
    private Time horaEntrega;
    @NotNull
    @Size(max = 50)
    @Column(name = "costo_envio")
    private Double costo;
    @NotNull
    @Column(name = "id_estado_envio")
    private Long idEstadoEnvio;
    @NotNull
    @Column(name = "id_Paquete")
    private Long idPaquete;


    @ManyToOne
    @JoinColumn(name = "cedulaCliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name="cedulaEmpleado")
    private Empleado empleado;

    /*@ManyToOne
    @JoinColumn(name = "idEstadoEnvio")
    private EstadoEnvio estado;

    @ManyToOne
    @JoinColumn(name = "idPaquete")
    private Paquete paquete;*/

    public Envio() {
    }

    public Envio(Long numeroGuia, Integer cedulaCliente, String ciudadOrigen, String ciudadDestino, String direccionDestino, String destinatario, String celularDestinatario, Time horaEntrega, Double costo) {
        this.numeroGuia = numeroGuia;
        this.cedulaCliente = cedulaCliente;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.direccionDestino = direccionDestino;
        this.destinatario = destinatario;
        this.celularDestinatario = celularDestinatario;
        this.horaEntrega = horaEntrega;
        this.costo = costo;
    }
}
