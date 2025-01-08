import java.util.Scanner;

public class BudgetExpenseTracker {
   public static void main(String[] args) {
     System.out.println("Welcome to monthly expense tracker!");

     Scanner scanner = new Scanner(System.in);

     System.out.println("Enter your monthly income");

    //Taking user input for monthly income
    double income = scanner.nextDouble();

    //Taking user input for various expenses
    System.out.println("Enter the amount you spent on rent:");
    double rent = scanner.nextDouble();
    System.out.println("Enter the amount spent on groceries:");
    double groceries = scanner.nextDouble();
    System.out.println("Enter amount spent on transportation:");
    double transportation = scanner.nextDouble();
    System.out.println("Enter amount spent on entertainment:");
    double entertainment = scanner.nextDouble();

    double totalExpenses = rent + groceries + transportation + entertainment;

    double remainingBudget = income - totalExpenses;

    //Percentage of income on each expense
    double rentPercentage = (rent / income ) * 100;
    double groceriesPercentage = (groceries / income) * 100;
    double transportationPercentage = (transportation / income) * 100;
    double entertainmentPercentage = (entertainment / income) * 100;

    System.out.println("\n********** Budget Summary **********");
    System.out.printf("Monthly Income: $%.2f\n", income);
    System.out.printf("Total Expenses: $%.2f\n", totalExpenses);
    System.out.printf("Remaining Budget: $%.2f\n", remainingBudget);
    System.out.println("Expenses Breakdown:");
    System.out.printf("  Rent: $%.2f (%.2f%% of income)\n", rent, rentPercentage);
    System.out.printf("  Groceries: $%.2f (%.2f%% of income)\n", groceries, groceriesPercentage);
    System.out.printf("  Transportation: $%.2f (%.2f%% of income)\n", transportation, transportationPercentage);
    System.out.printf("  Entertainment: $%.2f (%.2f%% of income)\n", entertainment, entertainmentPercentage);
    System.out.println("************************************");

     scanner.close();
   } 
}
