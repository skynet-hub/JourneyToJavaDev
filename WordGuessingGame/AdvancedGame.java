package WordGuessingGame;
import java.util.*;

class AdvancedGame extends InputGame {
    private Random random;

    public AdvancedGame(String wordToGuess) {
        super(wordToGuess);
        this.random = new Random();
    }

    @Override
    public void displayHint() {
        super.displayHint();
        if (attempts > 0) {
            revealRandomLetter();
        }
    }

    private void revealRandomLetter() {
        int index;
        do {
            index = random.nextInt(wordToGuess.length());
            List<char[]> word = Arrays.asList(revealedLetters);
            if (!word.contains('-')){
                break;
            }
        } while (revealedLetters[index] != '-');
        revealedLetters[index] = wordToGuess.charAt(index);
    }
}
