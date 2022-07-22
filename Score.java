/*
 * Taif Basheikh
 * ID: 2005890
 */
package score;

import java.util.Scanner;

/**
 *
 * @author Windows10
 */
public class Score {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
double sc1,sc2,sc3,ave;

System.out.println("Enter the First score");
sc1=scanner.nextDouble();
System.out.println("Enter the Second score");
sc2=scanner.nextDouble();
System.out.println("Enter the Third score");
sc3=scanner.nextDouble();

ave=(sc1+sc2+sc3)/3;

if(ave<60)
{
  System.out.printf(" agrade F ");
}
else if (ave<70)
{
    System.out.printf(" agrade D ");
}
else if(ave<80)
{
    System.out.printf(" agrade C ");
}
else if (ave<90)
{
    System.out.printf(" agrade B ");
}
    
 else 
{
    System.out.printf(" agrade A ");
}

System.out.println("\nAverage score: " + ave);



    } 
}


/**System.out.println(t1+"\t  " + g1);
System.out.println(t2+"\t  ");
System.out.println(t3+"\t  " + g3);
System.out.println(t4+"\t  " + g4);
System.out.println(t5+"\t  " + g5);
System.out.println();
System.out.println("Average score: " + av);
System.out.println("Average Letter Grade: " + totalg);**/