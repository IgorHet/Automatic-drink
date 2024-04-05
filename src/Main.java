import Helper.DrinkService;
import Helper.Drinks;
import Helper.DrinksMachine;

import java.util.Scanner;
public class Main {
    // Загальна вартість замовлення
    private static double totalCost = 0.0;
    // Підрахунок кількості напоїв
    private static int totalDrinks = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the drinks vending machine!");

        while (true) {
            System.out.println("Choose your drink:");
            System.out.println("1. Coffee");
            System.out.println("2. Tea");
            System.out.println("3. Lemonade");
            System.out.println("4. Mojito");
            System.out.println("5. Mineral Water");
            System.out.println("6. Coca-Cola");
            System.out.println("7. Exit");

            int choice = scanner.nextInt();

            if (choice == 7) {
                break;
            } else if (choice < 1 || choice > 6) {
                System.out.println("Invalid choice");
                continue;
            }

            makeDrink(choice);
        }

        // Завдання #8: Виведення загальної кількості напоїв
        System.out.println("Total number of drinks: " + totalDrinks);
        // Завдання #8: Виведення загальної суми до сплати
        System.out.println("Total cost: $" + totalCost);

        scanner.close();
    }

    // Приготування напоїв
    private static void makeDrink(int choice) {
        DrinksMachine drinkChoice = null;
        switch (choice) {
            case 1:
                drinkChoice = DrinksMachine.COFFEE;
                totalCost += Drinks.COFFEE_PRICE;
                break;
            case 2:
                drinkChoice = DrinksMachine.TEA;
                totalCost += Drinks.TEA_PRICE;
                break;
            case 3:
                drinkChoice = DrinksMachine.LEMONADE;
                totalCost += Drinks.LEMONADE_PRICE;
                break;
            case 4:
                drinkChoice = DrinksMachine.MOJITO;
                totalCost += Drinks.MOJITO_PRICE;
                break;
            case 5:
                drinkChoice = DrinksMachine.MINERAL_WATER;
                totalCost += Drinks.MINERAL_WATER_PRICE;
                break;
            case 6:
                drinkChoice = DrinksMachine.COCA_COLA;
                totalCost += Drinks.COCA_COLA_PRICE;
                break;
        }

        if (drinkChoice != null) {
            DrinkService.makeDrink(drinkChoice);
            totalDrinks++;
        }
    }
}