    // Importing necessary Java package for user input
    import java.util.Scanner;
     
    public class BasicCalculator {
        public void simpleCalculator() {
            // Create a scanner object to take user input
            Scanner scanner = new Scanner(System.in);
            String continueCalculator;
     
            // Infinite loop to keep the calculator running until the user decides to quit
            do {
                // Prompt the user to enter two numbers
                System.out.println("Enter the first number:");
                double num1 = scanner.nextDouble();
     
                System.out.println("Enter the second number:");
                double num2 = scanner.nextDouble();
     
                // Prompt the user to choose an operation
                System.out.println("Choose an operation (+, -, *, /):");
                char operation = scanner.next().charAt(0);
     
                // Perform the selected operation using a switch statement
                double result = 0;
                boolean validOperation = true;
     
                switch (operation) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            System.out.println("Error: Division by zero is not allowed.");
                            validOperation = false;
                        }
                        break;
                    default:
                        System.out.println("Invalid operation. Please choose +, -, *, or /.");
                        validOperation = false;
                }
     
                // Display the result if the operation was valid
                if (validOperation) {
                    System.out.println("Result: " + result);
                }
     
                // Ask the user if they want to perform another calculation
                System.out.println("Do you want to perform another calculation? (yes/no):");
                continueCalculator = scanner.next();
     
            } while (continueCalculator.equalsIgnoreCase("yes"));
     
            // End the program
            System.out.println("Calculator session ended. Goodbye!");
            scanner.close();
        }
    }