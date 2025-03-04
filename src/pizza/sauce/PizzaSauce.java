package pizza.sauce;

import pizza.AbstractMenuItem;

public abstract class PizzaSauce extends AbstractMenuItem {
    public abstract String toString();

    @Override
    public Double getPrice() {
        return 2.0;
    }

    public String toNiceString() {
        return "Pizza Sauce could be alfredo or red";
    }
}