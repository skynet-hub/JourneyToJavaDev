import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi I am chatbot, How can I assist you today!");
        String userInput = scanner.nextLine();

        if (userInput.equalsIgnoreCase("hi") || userInput.equalsIgnoreCase("hello")) {
            System.out.println("Hello, How can I be of service? ");

        }
        else if (userInput.equalsIgnoreCase("how are you") || userInput.equalsIgnoreCase("How's it going?")) {
            System.out.println("I am doing great and happy to assist with anything you might need help with. How are you?");
        }
        else if (userInput.equalsIgnoreCase("what's the weather like?") || userInput.equalsIgnoreCase("weather")) {
            System.out.println("Weather is great today, it is Sunny and you can go for a swim if you like");
        } else if (userInput.equalsIgnoreCase("bye") || userInput.equalsIgnoreCase("goodbye")) {
            System.out.println("Thank you for using our services, have a lovely day!");
        } else {
            System.out.println("I am not yet modelled to deal with these type of questions, you can ask about the weather, greet me, and say goodbye");
        }


        scanner.close();
    }
}

