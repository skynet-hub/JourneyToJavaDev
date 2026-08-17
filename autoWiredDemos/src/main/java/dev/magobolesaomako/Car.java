package dev.magobolesaomako;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    public Engine petrolEngine;

    @Autowired
    public Car(PetrolEngine engine) {
        this.petrolEngine = engine;
    }

    public void drive(){
        System.out.println(petrolEngine.start());
    }

}
