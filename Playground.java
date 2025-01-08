public class Playground {
    public static void main(String[] args) {
        //Playing with if statments

        // boolean isSunny = true;
        // String name = "David";

        // if (name.equals("David")) {
        //     System.out.println("Welcome David");
        // }


        // System.out.println("Outside of any condition");

        //Trying out nested if statements

        // int a = 5;
        // int b = 4;

        // if (a > 0) {
        //     if (b > a) {
        //         System.out.println("B is greater than A");
        //     }
        //      System.out.println("Outside if statement");
        // }

        //Playing with the ternary operator

        System.out.println("This is how we use ternary operator, extension");

        int score = 85;

        char grade = (score >= 90)? 'A': (score >= 80)? 'B': (score >= 70)? 'C': (score >= 60)? 'D': (score >= 50)? 'E': 'F';

        System.out.println("You have attained the following symbol for this class: " + grade);
    }
}
