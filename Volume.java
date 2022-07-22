package volume;
import java.util.Scanner; 
                            //Taif BAsheikh 2005890
public class Volume {
     public static void main(String[] args) {
Scanner keyboard = new Scanner(System.in); 
        double radius, diameter, volume;
System.out.print("Enter a diameter of a sphere: ");//Ask user
diameter = keyboard.nextDouble();// stor at diameter
radius = diameter / 2;
volume = (4.0 / 3.0) * Math.PI * Math.pow(radius,3);
System.out.println("Volume of the sphere is " + volume + ".");//output
    }
}
