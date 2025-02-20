package pizza.toppings;

public class Olive extends VeggieTopping {
    @Override
    public Double getPrice() {
        return 3.10;
    }

    public String toString() {
        return "Olive";
    }
}
