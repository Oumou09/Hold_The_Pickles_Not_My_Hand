package Toppings;

public abstract class Toppings {
    private String name;

    public Toppings(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public <size> getPrice(size){

    }
}
