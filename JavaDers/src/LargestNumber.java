import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin: ");
        int num1 = scanner.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int num2 = scanner.nextInt();

        System.out.print("Üçüncü sayıyı girin: ");
        int num3 = scanner.nextInt();

        int largest = Math.max(num1, Math.max(num2, num3));
        System.out.println("En büyük sayı: " + largest);
    }
}