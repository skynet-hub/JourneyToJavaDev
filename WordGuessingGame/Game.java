package WordGuessingGame;

import java.util.Arrays;

class Game {
    protected String wordToGuess;
    protected int attempts;
    protected char[] revealedLetters;

    public Game(String wordToGuess) {
        this.wordToGuess = wordToGuess;
        this.attempts = 0;
        this.revealedLetters = new char[wordToGuess.length()];
        Arrays.fill(revealedLetters, '-');
    }

    public void playGame() {
        System.out.println("Welcome to the Word Guessing Game!");
        System.out.println("Try to guess the word!");
    }

    public void displayHint() {
        System.out.println("Hint: The word has " + wordToGuess.length() + " letters.");
    }

    public String getRevealedWord(int index) {
        if (index < wordToGuess.length()){
            revealedLetters[index] = wordToGuess.charAt(index);
        }
        return new String(revealedLetters);
    }
}