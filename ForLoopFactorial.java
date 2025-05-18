import java.util.*;

public class ForLoopFactorial {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a whole number to get the factorial of: ");
        int num = scanner.nextInt();


        int result = 1;
        for (int i=num; i>0; i--){
            result *= i;
        }

        System.out.println("The factorial of " + num + " is " + result);



        scanner.close();
    }
}
