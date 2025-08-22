package org.example;

import com.fasterxml.jackson.annotation.Nulls;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class QuoteTest {

    Quote quote = Quote.create("We do not afford ourselves a change to grow, today's youth is forward", "Dave");
    @Test
    @DisplayName("Null_Id")
    public void testId(){
        assertNull(quote.getId());
    }

    @Test
    @DisplayName("nameOfQuote")
    public void testName(){
        assertEquals("Dave", quote.getName());
    }

    @Test
    @DisplayName("QuoteText")
    public void testText(){
        assertEquals("We do not afford ourselves a change to grow, today's youth is forward", quote.getText());
    }
}
