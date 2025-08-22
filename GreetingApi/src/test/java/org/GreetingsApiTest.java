package org;
import kong.unirest.*;
import org.example.GreetingsApi;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class GreetingsApiTest {
    @Test
    @DisplayName("POST /greet")
    public void showPostedMessage(){
        GreetingsApi api = new GreetingsApi();
        api.start();

        HttpResponse<String> response = Unirest.post("http://localhost:7000/greet").body("Dave").asString();
        assertEquals(201, response.getStatus());
        assertEquals("Hello Dave!", response.getBody());
    }
}
