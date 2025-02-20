package pizza.crust;

public class ThinCrust extends PizzaCrust {
    public ThinCrust(String ingredient) {
        super(ingredient);
    }

    @Override
    public Double getPrice() {
        return 2.50;
    }

    @Override
    public String toString() {
        return "Thin Crust(" + getIngredient() + ")";
    }
}
