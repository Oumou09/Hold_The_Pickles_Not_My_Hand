package com.pluralsight.capstone2;

import Menu.Cheese;
import Menu.Condiment;
import Menu.Vegetable;
import Sandwiches.Chips;
import Sandwiches.Drink;
import orderDetails.Order;
import Sandwiches.Sandwich;
import Menu.Meat;

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner = new Scanner(System.in);
    private Order currentOrder;

    public void homeScreen() {
        boolean running = true;
        while(running) {
            System.out.println("----------Welcome to Hold The Pickles Not My Hand!----------");
            System.out.println("1. New Order");
            System.out.println("0. Exit ");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    orderScreen();
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

    }

    public void orderScreen(){
        currentOrder = new Order();
        boolean running = true;
        while (running) {
            System.out.println("1. Add Sandwich");
            System.out.println("2. Add Drink");
            System.out.println("3. Add Chips");
            System.out.println("4. Checkout");
            System.out.println("0. Cancel Order");


            String choice1 = scanner.nextLine();
            switch (choice1) {
                case "1":
                    processAddSandwichRequest();
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "0":
                    running = false;
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;


            }
        }

    }

    public void processAddSandwichRequest(){
        System.out.println("What type of bread do you want? (White, Wheat, Rye, Wrap)");
        String breadType = scanner.nextLine().toUpperCase();

        System.out.println("What size do you want in inches? (4, 8, 12)");
        int size = Integer.parseInt(scanner.nextLine());

        System.out.println("Do you want it toasted?(y/n)");
        boolean isToasted = scanner.nextLine().equalsIgnoreCase("y");

        System.out.println("Choose what type of meat you would like on your sandwich? (choose between 1(steak), 2(Ham), 3(Salami), 4(Roast Beef), 5(Chicken) and 6(Bacon)");
        String meatChoice = scanner.nextLine();
        Meat meatType = null;

        switch (meatChoice){
            case "1":
                meatType = new Meat("Steak");
                System.out.println(meatType);
                break;
            case "2" :
                meatType = new Meat("Ham");
                System.out.println(meatType);
                break;
            case "3": meatType = new Meat("Salami");
                System.out.println(meatType);
                break;
            case "4": meatType  = new Meat("Roast Beef");
                System.out.println(meatType);
                break;
            case "5":meatType = new Meat("Chicken");
                System.out.println(meatType);
                break;
            case "6": meatType = new Meat("Bacon");
                System.out.println(meatType);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");

        }
        System.out.println(" What type of cheese would you like on your sandwich? (American, Provolone, Cheddar, and Swiss)");
        String cheeseType = scanner.nextLine().toUpperCase();
        Cheese cheese = new Cheese(cheeseType);

        System.out.println("What vegetable would you like? (Lettuce, Peppers, Onions, Tomatoes, Jalapeno, Cucumbers, Pickles, Guacamole, Mushrooms )");
        String vegiType = scanner.nextLine().toUpperCase();
        Vegetable veggie = new Vegetable(vegiType);

        System.out.println("What condiment would you like? (Mayo, Mustard, Ketchup, Ranch, Thousand Island, Vinaigrette ");
        String condimentType = scanner.nextLine().toUpperCase();
        Condiment condiment = new Condiment(condimentType);

        Sandwich newSandwich1 = new Sandwich(breadType, size, isToasted);

        newSandwich1.addTopping(meatType);
        newSandwich1.addTopping(cheese);
        newSandwich1.addTopping(veggie);
        newSandwich1.addTopping(condiment);
        currentOrder.addSandwich(newSandwich1);
    }

    public double processAddDrinkRequest(){
        System.out.println("Would you like a drink?(Coca Cola, Sprite, Dr.Pepper, and Fanta)");
        String drinkType = scanner.nextLine().toUpperCase();
        System.out.println("What size drink would you like? (S), (M), (L)");
        String size =scanner.nextLine();
        Drink drink = new Drink(drinkType,size);
        if(size.equalsIgnoreCase("S")){
            currentOrder.addDrink(drink);
            return 2.00;
        }else if(size.equalsIgnoreCase("M")){
            currentOrder.addDrink(drink);
            return 2.50;
        } else if (size.equalsIgnoreCase("L")){
            currentOrder.addDrink(drink);
            return 3.00;
        }else {
            System.out.println("Error Invalid input");
            return 0;
        }

    }
    public double processAddChipRequest(){
        System.out.println("Would you like a s chip as well? (Original Lays, Takis Lime , Cheetos, Doritos Nacho ");
        Chips chipType = new Chips("");
        currentOrder.addChips(chipType);
        return 1.50;

    }
    public void processCheckoutRequest(){

    }
    public void processCancelOrderRequest(){

    }


















}
