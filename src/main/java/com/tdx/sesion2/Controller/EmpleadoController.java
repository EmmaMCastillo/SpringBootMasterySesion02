package com.tdx.sesion2.Controller;

import com.tdx.sesion2.Models.Empleado;
import com.tdx.sesion2.Service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/empleados")
public class EmpleadoController {

    private  final EmpleadoService empleadoService;

    @Autowired
    public EmpleadoController(EmpleadoService empleadoService){
        this.empleadoService = empleadoService;
    }

    @GetMapping("/departamento/{departamentoId}")
    public ResponseEntity<List<Empleado>> obtenerEmpleadosPorDepartamento(@PathVariable Integer departamentoId){
        List<Empleado> empleados = empleadoService.obtenerEmpleadosPorDepartamento(departamentoId);
        return ResponseEntity.ok(empleados);
    }

    @PostMapping
    public ResponseEntity<Empleado> crearEmpleado(@RequestBody Empleado empleado){
        Empleado nuevoEmpleado = empleadoService.guardarEmpleado(empleado);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoEmpleado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarEmpleado(@PathVariable Integer id){
        empleadoService.eliminarEmpleado(id);
        return  ResponseEntity.noContent().build();
    }
}
