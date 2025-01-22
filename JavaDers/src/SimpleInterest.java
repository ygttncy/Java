import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Anapara miktarını girin: ");
        double principal = scanner.nextDouble();

        System.out.print("Faiz oranını girin (%): ");
        double rate = scanner.nextDouble();

        System.out.print("Süreyi girin (yıl): ");
        double time = scanner.nextDouble();

        double interest = (principal * rate * time) / 100;
        System.out.println("Basit Faiz: " + interest);
    }
}