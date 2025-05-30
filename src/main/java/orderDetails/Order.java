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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        if (!sandwiches.isEmpty()) {
            sb.append("Sandwiches:\n");
            sandwiches.forEach(s -> sb.append("- ").append(s).append("\n"));
        }
        if (!drinks.isEmpty()) {
            sb.append("\n=== DRINKS ===\n");
            drinks.forEach(drink -> sb.append("- ").append(drink).append("\n"));
        }

        if (!chips.isEmpty()) {
            sb.append("\n=== CHIPS ===\n");
            chips.forEach(chip -> sb.append("- ").append(chip).append("\n"));
        }

        sb.append("\n=== TOTAL ===\n");
        sb.append(String.format("Total: $%.2f", getTotalPrice()));
        return sb.toString();
    }
}
