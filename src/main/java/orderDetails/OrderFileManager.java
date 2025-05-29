package orderDetails;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class OrderFileManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the name of the payroll file to create: ");
        String outputFileName = scanner.nextLine();

        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName));
            String line;

    }

    }
}

