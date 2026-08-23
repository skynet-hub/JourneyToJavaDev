package dev.magobolesaomako.main;

import dev.magobolesaomako.config.AppConfig;
import dev.magobolesaomako.service.MessageService;
import dev.magobolesaomako.service.TimeBasedGreetingService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args){
        // Initialize Spring Application Context
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MessageService messageService = appContext.getBean(MessageService.class);

        //Get the name from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String userName = scanner.nextLine();
        messageService.setUserName(userName);

        //Let us work with TimeBasedService
        TimeBasedGreetingService timeBasedGreetingService = appContext.getBean(TimeBasedGreetingService.class);
        String greetings = timeBasedGreetingService.getGreeting();
        System.out.println(greetings);

    }
}
