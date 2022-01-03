import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GameActivity {



    public static void main(String[] args) throws FileNotFoundException {
        int playerScore = 0;
        int totalHints = 5;
        Scanner userInput = new Scanner(System.in);
        ArrayList<Hint> hintArrayList = new ArrayList<>();


        Scanner hintBankScanner = new Scanner(new File("/Users/jhana/IdeaProjects/Chatwah/src/Hints.txt"));
        for(int i = 0; i < totalHints; i++) {
            hintArrayList.add(new Hint(hintBankScanner.nextLine(), hintBankScanner.nextLine()));
        }

        System.out.println("Welcome to Chatwah, Let's Play!");
        Collections.shuffle(hintArrayList);
        for (Hint hint : hintArrayList) {
            System.out.println(hint.getHintText());
            System.out.println("Please Enter Your Answer");
            String userAnswer = userInput.nextLine();
            if (userAnswer.equalsIgnoreCase(hint.getCorrectAnswer())) {
                playerScore++;
                System.out.println("Correct!");
            } else {
                System.out.println("Sorry, that was incorrect! The correct answer is: " + hint.getCorrectAnswer());
            }

        }

        if (playerScore == totalHints) {
            System.out.println("You got all " + totalHints + " right! You won!");
        } else {
            System.out.println("You got " + playerScore + " right out of " + totalHints + ". Better luck next time!");
        }

    }

}