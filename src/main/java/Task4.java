import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите a: ");
        double a = scanner.nextDouble();
        double result = sumOfPowers(a);
        System.out.println("Сумма 2-й, 4-й и 6-й степеней числа " + a + " = " + result);
    }

    public static double sumOfPowers(double a) {

        double power2 = Math.pow(a, 2);
        double power4 = Math.pow(a, 4);
        double power6 = Math.pow(a, 6);

        return power2 + power4 + power6;
    }
}