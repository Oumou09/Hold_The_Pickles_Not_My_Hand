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
        StringBuilder receipt = new StringBuilder();
        receipt.append("=== ORDER RECEIPT ===\n");

        if (!sandwiches.isEmpty()) {
            receipt.append("Sandwiches:\n");
            for (Sandwich sandwich : sandwiches) {
                receipt.append("  - ").append(sandwich.toString()).append("\n");
            }
        }

        if (!drinks.isEmpty()) {
            receipt.append("Drinks:\n");
            for (Drink drink : drinks) {
                receipt.append("  - ").append(drink.toString()).append("\n");
            }
        }

        if (!chips.isEmpty()) {
            receipt.append("Chips:\n");
            for (Chips chip : chips) {
                receipt.append("  - ").append(chip.toString()).append("\n");
            }
        }

        receipt.append("-----------------------\n");
        receipt.append(String.format("Total Price: $%.2f\n", getTotalPrice()));
        receipt.append("Thank you for your order!\n");

        return receipt.toString();
    }

}
