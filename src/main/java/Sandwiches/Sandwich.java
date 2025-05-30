package Sandwiches;

import Menu.Topping;

import java.util.ArrayList;
import java.util.List;

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


    public double calculatedPrice(){
        return 0;

    }

    public void addTopping(Topping topping){
        toppings.add(topping);
    }


    @Override
    public String toString() {
        return "Sandwich" +
                "bread='" + bread + '\'' +
                ", size=" + size +
                ", isToasted=" + isToasted +
                ", extraCheese=" + extraCheese +
                ", extraMeat=" + extraMeat +
                ", toppings=" + toppings;
    }
}
