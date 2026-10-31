import java.util.Scanner;

public class Task5 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isRunning = true;

        while (isRunning) {
            printMenu();
            int choice = inputInt("Выберите пункт меню: ");

            switch (choice) {
                case 1:
                    runCalculation();
                    break;
                case 2:
                    printAboutProgram();
                    break;
                case 3:
                    printAboutDeveloper();
                    break;
                case 4:
                    isRunning = false;
                    System.out.println("Выход из программы");
                    break;
                default:
                    System.out.println("Ошибка: неверный пункт меню. Попробуйте еще раз.");
            }
            System.out.println();
        }

        scanner.close();
    }


    private static void printMenu() {
        System.out.println("ГЛАВНОЕ МЕНЮ");
        System.out.println("1. Выполнить расчёт");
        System.out.println("2. Информация о программе");
        System.out.println("3. Информация о разработчике");
        System.out.println("4. Выход");
    }

    private static void printAboutProgram() {
        System.out.println("О ПРОГРАММЕ");
        System.out.println("Программа предназначена для расчёта кинетической энергии.");
        System.out.println("Формула: Ek = (m * v^2) / 2");
    }

    private static void printAboutDeveloper() {
        System.out.println("О РАЗРАБОТЧИКЕ");
        System.out.println("Разработал: Кожевников Артем");
        System.out.println("Группа: РИ-250911");
        System.out.println("Год: 2026");
    }

    private static void runCalculation() {
        System.out.println("РАСЧЕТ КИНЕТИЧЕСКОЙ ЭНЕРГИИ");

        double mass = getValidInput("Введите массу тела в кг (m > 0): ", "Ошибка: масса должна быть больше 0", true);
        double velocity = getValidInput("Введите скорость тела в м/с (v >= 0): ", "Ошибка: скорость не может быть отрицательной", false);

        if (Double.isNaN(mass) || Double.isNaN(velocity)) {
            System.out.println("Расчет отменён");
            return;
        }

        double kineticEnergy = (mass * velocity * velocity) / 2.0;

        System.out.printf("Масса: %.3f кг%n", mass);
        System.out.printf("Скорость: %.3f м/с%n", velocity);
        System.out.printf("Кинетическая энергия: %.3f Дж%n", kineticEnergy);
    }


    private static double getValidInput(String prompt, String errorMessage, boolean isStrictlyPositive) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.next();

            if (input.equalsIgnoreCase("q")) {
                return Double.NaN;
            }

            try {
                double value = Double.parseDouble(input);

                if (isStrictlyPositive && value <= 0) {
                    System.out.println(errorMessage);
                } else if (!isStrictlyPositive && value < 0) {
                    System.out.println(errorMessage);
                } else {
                    return value;
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введено не число. Попробуйте еще раз или введите q для отмены");
            }
        }
    }

    private static int inputInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.next();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите целое число");
            }
        }
    }
}