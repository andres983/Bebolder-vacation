package com.beboldervacation.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "vacaciones")
public class Vacaciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "id_empleado")
    private Integer idEmpleado;
    @Column(name = "fecha_solicitud")
    private LocalDate fechaSolicitud;
    @Column(name = "fecha_inicial")
    private LocalDate fechaInicial;
    @Column(name = "fecha_reintegro")
    private LocalDate fechaReintrego;
    @Column(name = "dias_solicitados")
    private Integer diasSolicitados;
    @Column(name = "dias_a_favor")
    private Integer diasAFavor;
    @Column(name = "id_estado_vacacion")
    private Integer idEstadoVacacion;
    @Column(name = "numero_solicitud")
    private Integer numeroSolicitud;
    @Column(name = "id_usuario_verifico")
    private Integer idUsuarioVerifico;
    private boolean aprobado;
    @Column(name = "id_notificacion_solicitud")
    private Integer idNotificacionSolicitud;
    @Column(name = "id_notificacion_aprobacion_rechazo")
    private Integer idNotificacionAprobacionRechazo;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "id_empleado", insertable = false, updatable = false)
    private Empleado empleadoVacacion;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "id_estado_vacacion", insertable = false, updatable = false)
    private EstadoVacacion estadoVacacion;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "id_notificacion_solicitud", insertable = false, updatable = false)
    private Notificacion notificacion;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "id_notificacion_aprobacion_rechazo", insertable = false, updatable = false)
    private Notificacion notificacionAR;

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

    public LocalDate getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(LocalDate fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public LocalDate getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(LocalDate fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public LocalDate getFechaReintrego() {
        return fechaReintrego;
    }

    public void setFechaReintrego(LocalDate fechaReintrego) {
        this.fechaReintrego = fechaReintrego;
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

    public Integer getIdNotificacionSolicitud() {
        return idNotificacionSolicitud;
    }

    public void setIdNotificacionSolicitud(Integer idNotificacionSolicitud) {
        this.idNotificacionSolicitud = idNotificacionSolicitud;
    }

    public Integer getIdNotificacionAprobacionRechazo() {
        return idNotificacionAprobacionRechazo;
    }

    public void setIdNotificacionAprobacionRechazo(Integer idNotificacionAprobacionRechazo) {
        this.idNotificacionAprobacionRechazo = idNotificacionAprobacionRechazo;
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

    public Notificacion getNotificacion() {
        return notificacion;
    }

    public void setNotificacion(Notificacion notificacion) {
        this.notificacion = notificacion;
    }

    public Notificacion getNotificacionAR() {
        return notificacionAR;
    }

    public void setNotificacionAR(Notificacion notificacionAR) {
        this.notificacionAR = notificacionAR;
    }
}
