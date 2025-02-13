public abstract class PizzaCrust {
    protected String ingredient;

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
            return "Handle carefully - cauliflower crusts might fall apart.";
        } else {
            return "";
        }
    }

    public abstract String toString();

    public void setDeepDish(Boolean deepDish) {

    }

    public String toNiceString() {
        return "Pizza Crust could be thin or thick, made with " + ingredient;
    }
}
