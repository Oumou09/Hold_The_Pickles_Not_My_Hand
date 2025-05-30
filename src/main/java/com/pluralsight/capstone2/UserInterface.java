package com.pluralsight.capstone2;

import orderDetails.Order;
import Sandwiches.Sandwich;
import Menu.Meat;

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner = new Scanner(System.in);
    private Order currentOrder;

    public void homeScreen() {
        boolean quit = false;
        while(!quit) {
            System.out.println("----------Welcome to Hold The Pickles Not My Hand!----------");
            System.out.println("1. New Order");
            System.out.println("0. Exit ");
            System.out.print("Enter your choice: ");
        }

        String choice = scanner.nextLine();
        switch (choice){
            case "1":
                orderScreen();
                break;
            case "0":
                quit = true;
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }


    }
    public void orderScreen(){
        currentOrder = new Order();
        boolean quit = false;
        while (!quit){
            System.out.println("1. Add Sandwich");
            System.out.println("2. Add Drink");
            System.out.println("3. Add Chips");
            System.out.println("4. Checkout");
            System.out.println("0. Cancel Order");

        }

        String choice1 = scanner.nextLine();
        switch (choice1){
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
                quit = true;
                break;
            default:
                System.out.println("Invalid choice. Please try again.");


        }


    }

    public void processAddSandwichRequest(){
        System.out.println("What type of bread do you want? (White, Wheat, Rye, Wrap)");
        String breadType = scanner.nextLine();

        System.out.println("What size do you want in inches? (4, 8, 12)");
        int size = scanner.nextInt();
        scanner.nextLine().toUpperCase();

        System.out.println("Do you want it toasted?(y/n)");
        Boolean isToasted = scanner.nextBoolean();

        System.out.println("Choose what type of meat you would like on your sandwich?");
        String meatChoice =scanner.nextLine();
        String  meatType = null;

        switch (meatChoice){
            case "1.": Meat meatType0 = new Meat("Steak");
                System.out.println(meatType0);
                break;
            case "2." : Meat meatType1 = new Meat("Ham");
                System.out.println(meatType1);
                break;
            case "3.": Meat meatType2 = new Meat("Salami");
                System.out.println(meatType2);
                break;
            case "4.": Meat meatType3  =new Meat("Roast Beef");
                System.out.println(meatType3);
                break;
            case "5":Meat meatType4 = new Meat("Chicken");
                System.out.println(meatType4);
                break;
            case "6": Meat meatType5 = new Meat("Bacon");
                System.out.println(meatType5);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");

        }
        System.out.println(" What type of cheese would you like on your sandwich? (American, Provolone, Cheddar, and Swiss)");
        String cheeseType = scanner.nextLine().toUpperCase();

        System.out.println("What vegetable would you like? (Lettuce, Peppers, Onions, Tomatoes, Jalapeno, Cucumbers, Pickles, Guacamole, Mushrooms )");
        String vegiType = scanner.nextLine().toUpperCase();

        System.out.println("What condiment would you like? (Mayo, Mustard, Ketchup, Ranch, Thousand Island, Vinaigrette ");
        String condimentType = scanner.nextLine().toUpperCase();

        Sandwich newSandwich1 = new Sandwich(breadType, size, isToasted, cheeseType, vegiType, condimentType);

        currentOrder.addSandwich(newSandwich1);
    }
    public void processAddDrinkRequest(){
        System.out.println("Would you like a drink?");
        


    }
    public void processAddChipRequest(){

    }
    public void processCheckoutRequest(){

    }
    public void processCancelOrderRequest(){

    }


















}
