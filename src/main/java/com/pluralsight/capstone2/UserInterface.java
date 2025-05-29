package com.pluralsight.capstone2;

import Menu.Bread;
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

    public void processBreadTypeRequest(){
        System.out.println("Please choose your bread type: White, Rye, Wheat, Wrap");
        String breadChoice = scanner.nextLine();
        if(breadChoice.equalsIgnoreCase("White")){
            System.out.println("Selected bread choice is:" + breadChoice.toUpperCase());
            Sandwich.addTopping(new Bread(breadChoice));

        } else if (breadChoice.equalsIgnoreCase("Rye")) {
            System.out.println("Selected bread choice is: " + breadChoice.toUpperCase());
            Sandwich.addTopping(new Bread(breadChoice));

        } else if (breadChoice.equalsIgnoreCase("Wheat")) {
            System.out.println("Selected bread choice is:" + breadChoice.toUpperCase());
            Sandwich.addTopping(new Bread(breadChoice));

        } else if (breadChoice.equalsIgnoreCase("Wrap")) {
            System.out.println("Selected bread choice is:" + breadChoice.toUpperCase());
            Sandwich.addTopping(new Bread(breadChoice));
        }else if (breadChoice.equalsIgnoreCase("")){
            System.out.println("Invalid Input please choose from the four available types of bread available");
        }else {
            System.out.println("The selected bread type is not available at the moment!");

        }



    }

    public void processMeatChoiceRequest(){
        Meat meat = new Meat("") ;
        String meatChoice = scanner.nextLine();

    }

    public void processCreateNewSandwichRequest(){
        System.out.println("What type of bread would you like? ");
        scanner.nextLine();
        String breadType = "Steak";

        Sandwich.addTopping(new Meat(breadType));

    }
    public void processAddSandwichRequest(){

    }
    public void processAddDrinkRequest(){

    }
    public void processAddChipRequest(){

    }
    public void processCheckoutRequest(){

    }
    public void processCancelOrderRequest(){

    }


















}
