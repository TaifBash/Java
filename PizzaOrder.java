/***
 *  This lab will be editing a pizza ordering program  
 * It creates a pizza ordered to the specifications that,
 * the user desires. 
 */
package pizzaorder;
import java.util.Scanner ;  // Needed for the Scanner class 

public class PizzaOrder {
    public static void main(String[] args) {
                                                                                               // Create a Scanner object to read input. 
        Scanner keyboard = new Scanner(System.in);
        
        String firstName,crust = "Hand-tossed", input,toppings = "Cheese "; 
                                                                                     // User's first name, Name of crust , User input,  List of toppings  
        boolean discount = false;                                                                                // Flag for discount 
        int inches,  numberOfToppings = 0;	
                                                                                          // Number of toppings 	// Size of the pizza 
        char crustType,	choice;	
                                                                          // For type of crust // User's choice
        double cost = 12.99;                                                                    	// Cost of the pizza 
        final double TAX_RATE = .08;                                                                 // Sales tax rate 
        double tax;                                                                             // Amount of tax 
                                                                                                                 // Prompt user and get first name. 
        System.out.println("^^^^ Welcome to Mike and " + "Diane's Pizza ^^^^"); //welcome
                System.out.println();                                                                       //NEW LINE
        System.out.print("Enter your first name:  ");
        firstName = keyboard.nextLine();
                                                                                          // Determine if user is eligible for discount by 
                                                                                       // having the same first name as one of the owners. 

//------------------------------------------TASK1
        // ADD LINES HERE FOR TASK #1 
if(firstName.equalsIgnoreCase("Mike")|| firstName.equalsIgnoreCase("Diane"))
               { discount=true;}
        
                                                                                     // Prompt user and get pizza size choice.
                System.out.println();//NEW LINE

        System.out.println("Pizza Size (inches)   Cost");
        System.out.println("	10	$10.99");
        System.out.println("	12	$12.99");
        System.out.println("	14	$14.99");
        System.out.println("	16	$16.99");
                        System.out.println();//NEW LINE
        System.out.println("What size pizza " + "would you like?");
        System.out.print("10, 12, 14, or 16 "
                + "(enter the number only): ");
        
        inches = keyboard.nextInt();
                                                                                            // Set price and size of pizza ordered.
        
        //-----------------------------------TASK2
                                                                                            // ADD LINES HERE FOR TASK #2 
                                                                                    // Consume the remaining newline character. keyboard.nextLine(); 
                                                                                         // Prompt user and get crust choice. 
        if(inches == 10){cost=10.99;}
        else if(inches == 12){cost=12.99;}
        else if(inches == 14){cost=14.99;}
        else if(inches == 16){cost= 16.99;}
        else{ System.out.println("**** That was not one of the choices  " 
                + "so a 12-inch pizza will be made ****"); //Attention
             inches=12; cost=12.99;}
                System.out.println();//NEW LINE
                        keyboard.nextLine();
    System.out.println("What type of crust " + "do you want? ");
System.out.print("(H)Hand-tossed, "+ "(T) Thin-crust, or "+ "(D) Deep-dish " + "\n\t(enter H, T, or D): ");
        input = keyboard.nextLine();
        crustType = input.charAt(0);
        
        
//----------------------------------TASK3
        // ADD LINES FOR TASK #3 
       /*switch(crustType){
            case 'h':
            case 'H':
                crust="Hand-tossed";
                break;
            case 't':    
            case 'T':
                crust="Thin-crust";
                break;
            case 'd':
            case 'D':
                crust="Deep-dish";
            default:
System.out.println("\n*** was not one of the choices, so a Hand-tossed crust will be made ***");//Attention
                crust="Hand-tossed";}*/
        // Prompt user and get topping choices one at a time. 
        System.out.println("\t All pizzas come with cheese.");
        System.out.println("\t Additional toppings are $1.25 each, choose from:");         
        System.out.println("\t Pepperoni, Sausage, Onion, Mushroom");
                                                                                         // If topping is desired, 
                                                                                      // add to topping list and number of toppings 
                        System.out.println();//NEW LINE
        System.out.print("Do you want Pepperoni? (Y/N): "); //ASK USER
        input = keyboard.nextLine(); 
        choice = input.charAt(0);
        if (choice == 'Y' || choice == 'y') {
            numberOfToppings += 1;
            toppings = toppings + "Pepperoni ";}
                System.out.println();//NEW LINE
        System.out.print("Do you want Sausage? (Y/N): ");//aSK USER 
        input = keyboard.nextLine();
        choice = input.charAt(0);
        if (choice == 'Y' || choice == 'y') {
            numberOfToppings += 1;
            toppings = toppings + "Sausage ";}
                System.out.println();//NEW LINE
        System.out.print("Do you want Onion? (Y/N): ");//ASK USER
        input = keyboard.nextLine();
        choice = input.charAt(0);
        if (choice == 'Y' || choice == 'y') {
            numberOfToppings += 1;
            toppings = toppings + "Onion ";}
                System.out.println();//NEW LINE
        System.out.print("Do you want Mushroom? (Y/N): ");//ASK USER
        input = keyboard.nextLine();
        choice = input.charAt(0);
        if (choice == 'Y' || choice == 'y') {
            numberOfToppings += 1;
            toppings = toppings + "Mushroom ";}
                System.out.println();//NEW LINE
                                                                                            // Add additional toppings cost to cost of pizza. 
        cost = cost + (1.25 * numberOfToppings);

                                                                                                    // Display order confirmation. 
                System.out.println();//NEW LINE
        System.out.println("Your order is as follows: "); // THE ORDER FOR USER.
                        System.out.println();//NEW LINE
        System.out.println(inches + " inch pizza");
        System.out.println(crust + " crust");
        System.out.println(toppings);

        // Apply discount if user is eligible. 
        //------------------------------------------TASK4
        // ADD LINES FOR TASK #4 HERE 
        if(discount){
            System.out.println("you are eligible for a $2.00 discount."); //DISCOUNT
            cost-=2;
        }
       
        //--------------------------------------TASK5
                        // EDIT PROGRAM FOR TASK #5 
                   // SO ALL MONEY OUTPUT APPEARS WITH 2 DECIMAL PLACES
        
       System.out.printf("The cost of your order " + "is: $%.2f\n", cost); //
        // Calculate and display tax and total cost. 
        tax = cost * TAX_RATE;
       System.out.printf("The tax is: $%.2f\n", tax);// TEX OF THE COST
       System.out.printf("The total due is: $%.2f\n", (tax + cost));// TOTAL OF THE ORDAR
                System.out.println();//NEW LINE
       System.out.println("Your order will be ready for pickup in 30 minutes.");
               System.out.println();//NEW LINE
       System.out.println("\t\t*** THANK YOU ***");
    }
}
