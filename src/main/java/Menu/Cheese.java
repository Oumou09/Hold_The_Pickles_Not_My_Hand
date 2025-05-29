package Menu;

public class Cheese extends Topping {
    private boolean isExtra;
    public Cheese(String name) {
        super(name);
        this.isExtra = true;
    }

    @Override
    public double getPrice(int size) {
        double totalPrice = 0;
        if (size == 4) {
            totalPrice = 1.00;
            if (isExtra) {
                return totalPrice + 0.50;
            }
        }else if (size == 8) {
            totalPrice = 2.00;
            if (isExtra) {
                return totalPrice + 1.00;
            }
        }else if (size == 12) {
            totalPrice = 3.00;
            if (isExtra) {
                return totalPrice + 1.50;
            }
        } else {
            System.out.println("Invalid size");
        }

        return totalPrice;
    }



}
