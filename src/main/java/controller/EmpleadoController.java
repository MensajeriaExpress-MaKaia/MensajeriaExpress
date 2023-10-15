package controller;

import model.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.EmpleadoService;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {

    private final EmpleadoService empleadoService;

    @Autowired
    public EmpleadoController(EmpleadoService empleadoService) {
        this.empleadoService = empleadoService;
    }
    @GetMapping
    public Empleado getAllEmpleados(@PathVariable Integer id){
        return (Empleado) empleadoService.getAllEmpleados();
    }
    @GetMapping("/{id}")
    public Empleado getEmpleadoById(@PathVariable Integer id){
        return empleadoService.getEmpleadoById(id);
    }
    @PostMapping
    public Empleado addEmpleado(@RequestBody Empleado empleado){
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
