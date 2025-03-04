package pizza.toppings;

import pizza.AbstractMenuItem;

public abstract class PizzaTopping extends AbstractMenuItem {
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