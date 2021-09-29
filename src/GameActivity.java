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




/*

    void onAnswerSubmission() {
        Hint currentHint = getCurrentHint();
        if (currentHint.isCorrect()) {
            totalCorrect = totalCorrect + 1;
        }
        hints.remove(currentHint);

        // displayHintsRemaining(hints.size());

        if (hints.size() == 0) {
            String gameOverMessage = getGameOverMessage(totalCorrect, totalHints);


            System.out.println(gameOverMessage);
        } else {
            chooseNewHint();

            // displayHint(getCurrentHint());
        }
    }

    void startNewGame() {
        hints = new ArrayList<>();


        Hint hint0 = new Hint("This is a test question!", "Test Answer 0", "Test Answer 1", "Test Answer 2", "Test Answer 3", 2);
        Hint hint1 = new Hint("This is a test question!", "Test Answer 0", "Test Answer 1", "Test Answer 2", "Test Answer 3", 2);
        Hint hint2 = new Hint("This is a test question!", "Test Answer 0", "Test Answer 1", "Test Answer 2", "Test Answer 3", 2);
        Hint hint3 = new Hint("This is a test question!", "Test Answer 0", "Test Answer 1", "Test Answer 2", "Test Answer 3", 2);
        Hint hint4 = new Hint("This is a test question!", "Test Answer 0", "Test Answer 1", "Test Answer 2", "Test Answer 3", 2);
        Hint hint5 = new Hint("This is a test question!", "Test Answer 0", "Test Answer 1", "Test Answer 2", "Test Answer 3", 2);

        hints.add(hint0);
        hints.add(hint1);
        hints.add(hint2);
        hints.add(hint3);
        hints.add(hint4);
        hints.add(hint5);

        totalCorrect = 0;
        totalHints = hints.size();

        Hint firstHint = chooseNewHint();


    }

    Hint chooseNewHint() {
        int newHintIndex = generateRandomNumber(hints.size());
        currentHintIndex = newHintIndex;
        return hints.get(currentHintIndex);
    }

    int generateRandomNumber(int max) {
        double randomNumber = Math.random();
        double result = max * randomNumber;
        return (int) result;
    }

    Hint getCurrentHint() {
        Hint currentHint = hints.get(currentHintIndex);
        return currentHint;
    }

    String getGameOverMessage(int totalCorrect, int totalHints) {
        if (totalCorrect == totalHints) {
            return "You got all " + totalHints + " right! You won!";
        } else {
            return "You got " + totalCorrect + " right out of " + totalHints + ". Better luck next time!";
        }
    }
}
*/
