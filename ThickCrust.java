public class ThickCrust extends PizzaCrust {
    private Boolean deepDish;

    public ThickCrust(String ingredient, Boolean deepDish) {
        super(ingredient);

        this.deepDish = (deepDish != null) ? deepDish : false;
    }

    private String getDeepDish() {
        if (deepDish) {
            return " (Deep Dish)";
        } else {
            return " (No Deep Dish)";
        }
    }

    public void setDeepDish(Boolean deepDish) {
        this.deepDish = deepDish;
    }

    public String toString() {
        return "Thick Crust (" + ingredient + ")" + getDeepDish();
    }

    @Override
    public String toNiceString() {
        return "Thick Crust (" + ingredient + ")" + getDeepDish();
    }
}
