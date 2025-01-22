import java.util.Scanner;

public class CapitalizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir cümle girin: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");
        StringBuilder capitalized = new StringBuilder();

        for (String word : words) {
            capitalized.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
        }

        System.out.println("Sonuç: " + capitalized.toString().trim());
    }
}