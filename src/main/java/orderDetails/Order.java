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


    public double getTotalPrice(){
        double total = 0.0;
        total += sandwiches.stream().mapToDouble(Sandwich::calculatedPrice).sum();
        total += drinks.stream().mapToDouble(Drink::getPrice).sum();
        total += chips.stream().mapToDouble(Chips::getPrice).sum();
        return total;


    }

    public void processOrder(Order order) {
        OrderFileManager orderFileManager = new OrderFileManager();
        orderFileManager.saveOrderToFile(order.toString());
    }




}
