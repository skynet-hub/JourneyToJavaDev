package dev.magobolesaomako.service;

import dev.magobolesaomako.model.Message;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChatService {
    private List<Message> messageHistory = new ArrayList<>();

    public void sendMessage(Message message) {
        messageHistory.add(message);

        System.out.println(message.getSender().getName() + " sent a message" +
                "to " + message.getReceiver().getName() + ": " + message.getContent());
    }

    public void displayChatHistory() {
        for (Message message: messageHistory) {
            System.out.println(message.getSender().getName() + " sent a message" +
                    "to " + message.getReceiver().getName() + ": " + message.getContent());
        }
    }
}
