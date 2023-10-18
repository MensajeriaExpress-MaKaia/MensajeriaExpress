package com.example.repository;

import com.example.model.Empleado;

import java.util.List;

public interface IEmployableRepository {
    List<Empleado> getAllEmpleados();
    Empleado findEmpleadoById(Integer id);
    Empleado addEmpleado(Empleado empleado);
    Empleado updateEmpleado(Integer id, Empleado empleado);
    void deleteEmpleado(Integer id);

}
