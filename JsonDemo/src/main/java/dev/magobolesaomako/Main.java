package dev.magobolesaomako;


import tools.jackson.core.JacksonException;
import tools.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) {
        String jsonString = "{\"name\":\"Alice\",\"age\":28}";
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            // Deserialization
            Person alice = objectMapper.readValue(jsonString, Person.class);
            System.out.println("Name: " + alice.getName());
            System.out.println("Age: " + alice.getAge());
        } catch (JacksonException e) {
            throw new RuntimeException(e);
        }
    }
}