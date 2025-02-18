public class Beef extends MeatTopping {
    @Override
    public Double getPrice() {
        return 4.50;
    }

    public String toNiceString() {
        return "Beef | Spiciness: " + getSpiciness();
    }
}
