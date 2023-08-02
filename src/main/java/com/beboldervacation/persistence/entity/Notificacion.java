package com.beboldervacation.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "notificacion")
public class Notificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String destinatarios;
    private String asunto;
    private String mensaje;
    @Column(name = "id_tipo_notificacion")
    private Integer idTipoNotificacion;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "id_tipo_notificacion", insertable = false, updatable = false)
    private TipoNotifiacion tipoNotifiacion;

    @OneToMany(mappedBy = "notificacion")
    @JsonIgnore
    private List<Vacaciones> vacaciones;

    @OneToMany(mappedBy = "notificacionAR")
    @JsonIgnore
    private List<Vacaciones> listaVacacion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDestinatarios() {
        return destinatarios;
    }

    public void setDestinatarios(String destinatarios) {
        this.destinatarios = destinatarios;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Integer getIdTipoNotificacion() {
        return idTipoNotificacion;
    }

    public void setIdTipoNotificacion(Integer idTipoNotificacion) {
        this.idTipoNotificacion = idTipoNotificacion;
    }

    public TipoNotifiacion getTipoNotifiacion() {
        return tipoNotifiacion;
    }

    public void setTipoNotifiacion(TipoNotifiacion tipoNotifiacion) {
        this.tipoNotifiacion = tipoNotifiacion;
    }

    public List<Vacaciones> getVacaciones() {
        return vacaciones;
    }

    public void setVacaciones(List<Vacaciones> vacaciones) {
        this.vacaciones = vacaciones;
    }

    public List<Vacaciones> getListaVacacion() {
        return listaVacacion;
    }

    public void setListaVacacion(List<Vacaciones> listaVacacion) {
        this.listaVacacion = listaVacacion;
    }
}
