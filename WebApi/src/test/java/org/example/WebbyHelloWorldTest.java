package org.example;

import kong.unirest.*;
import org.junit.jupiter.api.*;


import static org.junit.jupiter.api.Assertions.*;

public class WebbyHelloWorldTest {
    @Test
    @DisplayName("GET /hello")
    public void shouldGetHelloWorld(){
        TestableWebbyHelloWorld api = new TestableWebbyHelloWorld();
        api.start(); //Start the webapi on port 7000 for testing
        HttpResponse<String> response = Unirest.get("http://localhost:7000/hello").asString();
        assertEquals(200, response.getStatus());
        assertEquals("Hello world\n", response.getBody());
        api.stop();
    }
}
