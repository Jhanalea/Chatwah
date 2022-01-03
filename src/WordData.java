import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class WordData {

    private final File hint_file = new File("src/Hints.txt");
    private Scanner hintBankScanner;
    private final ArrayList<Hint> hintArrayList = new ArrayList<>();

    public WordData() throws FileNotFoundException {
    }

    public ArrayList<Hint> getHintArrayList() {
        return hintArrayList;
    }

    public int numHints() throws FileNotFoundException {
        int count = 0;
        hintBankScanner = new Scanner(hint_file);
        while (hintBankScanner.hasNextLine()) {
            hintBankScanner.nextLine();
            count++;
        }
        return(count / 2);
    }

    public void loadArrayList() throws FileNotFoundException {
        int totalNumHints = numHints();
        hintBankScanner = new Scanner(hint_file);
        for(int i = 0; i < totalNumHints; i++) {
            hintArrayList.add(new Hint(hintBankScanner.nextLine(), hintBankScanner.nextLine()));
        }
    }
}