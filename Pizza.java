public class Pizza {
    private PizzaCrust crust;
    private PizzaSauce sauce;
    private PizzaTopping[] toppings;

    public Pizza(PizzaCrust crust, PizzaSauce sauce, PizzaTopping[] toppings) {
        this.crust = crust;
        this.sauce = sauce;
        this.toppings = toppings;
    }

    public void displayPizza() {
        System.out.println("Your Custom Pizza:\n" + crust.toString() + "\n" + sauce.toString());
        for (int i = 0; i < toppings.length && toppings[i] != null; i++) {
            System.out.println(toppings[i]);
        }
    }
}
