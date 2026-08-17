package dev.magobolesaomako;

import org.springframework.stereotype.Component;

@Component("dieselEngine")
public class DieselEngine implements Engine{
    @Override
    public String start() {
        return "Diesel Engine is Running!!!!!!";
    }
}
