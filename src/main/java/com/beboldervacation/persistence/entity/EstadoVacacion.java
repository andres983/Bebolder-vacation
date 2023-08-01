package com.beboldervacation.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "estado_vacacion")
public class EstadoVacacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String descripcion;

    @OneToMany(mappedBy = "estadoVacacion")
    @JsonIgnore
    private List<Vacaciones> vacaciones;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Vacaciones> getVacaciones() {
        return vacaciones;
    }

    public void setVacaciones(List<Vacaciones> vacaciones) {
        this.vacaciones = vacaciones;
    }
}
