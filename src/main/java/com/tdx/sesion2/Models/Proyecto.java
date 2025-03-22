package com.tdx.sesion2.Models;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "proyectos")
public class Proyecto {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "proyecto_id")
        private int id;

        @Column(name = "nombre_proyecto", nullable = false)
        private String nombreProyecto;

        @Column
        private String descripcion;

        @Column(name = "fecha_inicio", nullable = false)
        private LocalDate fechaInicio;

        @Column(name = "fecha_fin")
        private LocalDate fechaFin;

        @ManyToOne
        @JoinColumn(name = "empleado_id", nullable = false)
        @JsonIgnore
        private Empleado empleado;

        // Getters y Setters
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNombreProyecto() {
            return nombreProyecto;
        }

        public void setNombreProyecto(String nombreProyecto) {
            this.nombreProyecto = nombreProyecto;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        public LocalDate getFechaInicio() {
            return fechaInicio;
        }

        public void setFechaInicio(LocalDate fechaInicio) {
            this.fechaInicio = fechaInicio;
        }

        public LocalDate getFechaFin() {
            return fechaFin;
        }

        public void setFechaFin(LocalDate fechaFin) {
            this.fechaFin = fechaFin;
        }

        public Empleado getEmpleado() {
            return empleado;
        }

        public void setEmpleado(Empleado empleado) {
            this.empleado = empleado;
        }
    }

