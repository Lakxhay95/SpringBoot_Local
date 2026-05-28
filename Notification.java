package org.example.BootP01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Notification {
    @Autowired
    public MessageService messageService;
    Notification() {

    }
    Notification(MessageService messageService) {
        this.messageService = messageService;
    }

    public MessageService getMessageService() {
        return messageService;
    }

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void notifyUser() {
        System.out.println(messageService.sendMessage());
    }
}
