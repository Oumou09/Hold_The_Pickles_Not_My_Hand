package Menu;

import java.util.Scanner;

public class Cheese extends Topping {

    public Cheese(String name) {
        super(name);

    }

    @Override
    public double getPrice(int size) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Would you like extra cheese? (y/n): ");
        String wantsCheese = scanner.nextLine().trim().toLowerCase();
        double basePrice;
        switch (size) {
            case 4:
                basePrice = 0.75;
                break;
            case 8:
                basePrice = 1.50;
                break;
            case 12:
                basePrice = 2.25;
                break;
            default:
                throw new IllegalArgumentException("Invalid size: " + size);

        }
        double extraPrice = 0;
        if (wantsCheese.equals("y")) {
            switch (size) {
                case 4:
                    extraPrice = 0.30;
                    break;
                case 8:
                    extraPrice = 0.60;
                    break;
                case 12:
                    extraPrice = 0.90;
                    break;
            }
        }
        return basePrice + extraPrice;

    }

    @Override
    public String toString() {
        return getName() ;
    }
}
