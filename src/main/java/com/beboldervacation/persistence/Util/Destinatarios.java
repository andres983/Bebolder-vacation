package com.beboldervacation.persistence.Util;

public enum Destinatarios {

    SOLICITUD_VACACIONES("jorge.hugo@bebolder.co;estefania.gonzalez@bebolder.co;estefania.lara@bebolder.co");

    private String valor;

    Destinatarios(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }


}
