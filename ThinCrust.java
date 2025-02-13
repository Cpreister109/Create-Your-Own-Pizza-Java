public class ThinCrust extends PizzaCrust {
    public ThinCrust(String ingredient) {
        super(ingredient);
    }

    @Override
    public String toString() {
        return "Thin Crust(" + getIngredient() + ")";
    }
}
