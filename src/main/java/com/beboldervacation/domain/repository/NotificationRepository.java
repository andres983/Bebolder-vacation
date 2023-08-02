package com.beboldervacation.domain.repository;

import com.beboldervacation.domain.Notification;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

public interface NotificationRepository {

    Notification save(Notification notification) throws ParseException;
}
