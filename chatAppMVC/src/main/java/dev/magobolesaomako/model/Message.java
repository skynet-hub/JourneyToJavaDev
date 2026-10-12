package dev.magobolesaomako.model;

public class Message {

    private String content;
    private User sender;
    private User receiver;

    public Message(String content, User receiver, User sender) {
        this.content = content;
        this.receiver = receiver;
        this.sender = sender;
    }

    public String getContent() {
        return content;
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }
}
