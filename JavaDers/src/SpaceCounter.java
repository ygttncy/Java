import java.util.Scanner;

public class SpaceCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir cümle girin: ");
        String sentence = scanner.nextLine();

        long spaceCount = sentence.chars().filter(ch -> ch == ' ').count();
        System.out.println("Boşluk sayısı: " + spaceCount);
    }
}
