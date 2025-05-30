package Sandwiches;

import Menu.Topping;

import java.util.ArrayList;
import java.util.List;

import static apple.laf.JRSUIConstants.Size.LARGE;
import static java.text.DateFormat.MEDIUM;
import static jdk.internal.icu.util.CodePointTrie.Type.SMALL;

public class Sandwich {
    private String bread;
    private int size;
    private boolean isToasted;
    private boolean extraCheese;
    private boolean extraMeat;
    private List<Topping> toppings;


    public Sandwich(String bread, int size, boolean isToasted) {
        this.bread = bread;
        this.size = size;
        this.isToasted = isToasted;
        this.toppings = new ArrayList<Topping>();
    }

    public static final int SMALL = 4;
    public static final int MEDIUM = 8;
    public static final int LARGE = 12;


    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isToasted() {
        return isToasted;
    }

    public void setToasted(boolean toasted) {
        isToasted = toasted;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public void setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
    }

    public boolean isExtraMeat() {
        return extraMeat;
    }

    public void setExtraMeat(boolean extraMeat) {
        this.extraMeat = extraMeat;
    }


    public double calculatedPrice() {
        double basePrice = 0;
        switch (size) {
            case SMALL:
                basePrice = 5.50;
                break;
            case MEDIUM:
                basePrice = 7.00;
                break;
            case LARGE:
                basePrice = 8.50;
                break;
            default:
                throw new IllegalArgumentException("Invalid size: " + size);

        }
        return basePrice;
    }

    public void addTopping(Topping topping){
        toppings.add(topping);
    }


    @Override
    public String toString() {
        return String.format(
                "%s sandwich (Size: %d\", Toasted: %s, Toppings: %s)",
                bread, size, isToasted ? "Yes" : "No", toppings
        );
    }
}
