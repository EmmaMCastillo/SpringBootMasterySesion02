package com.tdx.sesion2.Repository;

import com.tdx.sesion2.Models.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpleadoRepository extends JpaRepository <Empleado, Integer> {
    List<Empleado> findByDepartamentoId(Integer departamentoId);
}
