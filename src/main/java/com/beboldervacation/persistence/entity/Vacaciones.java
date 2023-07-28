package com.beboldervacation.persistence.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "vacaciones")
public class Vacaciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer idEmpleado;
    private Date fechaSolicitud;
    private Integer diasSolicitados;
    private Integer diasAFavor;
    private Integer idEstadoVacacion;
    private Integer numeroSolicitud;
    private Date fechaReintrego;
    private Integer idUsuarioVerifico;
    private boolean aprobado;

    @ManyToOne
    @JoinColumn(name = "idEmpleado", insertable = false, updatable = false)
    private Empleado empleadoVacacion;

    @ManyToOne
    @JoinColumn(name = "idEstadoVacacion", insertable = false, updatable = false)
    private EstadoVacacion estadoVacacion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public Integer getDiasSolicitados() {
        return diasSolicitados;
    }

    public void setDiasSolicitados(Integer diasSolicitados) {
        this.diasSolicitados = diasSolicitados;
    }

    public Integer getDiasAFavor() {
        return diasAFavor;
    }

    public void setDiasAFavor(Integer diasAFavor) {
        this.diasAFavor = diasAFavor;
    }

    public Integer getIdEstadoVacacion() {
        return idEstadoVacacion;
    }

    public void setIdEstadoVacacion(Integer idEstadoVacacion) {
        this.idEstadoVacacion = idEstadoVacacion;
    }

    public Integer getNumeroSolicitud() {
        return numeroSolicitud;
    }

    public void setNumeroSolicitud(Integer numeroSolicitud) {
        this.numeroSolicitud = numeroSolicitud;
    }

    public Date getFechaReintrego() {
        return fechaReintrego;
    }

    public void setFechaReintrego(Date fechaReintrego) {
        this.fechaReintrego = fechaReintrego;
    }

    public Integer getIdUsuarioVerifico() {
        return idUsuarioVerifico;
    }

    public void setIdUsuarioVerifico(Integer idUsuarioVerifico) {
        this.idUsuarioVerifico = idUsuarioVerifico;
    }

    public boolean isAprobado() {
        return aprobado;
    }

    public void setAprobado(boolean aprobado) {
        this.aprobado = aprobado;
    }

    public Empleado getEmpleadoVacacion() {
        return empleadoVacacion;
    }

    public void setEmpleadoVacacion(Empleado empleadoVacacion) {
        this.empleadoVacacion = empleadoVacacion;
    }

    public EstadoVacacion getEstadoVacacion() {
        return estadoVacacion;
    }

    public void setEstadoVacacion(EstadoVacacion estadoVacacion) {
        this.estadoVacacion = estadoVacacion;
    }
}
