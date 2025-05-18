package Recursion;
import java.util.Scanner;

public class AtBash {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Welcome messages and instructions
        System.out.println("Welcome to the Encoder-Decoder Game!");

        boolean isRunning = true;

        while (isRunning) {

            System.out.println("1. Encode a string");
            System.out.println("2. Decode a string");
            System.out.print("Choose an option (1 or 2): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); //Consume newLine

            System.out.print("Enter the string: ");
            String input = scanner.nextLine();

            if (choice == 1) {
                String word = encode(input, 0);
                System.out.println("The encoded word is: " + word);
            } else {
                String decodedWord = decode(input, 0);
                System.out.println("The encoded word is: " + decodedWord);
            }

            System.out.print("Do you wish to decode or encode more words (yes/no): ");
            String cont = scanner.nextLine();
            if (cont.equalsIgnoreCase("no")){
                isRunning = false;
                System.out.println("Exiting the Atbash program, Goodbye!");
            }
        }
    }

    public static String encode(String input, int index){
        //Cover the base case
        if (index == input.length()){
            return "";
        }

        char ch = input.charAt(index);
        char encodedWord = atBash(ch);
        return encodedWord + encode(input, index + 1); //Recursive call
    }

    public static String decode(String input, int index){
        if (index == input.length()){
            return "";
        }

        char ch = input.charAt(index);
        char encodedChar = atBash(ch);
        return encodedChar + decode(input, index + 1);
    }

    public static char atBash(char ch){
        if (ch >= 'a' && ch<= 'z'){
            return (char) ('z' - (ch - 'a'));
        } else if (ch >= 'A' && ch <= 'Z'){
            return (char) ('Z' - (ch - 'A'));
        } else {
            return ch;
        }
    }
}
