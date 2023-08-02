package com.beboldervacation.web.controller;

import com.beboldervacation.domain.Notification;
import com.beboldervacation.domain.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/notification")
public class NotificationController {

    private final NotificationService notificationService;

    @Autowired
    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping("/save")
    public ResponseEntity<Notification> save(@RequestBody Notification notification) throws ParseException {
        return new ResponseEntity<>(notificationService.save(notification), HttpStatus.CREATED);
    }
}
