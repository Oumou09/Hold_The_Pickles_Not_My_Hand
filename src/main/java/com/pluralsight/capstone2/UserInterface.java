package com.pluralsight.capstone2;

import Menu.*;
import Sandwiches.Chips;
import Sandwiches.Drink;
import orderDetails.Order;
import Sandwiches.Sandwich;
import orderDetails.OrderFileManager;

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
                case "2":processAddDrinkRequest();
                    break;
                case "3":processAddChipRequest();
                    break;
                case "4":processCheckoutRequest();
                    break;
                case "0":processCancelOrderRequest();
                    running = false;
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;


            }
        }

        boolean ordering = true;
        while (ordering) {
            boolean checkoutSelected = false;
            if (checkoutSelected) {
                processCheckoutRequest();

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

        System.out.println("Choose what type of meat you would like on your sandwich? (choose a number 1(steak), 2(Ham), 3(Salami), 4(Roast Beef), 5(Chicken) and 6(Bacon)");
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
        System.out.println("What type of cheese would you like on your sandwich? (American, Provolone, Cheddar, and Swiss)");
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


        System.out.print("Do you want extra meat? (y/n): ");
        String wantsExtraMeat = scanner.nextLine().trim().toLowerCase();
        if (wantsExtraMeat.equals("y")) {
            Topping extraMeat = new Meat("Extra Meat");
            newSandwich1.addTopping(extraMeat);
        }

        System.out.print("Do you want extra cheese? (y/n): ");
        String wantsExtraCheese = scanner.nextLine().trim().toLowerCase();
        if (wantsExtraCheese.equals("y")) {
            Topping extraCheese = new Cheese("Extra Cheese");
            newSandwich1.addTopping(extraCheese);
        }

        OrderFileManager orderFileManager = new OrderFileManager();
        orderFileManager.writeOrderToFile(currentOrder.toString());


    }

    public double processAddDrinkRequest(){
        System.out.println("Would you like a drink?(Coca Cola, Sprite, Dr.Pepper, Fanta, and Dasani Water)");
        String drinkType = scanner.nextLine().toUpperCase();
        String size = scanner.nextLine().toUpperCase();
        while (true) {
            System.out.println("What size drink would you like? (SMALL, MEDIUM, LARGE)");
            size = scanner.nextLine().toUpperCase();
            if (size.equals("SMALL") || size.equals("MEDIUM") || size.equals("LARGE")) {
                break;
            }
            System.out.println("Invalid size. Please try again.");
        }

            Drink drink = new Drink(drinkType, size);
            currentOrder.addDrink(drink);
            return drink.getPrice();


    }
    public double processAddChipRequest(){
        System.out.println("Would you like a s chip as well? (Original Lays, Takis Lime , Cheetos, Doritos Nacho ");
        String chipType =  scanner.nextLine();
        Chips chip = new Chips(chipType);
        currentOrder.addChips(chip);
        return 1.50;

    }
    public void processCheckoutRequest(){
        System.out.print("Confirm checkout (y/n): ");
        if (!scanner.nextLine().equalsIgnoreCase("y")) {
            System.out.println("Checkout cancelled.");
            return;
        }

        System.out.println("\n=== YOUR ORDER ===");
        System.out.println(currentOrder);
        System.out.println("=================");

        System.out.println("\nThank you for your order!");

        OrderFileManager orderFileManager = new OrderFileManager();
        orderFileManager.saveOrderToFile(currentOrder.toString());


//        System.out.println("Would you like to place another order (y/n)");
//        String answer = scanner.nextLine().toLowerCase();

//        if (answer.equals("n")) {
//            currentOrder = new Order();
//            System.out.println("Your order has been cancelled. See you next time!");
//        } else {
//            System.out.println("Sucks to see you go. Enjoy your day! Returning to menu...");
//        }

//       scanner.close();
//       orderScreen();
    }




    public void processCancelOrderRequest(){
    Scanner scanner = new Scanner(System.in);
        System.out.println("Are you sure you want to cancel your order? (y/n)");
        String answer = scanner.nextLine().toLowerCase();

        if (answer.equals("y")) {
            currentOrder = new Order();
            System.out.println("Your order has been cancelled. See you next time!");
        } else {
            System.out.println("Order not cancelled. Returning to menu...");
        }
    }







}
