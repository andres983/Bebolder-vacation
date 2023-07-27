package com.beboldervacation.persistence.entity;

import lombok.Data;

import javax.persistence.Entity;
import java.util.Date;

@Data
@Entity
public class Empleado {
    private Integer idEmpleado;
    private String usuario;
    private Integer idTipoDocumento;
    private String documento;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String direccion;
    private String correoElectronico;
    private Date fechaIngreso;
    private Date fechaRetiro;
    private Integer idTipoContrato;
    private Integer idTipoCargo;
    private boolean estado;
    private String supervisorInmediato;


    private TipoDocumento tipoDocumento;
    private TipoCargo tipoCargo;
    private TipoContrato tipoContrato;


}


