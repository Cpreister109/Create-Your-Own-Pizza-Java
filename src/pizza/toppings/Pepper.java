package pizza.toppings;

public class Pepper extends VeggieTopping {
    @Override
    public Double getPrice() {
        return 3.85;
    }

    public String toString() {
        return "Pepper";
    }
}
