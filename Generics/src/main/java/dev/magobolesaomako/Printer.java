package dev.magobolesaomako;

public class Printer <T>{

    private final T whatToPrint;

    public Printer(T whatToPrint) {
        this.whatToPrint = whatToPrint;
    }

    public void print(){
        System.out.println(whatToPrint);
    }

}
