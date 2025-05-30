package Sandwiches;

import static apple.laf.JRSUIConstants.Size.LARGE;
import static java.text.DateFormat.MEDIUM;
import static javax.swing.text.html.HTML.Tag.SMALL;

public class Drink {
    private String name;
    private String size;

    public Drink(String name, String size) {
        this.name = name;
        this.size = size;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }



    public double getPrice(){
        double Price;
        switch (size.trim().toUpperCase()) {
            case "SMALL":
                Price = 2.00;
                break;
            case"MEDIUM":
                Price = 2.50;
                break;
            case "LARGE":
                Price = 3.00;
                break;
            default:
                throw new IllegalArgumentException("Invalid size: " + size);
        }

        return Price;
    }

    @Override
    public String toString() {
        return "Drink: " + name + ",Size: " + size;
    }
}
