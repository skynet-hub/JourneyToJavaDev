package org.example;
import kong.unirest.*;

public class ClientConnect {
    public static void main(String[] args){
        HttpResponse<String> response = Unirest.get("https://catfact.ninja/fact").asString();
        System.out.println(response.getStatus());
        System.out.println(response.getBody());
    }

}
