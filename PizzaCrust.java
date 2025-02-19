public abstract class PizzaCrust implements MenuItem {
    protected String ingredient;

    public abstract String toString();

    public PizzaCrust(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public String checkIntegrity(String ingredient) {
        if (ingredient == "Cauliflower") {
            return "Handle carefully - cauliflower crusts\nmight fall apart.";
        } else {
            return "";
        }
    }

    @Override
    public Double getPrice() {
        return 2.90;
    }

    public void setDeepDish(Boolean deepDish) {

    }

    public String toNiceString() {
        return "Pizza Crust could be thin or thick, made with " + ingredient;
    }
}
