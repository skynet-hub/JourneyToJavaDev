package PasswordValidator;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        UserRegistration reg = new UserRegistration();

        System.out.println("Enter the password of you choice, 8 char long but not exceeding 20" +
                "must have uppercase, lowercase and contain special char");
        String password = scanner.nextLine();
        System.out.print("Confirm your password: ");
        String confirmedPassword = scanner.nextLine();

        reg.RegisterUSer(password, confirmedPassword);

    }
}
