package model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "tipo_paquete")
public class TipoPaquete {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(max = 100)
    @Column(name = "Tipo_paquete")
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "id_tipo_paquete")
    private TipoPaquete tipoPaquete;

    public TipoPaquete() {
    }

    public TipoPaquete(String nombre) {
        this.nombre = nombre;
    }
}
