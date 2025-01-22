import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci kelimeyi girin: ");
        String word1 = scanner.nextLine();

        System.out.print("İkinci kelimeyi girin: ");
        String word2 = scanner.nextLine();

        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Kelime anagramdır.");
        } else {
            System.out.println("Kelime anagram değildir.");
        }
    }
}