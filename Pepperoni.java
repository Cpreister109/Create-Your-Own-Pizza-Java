public class Pepperoni extends MeatTopping {
    @Override
    public Double getPrice() {
        return 4.25;
    }

    public String toNiceString() {
        return "Pepperoni | Spiciness: " + getSpiciness();
    }
}
