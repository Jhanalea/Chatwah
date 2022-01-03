import java.lang.*;

public class Hint {

    private final String hintText;
    private final String correctAnswer;

    // Constructor for Hint Object which contains the hint and the answer
    public Hint(String hintText, String correctAnswer) {
        this.hintText = hintText;
        this.correctAnswer = correctAnswer;
    }

    // Getters
    public String getHintText() {
        return hintText;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }
}






