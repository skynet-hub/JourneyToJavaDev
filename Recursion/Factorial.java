package Recursion;
import java.util.*;

public class Factorial {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a whole number to get its factorial!");
        int number = scanner.nextInt();

        int result = factorial(number);

        System.out.println("The factorial of " + number + " is: " + result);

        scanner.close();
    }

    public static int factorial(int n){
        if (n == 0){
            return 1; //Base case
        }
        return n * factorial(n - 1); //Recursive case
    }
}
