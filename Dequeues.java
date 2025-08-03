import java.util.*;

public class Dequeues {

    public static void main(String[] args){
        taskQueueApp();
        playingWithStack();
    }



    public static void taskQueueApp() {
        // Create an ArrayDeque to represent a task queue
        //TODO
        ArrayDeque<String> task = new ArrayDeque<>();

        // Add tasks to the queue
        //TODO
        task.add("Task 1: Clean the house");
        task.add("Task 2: Complete Java exercise");
        task.add("Task 3: Pay utility bills");

        // Process and display each task in FIFO order
        System.out.println("Processing tasks:");
        //TODO
        int counter = 1;
        while (!task.isEmpty()){
            System.out.println("Processing: " + task.poll());
        }
    }

    /**
     * This method showcases the anatomy of stack and it's uses
     */

    public static void playingWithStack(){
        //instate stack
        Stack<String> stack = new Stack<>();

        stack.push("Fun1");
        stack.push("Fun2");

        System.out.println("Stack: " + stack);
        System.out.println("First item: " + stack.peek());
        System.out.println("Remove first item from stack: " + stack.pop());
        System.out.println("Stack: " + stack);
    }
}