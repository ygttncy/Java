import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Puanınızı girin: ");
        int score = scanner.nextInt();

        if (score >= 90) {
            System.out.println("Not: A");
        } else if (score >= 80) {
            System.out.println("Not: B");
        } else if (score >= 70) {
            System.out.println("Not: C");
        } else if (score >= 60) {
            System.out.println("Not: D");
        } else {
            System.out.println("Not: F");
        }
    }
}