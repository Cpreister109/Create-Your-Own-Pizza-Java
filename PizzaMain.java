import java.util.Scanner;

public class PizzaMain {
    public static void main(String[] args) {
        int usrCrust;
        int usrIngredient;
        String ingredient;
        char deepDish;
        int usrSauce;
        int toppingAmount;
        int usrTopping;
        Integer spicy;
        Pizza pizza;
        PizzaCrust crust;
        PizzaSauce sauce;
        PizzaTopping currTopping;
        PizzaTopping[] toppings = new PizzaTopping[4];
        String sep = "-------------------------------------------\n";
        Scanner in = new Scanner(System.in);

        System.out.println(sep + "What Kind of crust would you like?:\n1 - Thin Crust\n2 - Thick Crust\nYour choice: ");
        usrCrust = in.nextInt();
        System.out.println(sep + "What Ingredients for your crust?:\n1 - Flour\n2 - Cauliflower\nYour choice: ");
        usrIngredient = in.nextInt();

        if (usrIngredient == 1) {
            ingredient = "Flour";
        } else {
            ingredient = "Cauliflower";
        }

        if (usrCrust == 1) {
            crust = new ThinCrust(ingredient);
        } else {
            crust = new ThickCrust(ingredient, false);
            System.out.println("Would you like your crust to be deep dish? (Y/N)\nYour choice: ");
            deepDish = in.next().charAt(0);
            if (deepDish == 'Y') {
                crust.setDeepDish(true);
            } else {
                crust.setDeepDish(false);
            }
        }

        System.out.println(sep + "What Kind of sauce would you like?:\n1 - Alfredo\n2 - Tomato\nYour choice: ");
        usrSauce = in.nextInt();
        if (usrSauce == 1) {
            sauce = new AlfredoSauce();
        } else {
            sauce = new TomatoSauce();
        }

        System.out.println(sep + "How many toppings would you like? (0 - 4)");
        toppingAmount = in.nextInt();
        for (int i = 0; i < toppingAmount; i++) {
            System.out.println(sep +
                    "What kind of toppings would you like?:\n" + //
                    "1 - Beef\n" + //
                    "2 - Chicken\n" + //
                    "3 - Pepperoni\n" + //
                    "4 - Sausage\n" + //
                    "5 - Cheddar\n" + //
                    "6 - Provolone\n" + //
                    "7 - Parmesean\n" + //
                    "8 - Mozzarella\n" + //
                    "9 - Olives\n" + //
                    "10 - Peppers\n" + //
                    "11 - Celery\n" + //
                    "12 - Onion\n" + //
                    "Your choices (pick 4 toppings): ");

            usrTopping = in.nextInt();
            switch (usrTopping) {
                case 1:
                    spicy = askSpicy(in);
                    currTopping = new Beef();
                    currTopping.setSpiciness(spicy);
                    break;
                case 2:
                    spicy = askSpicy(in);
                    currTopping = new Chicken();
                    currTopping.setSpiciness(spicy);
                    break;
                case 3:
                    spicy = askSpicy(in);
                    currTopping = new Pepperoni();
                    currTopping.setSpiciness(spicy);
                    break;
                case 4:
                    spicy = askSpicy(in);
                    currTopping = new Sausage();
                    currTopping.setSpiciness(spicy);
                    break;
                case 5:
                    currTopping = new Cheddar();
                    break;
                case 6:
                    currTopping = new Provolone();
                    break;
                case 7:
                    currTopping = new Parmesean();
                    break;
                case 8:
                    currTopping = new Mozzarella();
                    break;
                case 9:
                    currTopping = new Olive();
                    break;
                case 10:
                    currTopping = new Pepper();
                    break;
                case 11:
                    currTopping = new Celery();
                    break;
                case 12:
                    currTopping = new Onion();
                    break;
                default:
                    currTopping = null;
                    System.out.println("Error");
                    break;
            }

            toppings[i] = currTopping;
        }

        pizza = new Pizza(crust, sauce, toppings);
        System.out.println(sep + "ALL DONE!");
        pizza.displayPizza();
        System.out.println(pizza.getCrust().checkIntegrity(ingredient));
        System.out.println(sep);
        in.close();
    }

    public static Integer askSpicy(Scanner in) {
        System.out.println("Spiciness level (1-10):");
        return in.nextInt();
    }
}