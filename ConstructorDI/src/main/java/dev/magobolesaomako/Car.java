package dev.magobolesaomako;

public class Car {

    Engine engine;

    // This is where our focus is, notice how the car is dependent on engine
    public Car(Engine engine){
        this.engine = engine;
    }

    /*
    This is the car's driving method
     */

    void drive() {
        engine.start();
    }
}
