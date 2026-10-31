import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число N: ");
        int n = scanner.nextInt();
        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                continue;
            }
            sum += 1.0 / Math.log(i);
        }

        System.out.println("Сумма ряда: " + sum);
        scanner.close();
    }
}