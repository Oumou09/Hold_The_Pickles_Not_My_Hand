package orderDetails;

import Sandwiches.Chips;
import Sandwiches.Drink;
import Sandwiches.Sandwich;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Sandwich> sandwiches;
    private List<Drink> drinks;
    private List<Chips> chips;

    public Order() {
        this.sandwiches = new ArrayList<>();
        this.drinks = new ArrayList<>();
       this.chips = new ArrayList<>();
    }


    public List<Sandwich> getSandwiches() {

        return sandwiches;
    }



    public List<Drink> getDrinks() {

        return drinks;
    }


    public List<Chips> getChips() {

        return chips;
    }

    public void addSandwich(Sandwich sandwich){
        sandwiches.add(sandwich);

    }

    public void addDrink(Drink drink){

        drinks.add(drink);
    }

    public void addChips(Chips chip){
        chips.add(chip);
    }




}
