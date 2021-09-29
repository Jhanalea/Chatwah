import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.lang.*;



public class Hint {

    private String hintText;
    private String correctAnswer;



    // Constructor for Hint Object which contains the hint and the answer
    public Hint(String hintText, String correctAnswer) throws FileNotFoundException {
        this.hintText = hintText;
        this.correctAnswer = correctAnswer;
    }


    // Getters
    public String getHintText(){
        return hintText;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }








/*

    public boolean isCorrect() {
        return playerAnswer == correctAnswer;
    }

    public String getHintText() {
        return hintText;
    }

    public String getAnswer0() {
        return answer0;
    }

    public String getAnswer1() {
        return answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public String getAnswer3() {
        return answer3;
    }
*/

/*
    public void DisplayHint() throws IOException {
        int min = 0;
        int max = 10;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = min; i < max; i++) {
            list.add(i);
        }
        Collections.shuffle(list);

        while (list.size() > min) {
            String hintLine = Files.readAllLines(Paths.get("/Users/jhana/IdeaProjects/Chatwah/src/Hints.txt")).get(list.get(0));
            System.out.println(hintLine);
            list.remove(0);
            System.out.println("Press \"ENTER\" to continue...");
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();

        }
        System.out.println("No More Questions!");
    }
   */

}






