package orderDetails;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class OrderFileManager {
        Scanner scanner = new Scanner(System.in);


        public void writeOrderToFile(String string) {
                String timestamp = LocalDateTime.now()
                        .format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
                String filename = "order_" + timestamp + ".txt";
                String sandwichOrder = "";
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
                        writer.write(sandwichOrder);
                        writer.newLine();  // Add a newline for separation if writing multiple orders
                        System.out.println("Order successfully written to file!");
                } catch (IOException e) {
                        System.err.println("Error writing to file: " + e.getMessage());
                        e.printStackTrace();
                }


        }


        public static void saveOrderToFile(String orderData) {

                String timestamp = LocalDateTime.now()
                        .format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
                String filename = "order_" + timestamp + ".txt";

                try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
                        writer.write(orderData);
                        System.out.println("Order saved as: " + filename);
                } catch (IOException e) {
                        System.err.println("Error saving order: " + e.getMessage());
                }



        }

}




