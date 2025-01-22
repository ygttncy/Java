import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir kelime girin: ");
        String word = scanner.nextLine();

        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char c : word.toCharArray()) {
            set.add(c);
        }

        for (char c : set) {
            System.out.print(c);
        }
    }
}