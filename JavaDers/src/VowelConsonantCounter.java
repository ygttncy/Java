import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir kelime girin: ");
        String word = scanner.nextLine().toLowerCase();

        int vowels = 0, consonants = 0;
        for (char c : word.toCharArray()) {
            if ("aeiouöüıiâî".indexOf(c) != -1) {
                vowels++;
            } else if (Character.isLetter(c)) {
                consonants++;
            }
        }

        System.out.println("Sesli harf sayısı: " + vowels);
        System.out.println("Sessiz harf sayısı: " + consonants);
    }
}