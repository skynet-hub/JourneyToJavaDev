package dev.magobolesaomako;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        GreetingServiceImpl greetingService = new GreetingServiceImpl();
        MessageService messageService = new MessageService();
        greetingService.setMessageService(messageService);

        greetingService.sendGreeting();

    }
}