package pizza.sauce;

public class TomatoSauce extends PizzaSauce {
    @Override
    public Double getPrice() {
        return 2.0;
    }

    public String toString() {
        return "Tomato Sauce";
    }
}
