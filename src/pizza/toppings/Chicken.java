package pizza.toppings;

public class Chicken extends MeatTopping {
    @Override
    public Double getPrice() {
        return 4.75;
    }

    public String toNiceString() {
        return "Chicken | Spiciness: " + getSpiciness();
    }
}
