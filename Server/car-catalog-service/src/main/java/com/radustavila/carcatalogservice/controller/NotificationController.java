package com.radustavila.carcatalogservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

import java.util.Date;

@Controller
public class NotificationController {

    @Autowired
    SimpMessagingTemplate simpMessagingTemplate;

    @Scheduled(fixedRate = 5000)
    private void sendNotification() {
        System.out.println("Trigger notification  " + new Date());
        simpMessagingTemplate.convertAndSend("/app/notification", "HEY FROM SERVER @ " + new Date());
    }
}
