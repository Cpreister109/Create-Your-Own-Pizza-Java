public class Pizza {
    private PizzaCrust crust;
    private PizzaSauce sauce;
    private PizzaTopping[] toppings;

    public Pizza(PizzaCrust crust, PizzaSauce sauce, PizzaTopping[] toppings) {
        this.crust = crust;
        this.sauce = sauce;
        this.toppings = toppings;
    }

    public PizzaCrust getCrust() {
        return crust;
    }

    public void displayPizza() {
        System.out.println("Your Custom Pizza:\n" + crust.toString() + "\n" + sauce.toString());
        for (int i = 0; i < toppings.length && toppings[i] != null; i++) {
            if (toppings[i] instanceof MeatTopping) {
                System.out.println(((MeatTopping) toppings[i]).toNiceString());
            } else {
                System.out.println(toppings[i].toString());
            }
        }
    }
}
