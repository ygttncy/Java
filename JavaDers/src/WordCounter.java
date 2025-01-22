import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir cümle girin: ");
        String sentence = scanner.nextLine();

        System.out.print("Aranacak kelimeyi girin: ");
        String word = scanner.nextLine();

        String[] words = sentence.split(" ");
        int count = 0;
        for (String w : words) {
            if (w.equals(word)) {
                count++;
            }
        }
        System.out.println("Kelime sayısı: " + count);
    }
}
