import java.util.Scanner;

public class Revers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.print("Введіть трьохзначне число: ");
            String input = scanner.nextLine();

            // Перевірка, чи введено трьохзначне число
            if (input.length() != 3 || !input.matches("\\d+")) {
                System.out.println("Будь ласка, введіть трьохзначне число.");
                continue; // Повернення на початок циклу
            }

            int number = Integer.parseInt(input);

            // Реверс числа
            int reversedNumber = (number % 10) * 100 + ((number / 10) % 10) * 10 + (number / 100);

            System.out.println("Реверсне число: " + reversedNumber);

            System.out.print("Бажаєте продовжити (Так або Ні)? ");
            String choice = scanner.nextLine();
            if (!choice.equalsIgnoreCase("Так")) {
                exit = true;
            }
        }

        scanner.close();
    }
}