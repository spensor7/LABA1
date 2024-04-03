import java.util.Scanner;

public class Car {
    private int horsepower;
    private double engineVolume;
    private String brand;
    private String model;
    private int year;

    public Car(int horsepower, double engineVolume, String brand, String model, int year) {
        this.horsepower = horsepower;
        this.engineVolume = engineVolume;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            Car[] cars = new Car[3];

            for (int i = 0; i < cars.length; i++) {
                System.out.println("Введіть дані для автомобіля " + (i + 1) + ":");
                System.out.print("Кінські сили: ");
                int horsepower = scanner.nextInt();
                System.out.print("Об'єм двигуна: ");
                double engineVolume = scanner.nextDouble();
                scanner.nextLine(); // Очищення буфера введення
                System.out.print("Марка: ");
                String brand = scanner.nextLine();
                System.out.print("Модель: ");
                String model = scanner.nextLine();
                System.out.print("Рік: ");
                int year = scanner.nextInt();

                cars[i] = new Car(horsepower, engineVolume, brand, model, year);
            }

            double totalEngineVolume = 0;
            int totalHorsepower = 0;

            for (Car car : cars) {
                totalEngineVolume += car.getEngineVolume();
                totalHorsepower += car.getHorsepower();
            }

            System.out.println("Сумарний об'єм двигуна автомобілів: " + totalEngineVolume);
            System.out.println("Сумарні кінські сили автомобілів: " + totalHorsepower);

            System.out.print("Бажаєте продовжити (Так або Ні)? ");
            String choice = scanner.next();
            if (!choice.equalsIgnoreCase("Так")) {
                exit = true;
            }
            scanner.nextLine(); // Очищення буфера введення
        }

        scanner.close();
    }
}