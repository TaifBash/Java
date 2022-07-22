
package conversionprogram2;

import java.util.Scanner;

//Taif Basheikh 2005890
public class Conversionprogram2 {

       public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner (System.in);
        double um;
        int sent=4,uc;
        System.out.printf("Enter the distance in meters: "+"\n");
    um = scanner.nextDouble();
    
    while(um < 0){System.out.println("Error... Enter P num fro, 1 to 4: ");
        um = scanner.nextDouble();
    }
    
    
    
    menu();
    
    System.out.println("Enter number: ");
    uc = scanner.nextInt();
    while(uc != sent)
    {
            switch (uc) {
                case 1:
                    klm(um);
                    break;
                case 2:
                    Inch(um);
                    break;
                case 3:
                    feet(um);
                    break;
                default:
                    System.out.println("Error...Enter POSITIVE number from 1 to 4: ");
                    break;
            }
        menu();
        System.out.println("Enter number: ");
            uc = scanner.nextInt();

    }
        System.out.println("CLOSE \n");
    }
    
//.....................................................................................................................
   
    public static void menu(){
    System.out.println("1. Covert to Km\n2. Covert to inch\n3. Convert to feet\n4. ** Close the program **\n");}

//.....................................................................................................................
   
    public static void klm(double um){
    double klm;
    klm = um * 0.001;
    System.out.println(um+" coverted to Kilometers is "+klm+"\n");
    }

//.....................................................................................................................
    
    public static void Inch(double um){
    double inc;
    inc = um *39.37;
    System.out.println(um+" coverted to inches is "+inc+"\n");
    }

//.....................................................................................................................
    
    public static void feet(double um){
    double feet;
    feet = um * 3.281;
    System.out.println(um+" Converted to feet is "+feet+"\n");
    
    }   
}
