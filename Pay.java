package pay;
import java.util.Scanner;  // Needed for the Scanner class 
             //Name:Taif basheikh ID: 2005890
public class Pay{ 
   public static void main(String[] args) { 
// Create a Scanner object to read from the keyboard. 
Scanner keyboard = new Scanner(System.in); 
// Identifier declarations double hours;  // Number of hours worked 
double rate, hours, pay; //  Define hours variable 
// Hourly pay rate double pay, Gross pay , Display prompts and get input; 	
System.out.print("How many hours did you work? "); 
hours = keyboard.nextDouble(); 
System.out.print("How much are you paid per hour? "); 
rate = keyboard.nextDouble(); 
// Perform the calculations. 
if(hours <= 40) // if it is more than 40 use the sceound statment >>(else).
pay = hours * rate; 
else 
pay = (hours - 40) * (1.5 * rate) + 40 * rate;
System.out.println("You earned $" +pay); // Display results.
   } }
