package dev.magobolesaomako;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        for (String beanName: context.getBeanDefinitionNames()){
            System.out.println(beanName);
        }

        //Let us get a bean(Car)

        Car car = context.getBean(Car.class);

        System.out.println("Car is starting!");
        car.drive();
        System.out.println("Car is moving");
    }
}