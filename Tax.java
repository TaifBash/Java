package tax;
import java.util.Scanner;
public class Tax 
{
    public static void main(String[] args)
    {
final double Tax_r=6.75;
final double tip_p=20.0;
Scanner Keyboard=new Scanner(System.in);
double mealcharge, tax,tip,total;
System.out.println("Enter the charge for the meal: ");
mealcharge=Keyboard.nextDouble();

tax=mealcharge*Tax_r;
tip=(mealcharge+tax)*tip_p;
total=mealcharge+tax+tip;

System.out.println("Meal charge: $"+mealcharge);
System.out.println("Tax: $"+tax);
System.out.println("Tip: $"+tip);
System.out.println("Total: $"+total);
    }
}
