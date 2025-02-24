    import java.util.Scanner;
     
    public class FibonacciSequence {
     
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of terms:");
            int n = scanner.nextInt();
            scanner.close();
     
            // Initializing the first two terms of the Fibonacci sequence
            int firstTerm = 0, secondTerm = 1;
     
            // Edge case: If n is 1, just print the first term
            if (n == 1) {
                System.out.println(firstTerm);
            } else {
                // Print the first two terms
                System.out.print(firstTerm + " " + secondTerm);
     
                // Using a for loop to calculate and print the next terms
                for (int i = 3; i <= n; i++) {
                    int nextTerm = firstTerm + secondTerm; // Calculate the next term
                    System.out.print(" " + nextTerm); // Print the next term
                    // Update the terms for the next iteration
                    firstTerm = secondTerm;
                    secondTerm = nextTerm;
                }
            }
        }
    }