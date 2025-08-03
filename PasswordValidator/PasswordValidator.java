package PasswordValidator;

import java.util.Arrays;

public class PasswordValidator {
    public void validatePassword(String password,String confirmPass) throws Exception{

        if (password.length() < 8){
            throw new WeakPasswordException("[+] Password length must be 8 characters or longer.......");
        }

        if (password.length() > 20){
            throw new WeakPasswordException("[+] Password must not exceed 20 characters.....");
        }

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;
        String specialCharacters = "!@#$%^&*()-+";

        for (char ch: password.toCharArray()){
            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowercase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (specialCharacters.indexOf(ch) >= 0){
                hasSpecialChar = true;
            }
        }

        boolean isStrong = hasUppercase || hasLowercase || hasDigit || hasSpecialChar;
        if (!isStrong){
            throw new WeakPasswordException("Password must contain at least one uppercase letter," +
                    " one lowercase letter, one digit, and one special character.");
        }

        if (!password.equals(confirmPass)){
            throw new PasswordMismatchException("[+] Confirm password and the first password entered does not correspond....");
        }
    }
}
