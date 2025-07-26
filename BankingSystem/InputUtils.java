package BankingSystem;

import java.util.*;

public class InputUtils {
    private Scanner scanner = new Scanner(System.in);

    public String getString(){
        return this.scanner.nextLine();
    }

    public double getDouble(){
        double d = scanner.nextDouble();
        scanner.nextLine(); //consume new line
        return d;
    }

    public int getInt(){
        int i = scanner.nextInt();
        scanner.nextLine(); //consume new line character
        return i;
    }
}
