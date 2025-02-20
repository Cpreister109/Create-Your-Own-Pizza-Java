package pizza.sauce;

public class AlfredoSauce extends PizzaSauce {
    @Override
    public Double getPrice() {
        return 3.75;
    }

    public String toString() {
        return "Alfredo Sauce";
    }
}
