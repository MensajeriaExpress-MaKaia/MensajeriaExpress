package service;

import model.Cliente;
import model.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.EmpleadoRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoService implements IEmpleadoService{
    private final EmpleadoRepository empleadoRepository;

    @Autowired
    public EmpleadoService(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    @Override
    public List<Empleado> getAllEmpleados() {
        return empleadoRepository.findAll();
    }

    @Override
    public Empleado getEmpleadoById(Integer id) {
        Optional<Empleado> empleado = empleadoRepository.findById(id);
        return empleado.orElse(null);
    }

    @Override
    public Empleado addEmpleado(Empleado empleado) {
        // No necesitas mantener una lista local ni asignar IDs manualmente
        return empleadoRepository.save(empleado);
    }

    @Override
    public Empleado updateEmpleado(Integer id, Empleado empleado) {
        // Validar si el empleado con el ID dado existe antes de actualizar
        if (empleadoRepository.existsById(id)) {
            empleado.setCedulaEmpleado(id);
            return empleadoRepository.save(empleado);
        }
        return null; // Opcionalmente, puedes lanzar una excepción en lugar de retornar null
    }

    @Override
    public void deleteEmpleado(Integer id) {
        empleadoRepository.deleteById(id);
    }
}
