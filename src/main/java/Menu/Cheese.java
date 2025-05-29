package Menu;

public class Cheese extends Topping {

    public Cheese(String name) {
        super(name);
    }

    @Override
    public double getPrice(int size) {
        double totalPrice = 0;
        if (size == 4) {
            totalPrice = 1.00;

            return totalPrice + 1.00;
        }
        if(size == 8){
            return totalPrice + 1.50;
        }
        if (size == 12){
            return totalPrice + 2.00;
        }

        return totalPrice;
    }

//    if(toppings.isExtra){
//
//    }



}
