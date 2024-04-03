import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            int[] numbers = new int[10];

            // Введення даних з клавіатури
            for (int i = 0; i < numbers.length; i++) {
                boolean validInput = false;
                while (!validInput) {
                    System.out.print("Введіть ціле число для змінної " + (i + 1) + ": ");
                    if (scanner.hasNextInt()) {
                        numbers[i] = scanner.nextInt();
                        validInput = true;
                    } else {
                        System.out.println("Некоректне значення. Будь ласка, введіть ціле число.");
                        scanner.next(); // Очистка буфера введення
                    }
                }
            }

            // Операції з числами
            int sum = 0;
            int difference = 0;
            int product = 1;
            double quotient = 1.0;

            for (int num : numbers) {
                sum += num;
                product *= num;
            }

            for (int i = 0; i < numbers.length; i++) {
                if (i == 0) {
                    difference = numbers[i];
                    quotient = (double) numbers[i];
                } else {
                    difference -= numbers[i];
                    quotient /= numbers[i];
                }
            }

            // Виведення результатів
            System.out.println("Сума чисел: " + sum);
            System.out.println("Різниця чисел: " + difference);
            System.out.println("Добуток чисел: " + product);
            System.out.println("Частка чисел: " + quotient);

            // Запит користувача на продовження або завершення програми
            System.out.print("Бажаєте продовжити (yes/no)? ");
            String choice = scanner.next();
            if (!choice.equalsIgnoreCase("yes")) {
                exit = true;
            }
        }

        scanner.close();
    }
}