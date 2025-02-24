import java.util.Scanner;

// public class Playground {
//     public static void main(String[] args) {
//         //Playing with if statments

//         // boolean isSunny = true;
//         // String name = "David";

//         // if (name.equals("David")) {
//         //     System.out.println("Welcome David");
//         // }


//         // System.out.println("Outside of any condition");

//         //Trying out nested if statements

//         // int a = 5;
//         // int b = 4;

//         // if (a > 0) {
//         //     if (b > a) {
//         //         System.out.println("B is greater than A");
//         //     }
//         //      System.out.println("Outside if statement");
//         // }

//         //Playing with the ternary operator

//         System.out.println("This is how we use ternary operator, extension");

//         int score = 85;

//         char grade = (score >= 90)? 'A': (score >= 80)? 'B': (score >= 70)? 'C': (score >= 60)? 'D': (score >= 50)? 'E': 'F';

//         System.out.println("You have attained the following symbol for this class: " + grade);
//     }
// }

// public class Playground {

//     public enum Day{
//         MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
//     }

//     public static void main (String[] args) {

//         Day day = Day.MONDAY;

//         switch (day) {
//             case MONDAY:
//                 System.out.println("It is Monday today!");
//                 break;
//             case TUESDAY:
//                 System.out.println("It is Tuesday!");
//             default:
//                 System.out.println("There is no such a day!");
//                 break;
//         }
//     }
// }

//Nested switch cases..........

public class Playground {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Make a choice between a and b");
        String symbol = scanner.nextLine();

        switch (symbol) {
            case "a":
                System.out.println("Select a number between 1 and 2");
                int num = scanner.nextInt();
                
                switch (num) {
                    case 1:
                        System.out.println("Congrats, great choice!");
                        break;
                    case 2:
                        System.out.println("You chose 2, Bad choice");
                        break;
                    default:
                        System.out.println("Not a valid option");
                        break;
                }
                break;
            case "b":
                System.out.println("Bad choice, better luck next time");
                break;
            default:
                System.out.println("Not a valid option");
                break;        
        }


        scanner.close();

    }
}