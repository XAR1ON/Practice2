import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число N (> 0): ");
        int n = scanner.nextInt();
        System.out.print("Цифры в обратном порядке: ");

        while (n > 0) {
            int digit = n % 10;
            System.out.print(digit + " ");
            n = n / 10;
        }
        scanner.close();
    }
}