package com.beboldervacation.domain.service;

import com.beboldervacation.domain.Notification;
import com.beboldervacation.domain.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@Service
public class NotificationService {

    @Autowired
    private NotificationRepository notificationRepository;

    public Notification save(Notification notification) throws ParseException {
        return notificationRepository.save(notification);
    }
}
