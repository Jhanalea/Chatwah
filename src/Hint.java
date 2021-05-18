import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.lang.*;



public class Hint {


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
}









/*
    public int randomIndex(){
        int min = 0;
        int max = 9;
        Random randomInt = new Random();
        int value = randomInt.nextInt(max + min) + min;
        return value;

    }


    public void DisplayHint() throws IOException {
        int n = (listIndex()); // The line number
        String hintLine;

            try (BufferedReader br = new BufferedReader(new FileReader("/Users/jhana/IdeaProjects/Chatwah/src/Hints.txt"))) {

                for (int i = 0; i < max; i++) {
                    br.readLine();
                    hintLine = br.readLine();
                    while (hintLine != null) {
                        System.out.println(hintLine);
                        System.out.println("Press \"ENTER\" to continue...");
                        Scanner scanner = new Scanner(System.in);
                        scanner.nextLine();
                        list.remove(0);
                    }
                }

            } catch (IOException e) {
                System.out.println(e);
            }
        }

 */



