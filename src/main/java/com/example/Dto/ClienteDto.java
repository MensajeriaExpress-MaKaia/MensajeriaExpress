package com.example.Dto;

public class ClienteDto {

    public Integer cedulaCliente;
    public String nombre;
    public String apellidos;
    public Integer celular;
    public String email;
    public String direccionResidencia;

    public String ciudad;

    public ClienteDto() {
    }

    public ClienteDto(Integer cedulaCliente, String nombre, String apellidos, Integer celular, String email, String direccionResidencia, String ciudad) {
        this.cedulaCliente = cedulaCliente;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.celular = celular;
        this.email = email;
        this.direccionResidencia = direccionResidencia;
        this.ciudad = ciudad;
    }

    public Integer getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(Integer cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getCelular() {
        return celular;
    }

    public void setCelular(Integer celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccionResidencia() {
        return direccionResidencia;
    }

    public void setDireccionResidencia(String direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
