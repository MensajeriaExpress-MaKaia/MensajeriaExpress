package com.example.controller;

import com.example.model.Empleado;
import com.example.service.EmployableService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {

    private final EmployableService empleadoService;

    @Autowired
    public EmpleadoController(EmployableService empleadoService) {
        this.empleadoService = empleadoService;
    }
    @GetMapping
    public Empleado getAllEmpleados(@PathVariable Integer id){
        return (Empleado) empleadoService.getAllEmpleados();
    }
    @GetMapping("/{id}")
    public Empleado findEmpleadoById(@PathVariable  Integer id){
        if(id == null) {
            throw new RuntimeException("El id del empleado es requerido");
        }
        Empleado empleado = empleadoService.findEmpleadoById(id);
        if (empleado == null){
            throw new RuntimeException("No existe empleado con id "+ id);
        }
        return empleado;
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Empleado addEmpleado(@Valid @RequestBody Empleado empleado){
        return empleadoService.addEmpleado(empleado);
    }
    @PutMapping("/{id}")
    public Empleado updateEmpleado(@PathVariable Integer id, @RequestBody Empleado empleado){
        return empleadoService.updateEmpleado(id, empleado);
    }
    @DeleteMapping("/{id}")
    public  void deleteEmpleado(@PathVariable Integer id){
        empleadoService.deleteEmpleado(id);
    }
}
