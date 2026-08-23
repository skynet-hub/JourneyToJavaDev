package dev.magobolesaomako;

public class Main {
    public static void main(String[] args) {
        Printer<String> greeting = new Printer<>("Hello Dave!");
        greeting.print();

        Printer<Integer> number = new Printer<>(200);
        number.print();

        NumberPrinter<Integer> intNum = new NumberPrinter<>(12);
        intNum.print();

        int value = intNum.whatToPrint;
        System.out.println(value);
    }
}