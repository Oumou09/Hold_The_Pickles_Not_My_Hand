package com.pluralsight.capstone2;

import Sandwiches.Sandwich;
import orderDetails.Order;
import orderDetails.OrderFileManager;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        OrderFileManager orderFileManager = new OrderFileManager();
        Order order = new Order();
        orderFileManager.saveOrderToFile(order.toString());

//        ui.processOrder(order);


        UserInterface userInterface = new UserInterface(orderFileManager);
        userInterface.homeScreen();

    }


}
