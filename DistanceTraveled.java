package distancetraveled;
import java.util.Scanner;
public class DistanceTraveled {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner (System.in);
        double speed = -1, distance;
        int time = 0,hour;
        
        while(speed < 0)
        {
            System.out.printf("Enter the number of speed: ");
             speed = scanner.nextDouble();
        }
        while(time < 1)
        {
            System.out.printf("Enter the number of hours: ");
             time = scanner.nextInt();                     
        }
       
        for( hour = 1; hour <= time; hour++)
        {
            distance = (hour * speed);
            System.out.println("\n"+hour+"\t"+distance);
        }}}
