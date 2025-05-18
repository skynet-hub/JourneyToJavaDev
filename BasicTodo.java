// Import necessary Java packages
import java.util.ArrayList;
import java.util.Scanner;

public class BasicTodo {
    // Declare a global ArrayList to store the todo tasks
    private static ArrayList<String> todoList = new ArrayList<>();
    public static void main(String[] args){

        manageTodoList();

    }

    public static void manageTodoList() {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Welcome to the TODO List Application!");

        // Menu loop
        // Display the menu options
        // Consume the newline character
        // Handle the menu choice
        displayMenu();

        boolean isRunning = true;
        while (isRunning) {
            System.out.print("Select your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();


            if (choice == 1) {
                addTask(scanner);
            } else if (choice == 3) {
                displayTasks();
            } else if (choice == 4){
                isRunning = false;
                System.out.println("Exiting the TODO List Application. Goodbye!");
            } else if (choice == 2){
                removeTask(scanner);
            }
        }
    }

    // Method to display the menu
    private static void displayMenu() {
        System.out.println("TODO List Menu:");
        System.out.println("1. Add a task");
        System.out.println("2. Remove a task");
        System.out.println("3. Display Tasks");
        System.out.println("4. exit");
    }

    // Method to add a task to the TODO list
    private static void addTask(Scanner scanner) {
        System.out.print("Enter the task you want to add: ");
        todoList.add(scanner.nextLine());
        System.out.println("Task added successfully!");
        System.out.println();
    }

    // Method to remove a task from the TODO list
    private static void removeTask(Scanner scanner) {
        // Display the current tasks
        // Remove the task
        //We remove the task by number
        System.out.print("Enter the number of the task you want to remove (1, 2, 3): ");
        try {
            todoList.remove(scanner.nextInt() - 1); //Computer index starts from 0
            System.out.println("Task removed successfully!");
        } catch (IndexOutOfBoundsException e){
            System.out.println("Out of range of the number of tasks added into the list");
        }
        System.out.println();
    }

    // Method to display all tasks in the TODO list
    private static void displayTasks() {
        for (String task: todoList){
            System.out.println(task);
        }
    }
}