package com.pluralsight.capstone2;

import Receipts.Order;
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

    public void processCreateNewSandwichRequest(){
        Order order = new Order();
        order.getSandwiches();
        System.out.println("What type of bread would you like? ");
        scanner.nextLine();
        String meatName = "Steak";

        Sandwich sandwiches;
        sandwiches.addTopping(new Meat(meatName));

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
