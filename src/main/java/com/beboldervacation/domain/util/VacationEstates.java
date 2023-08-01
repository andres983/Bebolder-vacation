package com.beboldervacation.domain.util;

public enum VacationEstates {
   PARCIAL(1,"Parcial"),
   COMPLETA(2,"Completa"),
   SOLICITADA(3,"Solicitada"),
   RECHAZADA(4, "Rechazada");

   private Integer valor;

   private String nombre;


    VacationEstates(Integer valor, String nombre) {
        this.valor = valor;
        this.nombre = nombre;
    }

    public Integer getValor() {
        return valor;
    }

    public String getNombre() {
        return nombre;
    }
}
