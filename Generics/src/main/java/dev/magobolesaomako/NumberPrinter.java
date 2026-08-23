package dev.magobolesaomako;

// Bounding this to only work with what is inside the Number scope
public class NumberPrinter <T extends Number> {

    T whatToPrint;

    public NumberPrinter(T whatToPrint){
        this.whatToPrint = whatToPrint;
    }

    public void print(){
        System.out.println(whatToPrint);
    }
}
