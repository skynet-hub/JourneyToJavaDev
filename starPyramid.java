import java.util.Scanner;

public class starPyramid {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the levels you want to use: ");
        int levels = scanner.nextInt();
        for (int i = 1; i <= levels; i++) {
            //Print out spaces
            for (int j = 0; j< levels -i ; j++) {
                System.out.print(' ');
            }

            //Now let us print out stars

            for (int k=0; k< 2* i - 1; k++) {
                System.out.print('*');
            }

            System.out.println();
        }
        scanner.close();
    }    
}