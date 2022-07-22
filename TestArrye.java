/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testarrye;
import java.util.*;

/**
 *
 * @author Windows10
 */
public class TestArrye {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       //"Name: 1-Faisal\t2-Ahmad\t3-Omar\t4-Salem"
      int chEm;
       Scanner scan = new Scanner(System.in);
       String[] name = new String [4];
        name[0]= "Faisal";
        name[1]= "Ahmad";
        name[3]= "Omar";
        name[4]= "Salem";
        
        System.out.print("Choice one: "); 
              
                chEm=scan.nextInt();
  System.out.println(name[1]);
        
    }
    
}
