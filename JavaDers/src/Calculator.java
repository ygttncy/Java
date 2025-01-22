import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("İlk sayıyı girin: ");
        double num1 = scanner.nextDouble();

        System.out.print("İkinci sayıyı girin: ");
        double num2 = scanner.nextDouble();

        System.out.println("Yapmak istediğiniz işlemi seçin: ");
        System.out.println("1. Toplama\n2. Çıkarma\n3. Çarpma\n4. Bölme");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Sonuç: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Sonuç: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Sonuç: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Sonuç: " + (num1 / num2));
                } else {
                    System.out.println("Bölme: Tanımsız (sıfıra bölme)");
                }
                break;
            default:
                System.out.println("Geçersiz seçim.");
        }
    }
}
