public abstract class PizzaTopping implements MenuItem {
    Integer spiciness;

    public abstract String toString();

    public void setSpiciness(Integer spiciness) {

    }

    @Override
    public Double getPrice() {
        return 4.0;
    }

    public String toNiceString() {
        return "Pizza Topping Could be a vegetable, meat, or cheese";
    }
}