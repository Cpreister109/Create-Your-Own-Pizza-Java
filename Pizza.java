public class Pizza implements MenuItem {
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

    @Override
    public Double getPrice() {
        Double totalPrice = 0.0;
        totalPrice += this.crust.getPrice() + this.sauce.getPrice();
        for (int i = 0; i < toppings.length && toppings[i] != null; i++) {
            totalPrice += this.toppings[i].getPrice();
        }

        return totalPrice;
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

        System.out.println("Total Cost of your Pizza: " + getPrice());
    }
}
