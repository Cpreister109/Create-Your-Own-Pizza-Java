package pizza.toppings;

public class Cheddar extends CheeseTopping {
    @Override
    public Double getPrice() {
        return 4.0;
    }

    public String toString() {
        return "Cheddar";
    }
}
