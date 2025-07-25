package WordGuessingGame;
import java.util.*;

class InputGame extends Game {
    protected Scanner scanner;

    public InputGame(String wordToGuess) {
        super(wordToGuess);
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void playGame() {
        super.playGame();
        String userGuess = "";
        while (!userGuess.equalsIgnoreCase(wordToGuess)) {
            displayHint();
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextLine();
            attempts++;

            if (attempts == wordToGuess.length()){
                System.out.println("All the letters have been revealed, the word is: " + wordToGuess);
                System.out.println("Game Over, better Luck next time!");
                break;
            }

            if (userGuess.equalsIgnoreCase(wordToGuess)) {
                System.out.println("🎉 Congratulations! You've guessed the word in " + attempts + " attempts.");
            } else {
                System.out.println("❌ Incorrect guess. Try again!");
                System.out.println("Revealed so far: " + getRevealedWord(attempts - 1));
            }
        }
    }
}

