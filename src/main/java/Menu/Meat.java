package Menu;

import java.util.Scanner;

import static apple.laf.JRSUIConstants.Size.LARGE;
import static java.text.DateFormat.MEDIUM;
import static jdk.internal.icu.util.CodePointTrie.Type.SMALL;

public class Meat extends Topping {

    public Meat(String name) {
        super(name);

    }

    @Override
    public double getPrice(int size) {
        Scanner scanner = new Scanner(System.in);
       double  basePrice = 0;
        System.out.println("Would you like extra? (y/n) ");
        String wantsCheese = scanner.nextLine().trim().toLowerCase();
        switch (size) {
            case 4:
                basePrice = 1.00;
                break;
            case 8:
                basePrice = 2.00;
                break;
            case 12:
                basePrice = 3.00;
                break;
            default:
                throw new IllegalArgumentException("Invalid size: " + size);
        }

        double extraPrice = 0;
        if (wantsCheese.equals("y")) {
            switch (size) {
                case 4:
                    extraPrice = 0.50;
                    break;
                case 8:
                    extraPrice = 1.00;
                    break;
                case 12:
                    extraPrice = 1.50;
                    break;
            }
        }
        scanner.close();
        return basePrice + extraPrice;
    }

    @Override
    public String toString() {
        return "Meat " + getName();
    }
}
