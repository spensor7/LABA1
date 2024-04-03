import java.util.Scanner;

public class Slovo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            String[] words = new String[12];

            // Введення слів з клавіатури
            for (int i = 0; i < words.length; i++) {
                boolean validInput = false;
                while (!validInput) {
                    System.out.print("Введіть слово " + (i + 1) + ": ");
                    String word = scanner.nextLine().trim();
                    if (word.length() == 1 || word.contains(" ")) {
                        System.out.println("Некоректне значення. Будь ласка, введіть слово без пробілів із більше, ніж одного символу.");
                    } else {
                        words[i] = word;
                        validInput = true;
                    }
                }
            }

            // Складання речення зі введених слів
            StringBuilder sentence = new StringBuilder();
            for (String word : words) {
                if (word != null) {
                    sentence.append(word).append(" ");
                }
            }

            // Виведення речення на консоль
            System.out.println("Складене речення: " + sentence.toString().trim());

            // Запит користувача на продовження або завершення програми
            System.out.print("Бажаєте продовжити (Так або Ні)? ");
            String choice = scanner.next();
            if (!choice.equalsIgnoreCase("Так")) {
                exit = true;
            }
            scanner.nextLine(); // Очистка буфера введення
        }

        scanner.close();
    }
}