import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GameActivity {

    private final WordData data;

    public GameActivity() throws FileNotFoundException {
        this.data = new WordData();
    }

    public static void main(String[] args) throws FileNotFoundException {
        GameActivity game = new GameActivity();
        ArrayList<Hint> hintArrayList = game.data.getHintArrayList();
        int totalHints = game.data.numHints();
        int playerScore = 0;
        Scanner userInput = new Scanner(System.in);

        System.out.println("Welcome to Chatwah, Let's Play!");
        game.data.loadArrayList();
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