import java.util.*;

public class WordScrambleGame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Word Scramble game!");
        System.out.println("Unscramble the magic words to score points.");

        //A list of words to be used in the game.
        String[] words = {"alligator", "facts", "sanding", "can't",
                "handle", "camera", "January", "clever", "entertain"};

        Random random = new Random();

        boolean isRunning = true;
        int score = 0;
        int attempts = 3;


        while (isRunning){
        int randomNum = random.nextInt(words.length);  //Random number from zero to length of word array.

        //Random word
        String randomWord = words[randomNum];

        char[] letters = randomWord.toCharArray();

        String wordToArrange = UnscrambleWord(letters);  //Calling of the function to get a word


        String answer;
        do {
            System.out.println("Guess what this word is: " + wordToArrange);
            answer = scanner.nextLine();
            if (answer.equalsIgnoreCase(randomWord)){
                break;
            }
            attempts -= 1;
            System.out.println("You answer is incorrect, Try again!");
            System.out.println("Current Score is: " + score);
            System.out.println("You have " + attempts + " attempts remaining.");

        } while (!answer.equalsIgnoreCase(randomWord) && attempts > 0);

        if (attempts == 0){break;}

        System.out.println("You got it right, the word is " + randomWord);
        score += 1;
        System.out.println("Current score is: " + score);

        System.out.println("Would you like to continue playing, (yes/no): ");
        String userInput = scanner.nextLine();

        if (userInput.equalsIgnoreCase("no") || attempts == 0){
            isRunning = false;
        }
        }
        System.out.println("Thank you for playing, your final score is: " + score);
    }

    public static String UnscrambleWord(char[] word){

        //Let us create a random index to use to randomize positions of the word
        Random rand = new Random();

        for (int i = 0; i < word.length; i++) {
            int randomIndexToSwap = rand.nextInt(word.length);
            char temp = word[randomIndexToSwap];
            word[randomIndexToSwap] = word[i];
            word[i] = temp;
        }
        return new String(word);
    }
}
