import java.util.Scanner;

public class WordLengths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir cümle girin: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");
        for (String word : words) {
            System.out.println(word + ": " + word.length());
        }
    }
}