package dev.magobolesaomako.controller;

import dev.magobolesaomako.model.Message;
import dev.magobolesaomako.model.User;
import dev.magobolesaomako.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

@Controller
public class ChatController {
    private ChatService chatService;

    @Autowired
    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    public void starChat() {
        Scanner scanner = new Scanner(System.in);

        User user1 = new User("Magobo");
        User user2 = new User("Bongani");

        while (true) {
            System.out.println("Who is sending the message: (Magobo/Bongani)");
            String senderName = scanner.nextLine();

            System.out.println("Enter your message");
            String content = scanner.nextLine();

            User sender = senderName.equalsIgnoreCase("Magobo") ? user1 : user2;
            User receiver = senderName.equalsIgnoreCase("Bongani") ? user1 : user2;

            Message message = new Message(content, receiver, sender);

            System.out.println("Enter 'history' to view message History or 'exit' to exit the program " +
                    "else continue to continue sending messages");

            chatService.sendMessage(message);

            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("history")) {
                chatService.displayChatHistory();
            } else if (command.equalsIgnoreCase("exit")){
                break;
            } else if (!command.equalsIgnoreCase("continue")) {
                System.out.println("Invalid command..... continuing");
            }
        }
    }
}
