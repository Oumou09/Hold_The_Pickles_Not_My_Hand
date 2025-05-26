package Sandwiches;

import Toppings.Toppings;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {
    private String bread;
    private int size;
    private boolean isToasted;
    private boolean extraCheese;
    private boolean extraMeat;
    private List<Toppings> toppings;


    public Sandwich(String bread, int size, boolean isToasted, boolean extraCheese, boolean extraMeat) {
        this.bread = bread;
        this.size = size;
        this.isToasted = isToasted;
        this.extraCheese = extraCheese;
        this.extraMeat = extraMeat;
        this.toppings = new ArrayList<>();
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


    public getSides(){

    }
    public double calculatedPrize(){

    }
    public addToppins(){

    }



}
