package com.nowTech.springDemo;

import org.springframework.stereotype.Service;

@Service
public class MessageService {
    public String Greetings(){
        return "Hello From Message Service";
    }
}
