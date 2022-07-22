/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumofnumber;

/**
 * Taif Basheikh 2005890
 * @author Windows10
 */

import java.util.Scanner;
public class SumOfNumber {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        int un=-1,sum=0,n;
        
        while(un<1)
        {
            System.out.print("Please enter a POSITIVE number integer: ");
               
               un=scanner.nextInt();
        }
        
        for (n=1; n <= un; n++)
        {
            sum = sum+n;
        }
    
        System.out.println("The sum of numbers from 1 to "+un+" is: "+sum);
    }   
      
    }