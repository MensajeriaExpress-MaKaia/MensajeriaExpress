package com.example.repository;

import com.example.model.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class EmpleadoRepositoryImpl implements IEmployableRepository {

    private EmployableRepository empleadoRepository;

    @Autowired
    public EmpleadoRepositoryImpl(EmployableRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    @Override
    public List<Empleado> getAllEmpleados() {
        return empleadoRepository.findAll();
    }

    @Override
    public Empleado findEmpleadoById(Integer id) {
        Optional<Empleado> employable = empleadoRepository.findById(id);
        return employable.orElse(null);
    }

    @Override
    public Empleado addEmpleado(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    @Override
    public Empleado updateEmpleado(Integer id, Empleado empleado) {

        if (empleadoRepository.existsById(id)) {
            empleado.setCedulaEmpleado(id);
            return empleadoRepository.save(empleado);
        }
        return null;
    }
    @Override
    public void deleteEmpleado(Integer id) {
        empleadoRepository.deleteById(id);
    }
}
