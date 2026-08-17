package dev.magobolesaomako;

import org.springframework.stereotype.Component;

@Component("petrolEngine")
public class PetrolEngine implements Engine{
    @Override
    public String start() {
        return "Petrol Engine is running!!!!!!";
    }
}
