
import java.util.Scanner;

public class BMI {
//
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner scanner=new Scanner(System.in);
   double W, H, bmi;
   System.out.println("Enter your weight");
   W=scanner.nextDouble();

       System.out.println("Enter your height");
       H=scanner.nextDouble();

    bmi=(W*703)/(H*H);
    if (bmi<=18.5)
    {
      System.out.println("your wight is underweight, It is:"+bmi);
    }
    else if(bmi>=0 && bmi<=25)
    {
            System.out.println("your wight is normal, It is:"+bmi);
    }
    else
    {
            System.out.println("your wight is overweight, It is:"+bmi);
    }
    }
    
}
