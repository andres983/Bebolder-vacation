package com.beboldervacation.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empleado")
    private Integer idEmpleado;
    private String usuario;
    @Column(name = "id_tipo_documento")
    private Integer idTipoDocumento;
    private String documento;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String direccion;
    @Column(name = "correo_electronico")
    private String correoElectronico;
    @Column(name = "fecha_ingreso")
    private LocalDate fechaIngreso;
    @Column(name = "fecha_retiro")
    private Date fechaRetiro;
    @Column(name = "id_tipo_contrato")
    private Integer idTipoContrato;
    @Column(name = "id_tipo_cargo")
    private Integer idTipoCargo;
    @Column(name = "id_estado_empleado")
    private Integer idEstado;

    @Column(name = "supervisor_inmediato")
    private String supervisorInmediato;

    @OneToOne
    @JsonIgnore
    @JoinColumn(name = "id_tipo_documento", insertable = false, updatable = false)
    private TipoDocumento tipoDocumento;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "id_tipo_cargo", insertable = false, updatable = false)
    private TipoCargo tipoCargo;

    @OneToOne
    @JsonIgnore
    @JoinColumn(name = "id_tipo_contrato", insertable = false, updatable = false)
    private TipoContrato tipoContrato;

    @OneToOne
    @JsonIgnore
    @JoinColumn(name = "id_estado_empleado", insertable = false, updatable = false)
    private EstadoEmpleado estadoEmpleado;

    @OneToMany(mappedBy = "empleadoVacacion")
    @JsonIgnore
    private List<Vacaciones> vacaciones;
    @OneToMany(mappedBy = "empleado")
    @JsonIgnore
    private List<Notificacion> notificaciones;

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Integer getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(Integer idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaRetiro() {
        return fechaRetiro;
    }

    public void setFechaRetiro(Date fechaRetiro) {
        this.fechaRetiro = fechaRetiro;
    }

    public Integer getIdTipoContrato() {
        return idTipoContrato;
    }

    public void setIdTipoContrato(Integer idTipoContrato) {
        this.idTipoContrato = idTipoContrato;
    }

    public Integer getIdTipoCargo() {
        return idTipoCargo;
    }

    public void setIdTipoCargo(Integer idTipoCargo) {
        this.idTipoCargo = idTipoCargo;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public String getSupervisorInmediato() {
        return supervisorInmediato;
    }

    public void setSupervisorInmediato(String supervisorInmediato) {
        this.supervisorInmediato = supervisorInmediato;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public TipoCargo getTipoCargo() {
        return tipoCargo;
    }

    public void setTipoCargo(TipoCargo tipoCargo) {
        this.tipoCargo = tipoCargo;
    }

    public TipoContrato getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(TipoContrato tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public EstadoEmpleado getEstadoEmpleado() {
        return estadoEmpleado;
    }

    public void setEstadoEmpleado(EstadoEmpleado estadoEmpleado) {
        this.estadoEmpleado = estadoEmpleado;
    }

    public List<Vacaciones> getVacaciones() {
        return vacaciones;
    }

    public void setVacaciones(List<Vacaciones> vacaciones) {
        this.vacaciones = vacaciones;
    }

    public List<Notificacion> getNotificaciones() {
        return notificaciones;
    }

    public void setNotificaciones(List<Notificacion> notificaciones) {
        this.notificaciones = notificaciones;
    }
}


