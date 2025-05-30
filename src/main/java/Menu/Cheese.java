package Menu;

public class Cheese extends Topping {

    public Cheese(String name) {
        super(name);

    }

    @Override
    public double getPrice(int size) {
        return 0;
    }

    @Override
    public String toString() {
        return "Cheese " + getName() ;
    }
}
