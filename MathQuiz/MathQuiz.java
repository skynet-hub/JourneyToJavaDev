package MathQuiz;

import java.util.*;

public class MathQuiz {

    public void mathQuiz(){
        Scanner scanner = new Scanner(System.in);
        Question question = new Question();
        char[] operator = {'+', '-', '/', '*'};

        System.out.println("How many question would you like to answer? ");
        int cycles = scanner.nextInt();
        scanner.nextLine(); //consume new line character
        int score = 0;
        int count = 0;

        for (int i=0; i<cycles; i++){

            Random random = new Random();

            int num1 = random.nextInt(100);
            int num2 = random.nextInt(100);
            char chosenOperator = operator[random.nextInt(operator.length)];

            while (true) {
                count += 1;
                question.setQuestion(num1, num2, chosenOperator);

                //for every question set, get an answer
                int answer = scanner.nextInt();

                //get the actual answer
                int actualAnswer = question.Answer(num1, num2, chosenOperator);

                if (answer == actualAnswer){
                    if (count == 1) {
                        score += 1;
                    }
                    count = 0;
                    System.out.printf("Correct!, Your current score is: %d/%d\n", score, cycles);
                    break;
                } else {
                    System.out.println("Incorrect, Guess again!");
                }
            }
        }
        System.out.printf("Final score is: %d/%d\n", score, cycles);

        scanner.close();
    }
}
