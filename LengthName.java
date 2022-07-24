package lengthname;
import java.util.Scanner;

public class LengthName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            String FirstName, FullNmae; char firsInitial;
System.out.print("Enter your name: "); // Ask user Eneter name
                 FirstName = input.nextLine();
                     firsInitial = FirstName.charAt(0);
                     System.out.println();// new line
                        
System.out.println("Your name is: "+ FirstName);
                        FullNmae=FirstName;  
System.out.println("Your name by capital letters: "+(FirstName).toUpperCase());//by capital letters
                     
                        firsInitial = FirstName.charAt(0);
System.out.println("Your First character in your name is: "+firsInitial); // first latter in name

FirstName = new String("Tutorials" );
          System.out.print("Length of Full name is :" );//Length of  name
                 System.out.println(FullNmae.length());  } }
