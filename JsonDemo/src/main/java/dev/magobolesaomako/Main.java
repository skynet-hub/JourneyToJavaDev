package dev.magobolesaomako;


import tools.jackson.core.JacksonException;
import tools.jackson.databind.ObjectMapper;
import tools.jackson.databind.node.ObjectNode;

public class Main {
    public static void main(String[] args) {
        String jsonString = "{\"name\":\"Alice\",\"age\":28}";
        ObjectMapper objectMapper = new ObjectMapper();
        try {

            ObjectNode jsonNode = (ObjectNode) objectMapper.readTree(jsonString);
            jsonNode.put("name", "Bob");
            jsonNode.put("isStudent", true);

            String updatedJsonString = objectMapper.writeValueAsString(jsonNode);

            System.out.println("Modified json: " + updatedJsonString);
        } catch (JacksonException e) {
            throw new RuntimeException(e);
        }
    }
}