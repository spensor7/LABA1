import java.util.Scanner;

public class User {
    int id;
    int age;
    String name;
    String surname;
    double weight;
    double height;

    public User(int id, int age, String name, String surname, double weight, double height) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.weight = weight;
        this.height = height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Створення трьох об'єктів класу User
        User user1 = createUser(scanner, 1);
        User user2 = createUser(scanner, 2);
        User user3 = createUser(scanner, 3);

        // Додавання значень віку, ваги і зросту об'єктів
        int totalAge = user1.age + user2.age + user3.age;
        double totalWeight = user1.weight + user2.weight + user3.weight;
        double totalHeight = user1.height + user2.height + user3.height;

        // Виведення результатів на консоль
        System.out.println("Загальний вік: " + totalAge);
        System.out.println("Загальна вага: " + totalWeight);
        System.out.println("Загальний зріст: " + totalHeight);

        // Запит користувача на продовження або завершення програми
        System.out.print("Бажаєте продовжити (Так або Ні)? ");
        String choice = scanner.next();
        if (!choice.equalsIgnoreCase("Так")) {
            System.out.println("До побачення!");
        }

        scanner.close();
    }

    // Метод для створення об'єкта класу User з введених користувачем даних
    private static User createUser(Scanner scanner, int number) {
        System.out.println("Введення даних користувача №" + number + ":");

        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // очистка буфера

        System.out.print("Вік: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // очистка буфера

        System.out.print("Ім'я: ");
        String name = scanner.nextLine();

        System.out.print("Прізвище: ");
        String surname = scanner.nextLine();

        System.out.print("Вага: ");
        double weight = scanner.nextDouble();
        scanner.nextLine(); // очистка буфера

        System.out.print("Зріст: ");
        double height = scanner.nextDouble();
        scanner.nextLine(); // очистка буфера

        return new User(id, age, name, surname, weight, height);
    }
}