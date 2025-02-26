import java.util.Scanner;

public class Harshad {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want to test:");
        int n = scanner.nextInt();

        int sumDigits = 0, originalNum = n;

        while (n > 0) {

            sumDigits += n % 10;
            n /= 10;
        }

        if (originalNum % sumDigits == 0) {
            System.out.println("The number is a Harshard number");
        } else {
            System.out.println("The number is not a Harshard number");
        }
        
        scanner.close();
    }
    
}
