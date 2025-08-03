import java.util.*;

public class ExceptionHandling {
    //Let us commence with some basic try-catch
    public static void main(String[] args){
        try {
            int ans = divideByZero();
            System.out.println("The solution is: " + ans);
        } catch (ArithmeticException e){
            System.out.println("Division by zero yields undefined results.");
        } catch (InputMismatchException e){
            System.out.println("You have entered a value that is not a number, please enter a number.....");
        }
    }

    public static int divideByZero(){
        Scanner scanner = new Scanner(System.in);

        //Let us get user input, it neither be 0 nor not a number
        System.out.print("Enter the number to divide by: ");
        int num = scanner.nextInt();
        return 10 / num;
    }
}
