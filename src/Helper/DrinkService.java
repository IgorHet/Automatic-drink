package Helper;
public class DrinkService {
public static void makeDrink(DrinksMachine choice) {
    switch (choice) {
        case COFFEE:
            System.out.println("Making coffee");
            break;
        case TEA:
            System.out.println("Making tea");
            break;
        case LEMONADE:
            System.out.println("Making lemonade");
            break;
        case MOJITO:
            System.out.println("Making mojito");
            break;
        case MINERAL_WATER:
            System.out.println("Making mineral water");
            break;
        case COCA_COLA:
            System.out.println("Making Coca-Cola");
            break;
        default:
            System.out.println("Invalid choice");
    }
}
}
