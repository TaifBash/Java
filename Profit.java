/*
 * Taif Basheikh
 * ID: 2005890
 */
package profit;

import java.util.Scanner;

/**
 *
 * @author Windows10
 */
public class Profit {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
      
        Scanner Keyboard=new Scanner(System.in);
   double price, profit; 
    System.out.println("How much is for your circut board? ");
    price=Keyboard.nextDouble();
    profit=price*(0.4);
    System.out.println("They make $"+profit);

    }   
}
