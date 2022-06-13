public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly ";
        String readyMessage = ", your order is ready ";
        String displayTotalMessage = "Your total is $";
        String yourOrderTotal = "you have ordered ";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffeePrice = 2;
        double cafeLattePrice = 4.5;
        double cappoccinoPrice = 5;
         
        
        
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Johnny";
        String customer3 = "Peter";
        String customer4 = "Noah";

        // Order status
        boolean isOrderStatusCustomer1 = false;
        boolean isOrderStatusCustomer2 = false;
        boolean isOrderStatusCustomer3 = false;
        boolean isOrderStatusCustomer4 = false;
        
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
        // ** Your customer interaction print statements will go here ** //
        
        System.out.println(pendingMessage + customer1);

        System.out.println(readyMessage + customer4);

        System.out.println(pendingMessage + customer2);

        System.out.println(yourOrderTotal + "2 lattes " + customer3);
    }
}
