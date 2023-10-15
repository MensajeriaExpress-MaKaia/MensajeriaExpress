package model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "paquete")
public class Paquete {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Column(name = "id_tipoPaquete")
    private Integer id_tipoPaquete;
    @NotNull
    @Column(name = "peso_paquete")
    @Size(max = 10)
    private Double peso;
    @NotNull
    @Size(max = 50)
    @Column(name = "valor_decarado")
    private Double valorDeclarado;

    public Paquete() {
    }

    public Paquete(Integer id_tipoPaquete, Double peso, Double valorDeclarado) {
        this.id_tipoPaquete = id_tipoPaquete;
        this.peso = peso;
        this.valorDeclarado = valorDeclarado;
    }

}
