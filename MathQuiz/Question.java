package MathQuiz;

import java.util.Random;

public class Question {
    /*
    Question Bank logic
    We will need randomization to pick randomized question in a list
    Once we get hold of the question we will grab the key and display it to user
    Then once the user answers we can validate with the value which will be the answer
     */

    //Let us generate about 10 questions

    public void setQuestion(int num1, int num2, char chosenOperator){

        System.out.printf("What is %d %c %d?\n", num1, chosenOperator, num2);
    }

    public int Answer(int num1, int num2, char operator){

        return switch (operator) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> num1 / num2;
            default -> 0;
        };
    }

}
