import java.util.*;

public class SimpleToDoApp{
    private static List<String[]> toDoList = new ArrayList<>();

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //Welcome the user and display the menu
        System.out.println("Welcome to ToDoApplication, ready to help improve management of your tasks!");
        int userInput;
        do {
            displayMenu();
            System.out.print("What would you like to do? enter a whole number 1, 2 and so forth: ");
            userInput = scanner.nextInt();
            System.out.println();
            scanner.nextLine(); //Consume new line

            if (userInput == 1){
                addTask(scanner);
            } else if (userInput == 2){
                displayTasks();
            } else if (userInput == 4){
                removeTask(scanner);
            } else if (userInput == 3){
                markAsCompleted(scanner);
            }
        } while (userInput != 5);

        System.out.println("Exiting the program, Goodbye!");

        scanner.close();
    }

    public static void displayMenu() {
        System.out.println("ToDoList Menu");
        System.out.println("1. Add a task");
        System.out.println("2. View all tasks");
        System.out.println("3. Mark a task as complete");
        System.out.println("4. Remove a task");
        System.out.println("5. Exit the application");
    }
    public static void displayTasks(){
        if (toDoList.isEmpty()){
            System.out.println("The to do List is empty, tasks have not been added yet!");
        }

        for (String[] task: toDoList){
            System.out.println("Task: " + task[0]);
            System.out.println("Status: " + task[1]);
            System.out.println();
        }
    }


    public static void addTask(Scanner scanner){
        String[] taskWithStatus = new String[2];
        System.out.print("Enter the name of the task you want to add: ");
        String task = scanner.nextLine();
        System.out.print("Enter the status of your task (Not-Started, In-Progress, Completed): ");
        String status = scanner.nextLine();
        taskWithStatus[0] = task;
        taskWithStatus[1] = status;
        toDoList.add(taskWithStatus);
        System.out.println("Task added successfully!");
        System.out.println();
    }

    public static void removeTask(Scanner scanner){
        if (toDoList.isEmpty()){
            System.out.println("Cannot remove a task from an empty todo list.");
        }

        System.out.print("Select an item you would like to pop by providing the number of the task: ");
        int index = scanner.nextInt();
        toDoList.remove(index - 1);
        System.out.println("Task removed successfully");
        System.out.println();
        displayTasks();
        System.out.println();
    }

    public static void markAsCompleted(Scanner scanner){
        //The user needs to state which item they want to mark as complete based on index
        System.out.print("Which item's status do you want to change? ");
        int index = scanner.nextInt();
        scanner.nextLine();
        String[] task = toDoList.get(index - 1);
        System.out.print("Change the status of this task (Not-Started, In-Progress, Completed): ");
        String newStatus = scanner.nextLine();
        task[1] = newStatus;
        System.out.println("Status changed successfully!");
        System.out.println();
        displayTasks();
        System.out.println();
    }

    //Exiting doesn't need a function, but then we will account for it inside the main method

}