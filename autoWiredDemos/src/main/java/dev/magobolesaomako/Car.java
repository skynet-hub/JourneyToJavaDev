package dev.magobolesaomako;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    @Autowired
    public Engine engine;

    public void drive(){
        System.out.println(engine.start());
    }

}
