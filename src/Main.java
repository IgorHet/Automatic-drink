public class Main {
    // Загальна вартість замовлення
    private static double totalCost = 0.0;
    // Підрахунок кількості напоїв
    private static int totalDrinks = 0;

    public static void main(String[] args) {
        // Завдання #6: Додайте можливість вибору напою для користувача і залежно від вибору робіть йому напій
        makeMultipleDrinks(DrinksMachine.COFFEE, 2);
        makeMultipleDrinks(DrinksMachine.LEMONADE, 1);
        makeMultipleDrinks(DrinksMachine.TEA, 1);

        // Завдання #8: Виведення загальної суми до сплати
        System.out.println("Total cost: $" + totalCost);
    }

    // Завдання #3: Підрахунок кількості напоїв та загальної суми
    private static void makeDrink(DrinksMachine choice) {
        switch (choice) {
            case COFFEE:
                System.out.println("Making coffee");
                totalCost += Drinks.COFFEE_PRICE;
                totalDrinks++;
                break;
            case TEA:
                System.out.println("Making tea");
                totalCost += Drinks.TEA_PRICE;
                totalDrinks++;
                break;
            case LEMONADE:
                System.out.println("Making lemonade");
                totalCost += Drinks.LEMONADE_PRICE;
                totalDrinks++;
                break;
            case MOJITO:
                System.out.println("Making mojito");
                totalCost += Drinks.MOJITO_PRICE;
                totalDrinks++;
                break;
            case MINERAL_WATER:
                System.out.println("Making mineral water");
                totalCost += Drinks.MINERAL_WATER_PRICE;
                totalDrinks++;
                break;
            case COCA_COLA:
                System.out.println("Making Coca-Cola");
                totalCost += Drinks.COCA_COLA_PRICE;
                totalDrinks++;
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    // Завдання #7: Користувач повинен мати можливість замовити кілька напоїв
    private static void makeMultipleDrinks(DrinksMachine choice, int quantity) {
        for (int i = 0; i < quantity; i++) {
            makeDrink(choice);
        }
    }
}