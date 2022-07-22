/*
 *Taif Basheikh
 * ID: 2005890
 */
package mandg;

import java.util.Scanner;

/**
 *
 * @author Windows10
 */
public class MandG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); 
        System.out.println("Enter miles travelled : ");
        double miles = scan.nextDouble(); 
        System.out.println("Enter gallons : ");
        double gallons= scan.nextDouble(); 
  double mpg=miles/gallons; 
        System.out.println("miles per gallons = "+mpg);
    }
}
