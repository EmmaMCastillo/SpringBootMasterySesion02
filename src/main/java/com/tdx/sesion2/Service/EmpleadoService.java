package com.tdx.sesion2.Service;

import com.tdx.sesion2.Models.Empleado;
import com.tdx.sesion2.Repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService {
    private final EmpleadoRepository empleadoRepository;

    @Autowired
    public EmpleadoService(EmpleadoRepository empleadoRepository){
        this.empleadoRepository = empleadoRepository;
    }

    public List<Empleado> obtenerEmpleadosPorDepartamento(Integer departementoId){
        return empleadoRepository.findByDepartamentoId(departementoId);
    }

    public Empleado guardarEmpleado (Empleado empleado){
        return  empleadoRepository.save(empleado);
    }

    public  void eliminarEmpleado (Integer id){
        empleadoRepository.deleteById(id);
    }
}
