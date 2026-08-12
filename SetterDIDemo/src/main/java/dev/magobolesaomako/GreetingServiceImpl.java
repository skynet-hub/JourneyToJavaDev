package dev.magobolesaomako;

public class GreetingServiceImpl implements GreetingService{

    private MessageService messageService;

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    @Override
    public void sendGreeting() {
        if (messageService != null){
            System.out.println("Message service has been initialized");
            System.out.println(messageService.getMessage());
        } else {
            System.out.println("Message service has not been Initialized");
        }
    }
}
