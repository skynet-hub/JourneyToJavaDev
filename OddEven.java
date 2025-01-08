import java.util.Scanner;

public class OddEven {
    public static void main(String[] args){

        System.out.println("Enter the number you want to test");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

        scanner.close();
    }
}
