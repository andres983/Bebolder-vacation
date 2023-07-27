package com.beboldervacation.persistence.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Vacaciones {

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

    private Empleado empleado;
    private EstadoVacacion estadoVacacion;
}
