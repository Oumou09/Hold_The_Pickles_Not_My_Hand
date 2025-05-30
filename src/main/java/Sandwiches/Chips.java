package Sandwiches;

public class Chips {
    private String type;

    public Chips(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Chips " + type + '\'';
    }

    public double getPrice(){
       return 1.5;
    }
}
