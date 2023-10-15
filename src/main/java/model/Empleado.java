package model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "empleados")
public class Empleado{

    @Id
    @NotNull
    @Size(max = 20)
    @Column(name = "identificacion_empleado")
    private Integer cedulaEmpleado;
    @NotNull
    @Size(max = 100)
    @Column(name = "nombre_empleado")
    private String nombre;
    @NotNull
    @Size(max = 100)
    @Column(name = "apellido_empleado")
    private String apelidos;
    @NotNull
    @Size(max = 50)
    @Column(name = "celular_empleado")
    private Integer celular;
    @NotNull
    @Size(max = 100)
    @Column(name = "email_empleado")
    private String email;
    @NotNull
    @Size(max = 100)
    @Column(name = "direccion_empleado")
    private String direccionResidencia;
    @NotNull
    @Size(max = 100)
    @Column(name = "ciudad_empleado")
    private String ciudad;
    @NotNull
    @Size(max = 5)
    @Column(name = "antiguedadEmpresa_empleado")
    private Integer antiguedadEmpresa;
    @NotNull
    @Size(max = 5)
    @Column(name = "tipoSangre_empleado")
    private String tipoSangre;

    @OneToMany(mappedBy = "empleado")
    private List<Envio> envios;

    @ManyToOne
    @JoinColumn(name="id_tipo_empleado")
    private TipoEmpleado tipoEmpleado;

    public Empleado() {

    }

    public Empleado(Integer cedulaEmpleado, String nombre, String apelidos, Integer celular, String email, String direccionResidencia, String ciudad, Integer antiguedadEmpresa, String tipoSangre) {
        this.cedulaEmpleado = cedulaEmpleado;
        this.nombre = nombre;
        this.apelidos = apelidos;
        this.celular = celular;
        this.email = email;
        this.direccionResidencia = direccionResidencia;
        this.ciudad = ciudad;
        this.antiguedadEmpresa = antiguedadEmpresa;
        this.tipoSangre = tipoSangre;
    }

}
