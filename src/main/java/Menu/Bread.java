package Menu;

public class Bread extends Topping {

    public Bread(String name) {
        super(name);
    }

    @Override
    public double getPrice(int size) {
        return 0;
    }
}
