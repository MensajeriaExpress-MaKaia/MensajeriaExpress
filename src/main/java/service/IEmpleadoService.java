package service;

import model.Empleado;

import java.util.List;

public interface IEmpleadoService {
    List<Empleado> getAllEmpleados();
    Empleado getEmpleadoById(Integer id);
    Empleado addEmpleado(Empleado empleado);
    Empleado updateEmpleado(Integer id, Empleado empleado);
    void deleteEmpleado(Integer id);

}
