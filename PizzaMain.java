import java.util.Scanner;

public class PizzaMain {
    public static void main(String[] args) {
        int usrCrust;
        int usrSauce;
        int toppingAmount;
        int usrTopping;
        Pizza pizza;
        PizzaCrust crust;
        PizzaSauce sauce;
        PizzaTopping currTopping;
        PizzaTopping[] toppings = new PizzaTopping[4];
        String sep = "-------------------------------------------\n";
        Scanner in = new Scanner(System.in);

        System.out.println(sep + "What Kind of crust would you like?:\n1 - Thin Crust\n2 - Thick Crust\nYour choice: ");
        usrCrust = in.nextInt();
        if (usrCrust == 1) {
            crust = new ThinCrust();
        } else {
            crust = new ThickCrust();
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
                    currTopping = new Beef();
                    break;
                case 2:
                    currTopping = new Chicken();
                    break;
                case 3:
                    currTopping = new Pepperoni();
                    break;
                case 4:
                    currTopping = new Sausage();
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
        System.out.println(sep);
        in.close();
    }
}