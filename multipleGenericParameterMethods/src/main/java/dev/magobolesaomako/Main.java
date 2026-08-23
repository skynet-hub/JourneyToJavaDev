package dev.magobolesaomako;


public class Main {
    public static void main(String[] args) {

        printThings("Multiple parameter generic method", 1234);

    }

    public static <T, U> void printThings(T firstThing, U secondThing){
        System.out.println(firstThing);
        System.out.println(secondThing);
    }
}