package pizza.toppings;

public class Sausage extends MeatTopping {
    @Override
    public Double getPrice() {
        return 5.25;
    }

    public String toNiceString() {
        return "Sausage | Spiciness: " + getSpiciness();
    }
}
