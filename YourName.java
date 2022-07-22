package yourname;
  import java.util.Scanner; // To take the name from user. 

public class YourName {
    public static void main(String[] args) {
 // TODO code application logic here
     Scanner input = new Scanner(System.in);
String FirstName,LastName, FullName; 
    
            System.out.print("Enter your fires name: "); // Ask user Eneter first name
        FirstName = input.nextLine();  // store first name at n1.
    
            System.out.print("Enter your last name: ");// Ask user Eneter last name
        LastName = input.nextLine(); // store last name at n1.
        
    FullName=FirstName+" "+LastName;
           System.out.println(FullName); }}//display
