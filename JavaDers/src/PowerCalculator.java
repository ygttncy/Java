import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Taban sayısını girin: ");
        double base = scanner.nextDouble();

        System.out.print("Üssü girin: ");
        double exponent = scanner.nextDouble();

        double result = Math.pow(base, exponent);
        System.out.println("Sonuç: " + result);
    }
}
