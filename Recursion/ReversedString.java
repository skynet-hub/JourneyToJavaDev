package Recursion;
import java.util.*;

public class ReversedString {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to word Reverser!");
        System.out.println("Enter a word you want to reverse");

        String str = scanner.nextLine();
        String reversedWord = reverseString(str);
        System.out.println("The reversed string is " + reversedWord);
    }

    public static String reverseString(String str){
        //This is a base case
        if (str.length() == 1 || str.isEmpty()){
            return str;
        }
        return str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
    }
}
