package dev.magobolesaomako.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
public class TimeBasedGreetingService implements GreetingService{

    private final MessageService messageService;

    @Autowired
    public TimeBasedGreetingService(MessageService messageService) {
        this.messageService = messageService;
    }

    @Override
    public String getGreeting() {
        String userName = messageService.getUserName();
        LocalTime current = LocalTime.now();
        String greeting;

        if (current.isBefore(LocalTime.NOON)){
            greeting = "Good Morning";
        } else if (current.isBefore(LocalTime.of(18, 0))){
            greeting = "Good Afternoon";
        } else {
            greeting = "Good Evening";
        }

        return greeting + ", " + userName + "!";
    }
}
