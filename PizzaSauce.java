public abstract class PizzaSauce implements MenuItem {
    public abstract String toString();

    @Override
    public Double getPrice() {
        return 2.0;
    }

    public String toNiceString() {
        return "Pizza Sauce could be alfredo or red";
    }
}