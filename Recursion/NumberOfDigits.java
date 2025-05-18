package Recursion;
import java.util.*;

public class NumberOfDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to NUmber of Digits!");
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int results = digitsNumber(n);

        System.out.println("The number of digits: " + results);

        scanner.close();
    }

    public static int digitsNumber(int number){
        //Base case
        if (number % 10 == number){
            return 1;
        }

        //Recursive call
        return 1 + digitsNumber(number / 10);
    }
}
