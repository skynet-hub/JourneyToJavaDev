package org.example;

import io.javalin.http.*;
import io.javalin.http.NotFoundResponse;

public class QuoteApiHandler {
    private static final QuoteDB database = new TestDatabase();

    /**
     * Get all quotes
     *
     * @param context The Javalin Context for the HTTP GET Request
     */
    public static void getAll(Context context) {
        context.json(database.all());
    }

    /**
     * Get one quote
     *
     * @param context The Javalin Context for the HTTP GET Request
     */
    public static void getOne(Context context) {
        Integer id = context.pathParamAsClass("id", Integer.class).get();
        Quote quote = database.get(id);
        if (quote == null) {
            throw new NotFoundResponse("Quote not found: " + id);
        }
        context.json(quote);
    }

    /**
     * Create a new quote
     *
     * @param context The Javalin Context for the HTTP POST Request
     */
    public static void create(Context context) {
        Quote quote = context.bodyAsClass(Quote.class);
        Quote newQuote = database.add(quote);
        context.header("Location", "/quote/" + newQuote.getId());
        context.status(HttpStatus.CREATED);
        context.json(newQuote);
    }
}