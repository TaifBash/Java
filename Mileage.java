package mileage;
//Taif Basheikh 2005890
import java.util.Scanner; 
public class Mileage {   
 public static void main(String[] args) { 

     Scanner keyboard = new Scanner(System.in); 
System.out.println("This program will calculate mileage ");//For clarification
                System.out.println();
                System.out.println();

                Scanner scan = new Scanner(System.in);     
    System.out.println("how many miles driven: ");
    double miles = scan.nextDouble(); 
        System.out.println("How many gallons used: ");
    double gallons= scan.nextDouble(); 
    if(gallons>0)  //check the gallons number 
    {            double mpg=miles/gallons; 
        System.out.println("miles per gallons = "+mpg);}
    else{
        System.out.println("The gallons is 0 or LEES than 0.\n\nPlease RUN the program AGAIN"); 
    }}}

