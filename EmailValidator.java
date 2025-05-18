import java.util.Scanner;

public class EmailValidator {

    public static void main(String[] args){
        //The email must abide to the following rules
        //The email must have one '@' symbol
        //The email must at least contain one '.' after the '@' symbol
        //The '.' cannot be the first or last char after the '@' symbol
        //There cannot be any spaces in between characters
        
        Scanner scanner = new Scanner(System.in);
        
        //Let us get the email of the user and let them know if it is valid or not
        System.out.println("Welcome to email validator!");
        System.out.print("Please provide your email address for validation: ");
        String email = scanner.nextLine();
        
        //Let us run this email through validate method and use results to give feedback
        
        boolean isValid = validateEmail(email);
        
        if (isValid){
            System.out.println("The email you have provided is valid!");
        } else {
            System.out.println("The email you have provided is not valid please try another one.");
        }
        
        scanner.close();
    }

    public static boolean validateEmail(String email) {

        //Check if the email contains '@' sign
        if (!email.contains("@")){
            return false;
        }

        //Let us check if the email contains at least '.' symbol after the '@'
        int indexAt = email.indexOf("@");
        String subEmail = email.substring(indexAt);

        if (!subEmail.contains(".")){
            return false;
        }

        if (email.indexOf(".") == indexAt - 1 || email.indexOf(".") == indexAt + 1){
            return false;
        }

        if (email.contains(" ")){
            return false;
        }

        //Validates that there are characters before and after the '@ symbol
        if (email.indexOf("@") == 0 || email.indexOf("@") == email.length() - 1){
            return false;
        }

        return true;
    }
}
