package org.example;

import io.javalin.Javalin;

public class GreetingsApi {

    private final Javalin server;

    public GreetingsApi(){
        this.server = Javalin.create();
        this.server.post("/greet", context -> {
            String name = context.body();
            context.status(201);
            context.result("Hello " + name + "!");
        });
    }

    public Javalin start(){
        return this.server.start(7000);
    }

    public Javalin stop(){
        return this.server.stop();
    }

    public static void main(String[] args){
        GreetingsApi api = new GreetingsApi();
        api.start(); //Start the server make it listen
    }
}
