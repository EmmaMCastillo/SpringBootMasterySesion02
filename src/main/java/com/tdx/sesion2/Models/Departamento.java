package com.tdx.sesion2.Models;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "departamentos")
public class Departamento {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "departamento_id")
        private int id;

        @Column(name = "nombre_departamento", nullable = false)
        private String nombreDepartamento;

        @Column
        private String ubicacion;

        @OneToMany(mappedBy = "departamento")
        @JsonIgnore
        private List<Empleado> empleados;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNombreDepartamento() {
            return nombreDepartamento;
        }

        public void setNombreDepartamento(String nombreDepartamento) {
            this.nombreDepartamento = nombreDepartamento;
        }

        public String getUbicacion() {
            return ubicacion;
        }

        public void setUbicacion(String ubicacion) {
            this.ubicacion = ubicacion;
        }

        public List<Empleado> getEmpleados() {
            return empleados;
        }

        public void setEmpleados(List<Empleado> empleados) {
            this.empleados = empleados;
        }

}
