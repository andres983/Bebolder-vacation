package com.beboldervacation.persistence.mapper;

import com.beboldervacation.domain.Notification;
import com.beboldervacation.persistence.entity.Notificacion;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface NotificationMapper {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "destinatarios", target = "recipients"),
            @Mapping(source = "asunto", target = "affair"),
            @Mapping(source = "mensaje", target = "message"),
            @Mapping(source = "idTipoNotificacion", target = "notificationTypeId"),

    })
    Notification toNotification(Notificacion notificacion);

    List<Notification> toNotificationList(List<Notificacion> notificaciones);

    @InheritInverseConfiguration
    Notificacion toNotificacion(Notification notification);
}
