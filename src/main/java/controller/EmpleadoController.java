package controller;

import model.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.EmpleadoService;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {

    private final EmpleadoService empleadoService;

    @Autowired
    public EmpleadoController(EmpleadoService empleadoService) {
        this.empleadoService = empleadoService;
    }

    public Empleado getAllEmpleados(@PathVariable Integer id){
        return (Empleado) empleadoService.getAllEmpleados();
    }

    public Empleado getEmpleadoById(@PathVariable Integer id){
        return empleadoService.getEmpleadoById(id);
    }

    public Empleado addEmpleado(@RequestBody Empleado empleado){
        return empleadoService.addEmpleado(empleado);
    }

    public Empleado updateEmpleado(@PathVariable Integer id, @RequestBody Empleado empleado){
        return empleadoService.updateEmpleado(id, empleado);
    }

    public  void deleteEmpleado(@PathVariable Integer id){
        empleadoService.deleteEmpleado(id);
    }
}
