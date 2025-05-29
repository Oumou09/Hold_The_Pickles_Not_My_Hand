package Receipts;

import Sandwiches.Chips;
import Sandwiches.Drink;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Object> sandwiches;
    private List<Drink> drinks;
    private List<Chips> chips;

    public Order() {
        this.sandwiches = new ArrayList<Object>();
        this.drinks = new ArrayList<>();
       this.chips = new ArrayList<>();
    }


    public List<Object> getSandwiches() {
        return sandwiches;
    }





    public List<Drink> getDrinks() {
        return drinks;
    }



    public List<Chips> getChips() {
        return chips;
    }


    public void newSandwich(sandwiches sandwich){
        sandwiches.add(sandwich);

    }



}
