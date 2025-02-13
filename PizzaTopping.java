public abstract class PizzaTopping {
    Integer spiciness;

    public abstract String toString();

    public void setSpiciness(Integer spiciness) {

    }

    public String toNiceString() {
        return "Pizza Topping Could be a vegetable, meat, or cheese";
    }
}