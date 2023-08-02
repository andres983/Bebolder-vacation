package com.beboldervacation.persistence;

import com.beboldervacation.domain.Notification;
import com.beboldervacation.domain.repository.NotificationRepository;
import com.beboldervacation.persistence.crud.NotificacionCRUDRepository;
import com.beboldervacation.persistence.entity.Notificacion;
import com.beboldervacation.persistence.mapper.NotificationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@Repository
public class NotificacionRepository implements NotificationRepository {

    @Autowired
    private NotificacionCRUDRepository notificacionCRUDRepository;

    @Autowired
    private NotificationMapper notificationMapper;



    @Override
    public Notification save(Notification notification) throws ParseException {
        Notificacion notificacion = notificationMapper.toNotificacion(notification);
        return notificationMapper.toNotification(notificacionCRUDRepository.save(notificacion));
    }
}
