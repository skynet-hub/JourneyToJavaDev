import java.util.Scanner;

public class BudgetExpense{
    // Importing the necessary Java package for handling user input

    public static void main(String[] args) { 
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their monthly income
        System.out.println("Enter your monthly income:");
        double income = scanner.nextDouble();

        // Initialize variables for expenses
        //TODO
        
        double totalExpenses, remainingBalance;

        // Prompt the user to enter the number of expenses they want to track
        // Remember to consume the newline left-over
        //TODO
        
        System.out.print("Enter the number of expense: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        // Loop to track each expense
        //TODO
        totalExpenses = 0;
    
        for (int i = 0; i < number ; i++) {
            System.out.printf("Enter expense %s: ", (i + 1));
            
            double expense = scanner.nextDouble();
            
            totalExpenses += expense;
        }

        // Calculate the remaining balance
        //TODO
        
        remainingBalance = income - totalExpenses;

        // Display the total income, total expenses, and remaining balance
        //TODO
        
        System.out.print("\n");
        System.out.printf("Total Income: $%.2f\n", income);
        System.out.printf("Total Expenses: $%.2f\n", totalExpenses);
        System.out.printf("Remaining Balance: $%.2f\n", remainingBalance);

        // Provide a financial warning if expenses exceed income
        //TODO

        if (totalExpenses > income)
        System.out.println("Your expenses are too high, this serves as a warning.");

        scanner.close();
    }
}

