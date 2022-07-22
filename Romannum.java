/*
 * Taif Basheikh
 * ID: 2005890
 */
package romannum;

import java.util.Scanner;

/**
 *
 * @author Windows10
 */
public class Romannum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
{
    Scanner scanner = new Scanner(System.in);
    int num;
    
    
    System.out.println("Enter a number from 1 to 10");
    num= scanner.nextInt();

            switch (num)
            {
                case 1:
                    System.out.println("in roman number is I");
                    break;
                case 2:
                    System.out.println("in roman number is II");
                    break;
                case 3:
                    System.out.println("in roman number is III");
                    break;
                case 4:
                    System.out.println("in roman number is IV");
                    break;
                case 5:
                    System.out.println("in roman number is V");
                    break;
                case 6:
                    System.out.println("in roman number is VI");
                    break;
                case 7:
                    System.out.println("in roman number is VII");
                    break;
                case 8:
                    System.out.println("in roman number is VIII");
                    break;
                case 9:
                    System.out.println("in roman number is IX");
                    break;
                case 10:
                    System.out.println("in roman number is X");
                    break;
                default: 
                    System.out.println("Run the program again");
                    break;}
                        
            }
}
    
