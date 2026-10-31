import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите вещественное число X: ");
        double x = scanner.nextDouble();
        System.out.print("Введите целое число N (> 0): ");
        int n = scanner.nextInt();
        double sum = x;

        for (int i = 1; i <= n; i++) {
            double currentTerm = Math.pow(-1, i) * Math.pow(x, 2 * i + 1) / factorial(2 * i + 1);
            sum += currentTerm;
        }

        System.out.println("Приближенное значение sin(X) " + sum);
        scanner.close();
    }

    public static double factorial(int num) {
        double result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
