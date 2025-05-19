import java.util.*;

public class NumberGuessingGame {

    public static void main(String[] args){

        //We want the computer to guess the number the user is thinking between 1 and 100
        //This program uses user feedback to narrow down possible numbers

        //The computer makes a guess and the user will reply with 'h' if higher
        // 'l' if the actual number is lower and 'c' if the guess is correct

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the number guessing game with the computer!");
        System.out.println("Think of a number between 1 and 100 and I will try to guess it");

        //Let us set up the initial range of the game
        int[] numbers = new int[100];
        for (int i = 0; i< numbers.length; i++){
            numbers[i] = i + 1;
        } //So now we have our numbers from 1 to 100 - sorted

        String userInput = "";
        int result = binarySearch(numbers, userInput, scanner);

        if (result != -1){
            System.out.println(numbers[result - 1] + ", This is in fact the number that I am thinking");
        } else {
            System.out.println("The number was not found within the range!");
        }

        scanner.close();
    }

    public static int binarySearch(int[] sortedArray,String userInput, Scanner scanner){
        int low = sortedArray[0];
        int high = sortedArray[sortedArray.length - 1];
        boolean isRunning = true;

        while (isRunning){
            int mid = low + (high - low) / 2;


            System.out.println("My guess is " + mid);
            System.out.println("Give me feedback, 'l' low, 'h' high, 'c' correct: ");
            userInput = scanner.nextLine();

            //Let us handle the case where the computer has actually got the right solution

            if (userInput.equalsIgnoreCase("c")){
                isRunning = false;
                return mid;
            }

            if (userInput.equalsIgnoreCase("l")){
                high = mid - 1;
            }

            if (userInput.equalsIgnoreCase("h")){
                low = mid + 1;
            } else {
                System.out.println("Invalid input please enter 'l', 'c', 'h'.");
            }
        }
        return -1; //Never found, doesn't exist in the array
    }
}
