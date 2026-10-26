package dev.magobolesaomako;


import tools.jackson.core.JacksonException;
import tools.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) {
        Person zach = new Person();
        zach.setName("Zach");
        zach.setAge(20);

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            // Serialization
            String jsonString = objectMapper.writeValueAsString(zach);
            System.out.println("Stringified JSon: " + jsonString);
        } catch (JacksonException e) {
            throw new RuntimeException(e);
        }
    }
}