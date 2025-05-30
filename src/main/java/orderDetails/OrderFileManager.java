package orderDetails;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class OrderFileManager {
        Scanner scanner = new Scanner(System.in);


        public void writeOrderToFile(String filename, String sandwichOrder) {
                String timestamp = LocalDateTime.now()
                        .format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
                filename = "order_" + timestamp + ".txt";
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
                        writer.write(sandwichOrder);
                        writer.newLine();  // Add a newline for separation if writing multiple orders
                        System.out.println("Order successfully written to file!");
                } catch (IOException e) {
                        System.err.println("Error writing to file: " + e.getMessage());
                        e.printStackTrace();
                }


        }
















        public <Receipt> void saveOrderReceipt(Receipt receipt){
                String timestamp = LocalDateTime.now()
                        .format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
                Object currentOrder = new Object();
                String filename = new StringBuilder().append("receipt_").append(currentOrder.getOrder()).append("_").append(timestamp).append(".txt").toString();

                try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
                        writer.write(receipt.toString());
                        System.out.println("Receipt saved: " + filename);
                } catch (IOException e) {
                        System.err.println("Error saving receipt: " + e.getMessage());
                }
        }

        }



