package com.beboldervacation.persistence.entity;

import lombok.Data;

import java.util.List;

@Data
public class Email {
    private Integer id;
    private Integer idUsuario;
    private List<String> destinatarios;
    private String asunto;
    private String mensaje;

    private Empleado empleado;
}
