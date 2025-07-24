package DiceRollingGame;
import java.util.*;


public class Game {
    Scanner scanner = new Scanner(System.in);
    Dice dice1 = new Dice();
    Dice dice2 = new Dice();

    public void game(){
        System.out.println("Welcome to Lucky Dice Adventure!");
        System.out.println("Enter the target score to win: ");
        int targetScore = scanner.nextInt();
        scanner.nextLine(); // consume new line character

        boolean isGameOn = true;
        int currentScore = 0;
        while (isGameOn){
            System.out.println("Press 'r' to roll the dice, 's' to stop: ");
            if (scanner.nextLine().equals("r")){
                dice1.roll();
                int currentValue = dice1.getValue();
                //roll dice 2
                dice2.roll();
                int currentValue2 = dice2.getValue();

                int sum;
                if (currentValue == currentValue2){
                    sum = (currentValue + currentValue2) * 2;
                } else {
                    sum = currentValue + currentValue2;
                }

                currentScore += sum;

                System.out.println("Dice1: " + currentValue);
                System.out.println("Dice2: " + currentValue2);
                System.out.println("current Score: " + currentScore);
                System.out.println("Target Score: " + targetScore);

                if (currentScore >= targetScore){
                    isGameOn = false;
                    System.out.println("Congratulations you have reached your target!");
                }

            } else {
                isGameOn = false;
                System.out.println("You have stopped the game, hope to see you soon!");
                System.out.println("Exiting the program.........");
            }
        }
    }
}
