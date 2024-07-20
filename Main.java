public class Main {
    public static void main(String[] args) {
        // Create a new Pizza object with veg option
        Pizza vegPizza = new Pizza(true);

        // Add extra cheese
        vegPizza.addExtraCheese();

        // Add extra toppings
        vegPizza.addExtraToppings();

        // Take away
        vegPizza.takeAway();

        // Get the total bill
        vegPizza.getBill();
    }
}