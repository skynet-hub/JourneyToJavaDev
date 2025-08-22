package org.example;

import io.javalin.Javalin;

import static io.javalin.apibuilder.ApiBuilder.*;

public class QuoteServer {
    private final Javalin server;

    public QuoteServer() {
        server = Javalin.create(config -> {
            config.http.defaultContentType = "application/json";
        });

        this.server.get("/quotes", QuoteApiHandler::getAll);
        this.server.get("/quote/{id}", QuoteApiHandler::getOne);
        this.server.post("/quotes", QuoteApiHandler::create);
    }

    public static void main(String[] args) {
        QuoteServer server = new QuoteServer();
        server.start(5000);
    }

    public void start(int port) {
        this.server.start(port);
    }

    public void stop() {
        this.server.stop();
    }
}