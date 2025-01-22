import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir kelime girin: ");
        String word = scanner.nextLine();

        String reversed = new StringBuilder(word).reverse().toString();
        if (word.equalsIgnoreCase(reversed)) {
            System.out.println("Kelime bir palindromdur.");
        } else {
            System.out.println("Kelime bir palindrom değildir.");
        }
    }
}