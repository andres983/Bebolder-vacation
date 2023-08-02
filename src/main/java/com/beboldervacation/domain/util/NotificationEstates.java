package com.beboldervacation.domain.util;

public enum NotificationEstates {
   EMAIL(1,"email"),
   SMS(2,"sms"),
   WHATSAPP(3,"whatsapp");

   private Integer valor;
   private String nombre;

    NotificationEstates(Integer valor, String nombre) {
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
