package Menu;

public class Meat extends Topping {

    public Meat(String name) {
        super(name);

    }

    @Override
    public double getPrice(int size) {
        return 0;

    }

    @Override
    public String toString() {
        return "Meat " + getName();
    }
}
