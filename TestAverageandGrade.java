import java.util.Scanner;
public class TestAverageandGrade{

  public static double Cave(double s1,double s2,double s3,double s4,double s5){
    double ave = (s1+s2+s3+s4+s5)/5;
   
    return ave;
  }

  public static String grade(double ts){
 String lg="";
      if(ts<60) {System.out.printf(" F "); }
else if (ts<70) {System.out.printf(" D ");}
else if(ts<80)  {System.out.printf(" C ");}
else if (ts<90) {System.out.printf(" B ");}
else 
{System.out.printf(" A ");}
 return lg;   
  }
  
  public static void main ( String[] args ){
     Scanner scanner = new Scanner (System.in);
  int nos = 5, cs = 1; double us, s1, s2, s3, s4, s5,ave;
  
    System.out.print("Enter the First score: "); s1=scanner.nextDouble();
    
    System.out.print("\nEnter the second score: "); s2=scanner.nextDouble();
     
    System.out.print("\nEnter the theird score: "); s3=scanner.nextDouble();
    
    System.out.print("\nEnter the forth score: "); s4=scanner.nextDouble();
   
    System.out.print("\nEnter the fifth score: "); s5=scanner.nextDouble();
        
    System.out.println ("\nGrate   Score");
    
    System.out.println( s1 + grade(  s1 ));
    System.out.println( s2 + grade(  s2 ));
    System.out.println( s3 + grade(  s3 ));
    System.out.println( s4 + grade(  s4 ));
    System.out.println( s5 + grade(  s5 ));
    
    System.out.println("\nThe Average"); 
    System.out.println ("\nThe Total of Score\n" + Cave( s1, s2, s3, s4,s5)
            +grade(Cave( s1, s2, s3, s4,s5)) ); 
  }
}
