package dev.magobolesaomako;


public class Main {
    public static void main(String[] args) {
        print("Hello World");
        print(20);
        print(14.45);
    }

    public static <T> void print(T whatToPrint){
        System.out.println(whatToPrint);
    }
}