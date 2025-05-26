package Receipts;

import Sandwiches.Chip;
import Sandwiches.Drink;
import Sandwiches.Sandwich;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Sandwich> sandwiches;
    private List<Drink> drinks;
    private List<Chip> Chips;

    public Order(List<Sandwich> sandwiches, List<Drink> drinks, List<Chip> chips) {
        this.sandwiches = new ArrayList<>();
        this.drinks = new ArrayList<>();
       this.Chips = new ArrayList<>();
    }


    public List<Sandwich> getSandwiches() {
        return sandwiches;
    }

    public void setSandwiches(List<Sandwich> sandwiches) {
        this.sandwiches = sandwiches;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<Drink> drinks) {
        this.drinks = drinks;
    }

    public List<Chip> getChips() {
        return Chips;
    }

    public void setChips(List<Chip> chips) {
        Chips = chips;
    }
}
