package org.example;

public class Quote {
    private Integer id;
    private String name;
    private String text;

    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return this.id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public void setText(String text){
        this.text = text;
    }

    public String getText(){
        return this.text;
    }

    /**
     * Use this convenient factory method to create custom quotes
     * Warning - The id will be null
     * @param text - Text of the quote
     * @param name - The name of the person who wrote the quote
     * @return a Quote object
     */

    public static Quote create(String text, String name){
        Quote quote = new Quote();
        quote.setText(text);
        quote.setName(name);
        return quote;
    }
}
