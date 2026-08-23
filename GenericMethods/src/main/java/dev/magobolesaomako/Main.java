package dev.magobolesaomako;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Integer[] numbers = {1, 2, 3, 4, 5};

        //Before the swap
        System.out.println("Numbers: " + Arrays.toString(numbers));

        //Let us swap two of the items in numbers

        swap(numbers, 2, 3);

        //Post swaping the elements
        System.out.println("Numbers: " + Arrays.toString(numbers));
    }

    public static <T> void swap(T[] arrays, int index1, int index2){

        T temp = arrays[index1];
        arrays[index1] = arrays[index2];
        arrays[index2] = temp;
    }
}