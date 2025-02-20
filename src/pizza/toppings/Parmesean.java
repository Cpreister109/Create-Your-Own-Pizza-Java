package pizza.toppings;

public class Parmesean extends CheeseTopping {
    @Override
    public Double getPrice() {
        return 2.80;
    }

    public String toString() {
        return "Parmesean";
    }
}
