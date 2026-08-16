package dev.magobolesaomako;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        for (String ContextName: appContext.getBeanDefinitionNames()){
            System.out.println(ContextName);
        }

        NotificationService notificationService = appContext.getBean(NotificationService.class);
        notificationService.notifyUser("dave@gmail.com");
    }
}