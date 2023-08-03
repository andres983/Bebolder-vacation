package com.beboldervacation.persistence.Util;

public enum Constantes {

    VALUE_CERO(0);

    private Integer valor;

    Constantes(Integer valor) {
        this.valor = valor;
    }

    public Integer getValor() {
        return valor;
    }
}
