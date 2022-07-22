package your.n;
import javax.swing.JOptionPane;
//Taif Basheikh  ID:2005890
public class YourN {
    public static void main(String[] args) { 
      String input , FirstName,LastName,FullName;     // To hold String input.   
// Ask user to input First Name.
      FirstName = JOptionPane.showInputDialog("Enter your First name: ");
// Ask user to input Last Name.
      LastName = JOptionPane.showInputDialog("Enter your Last name: ");
//add the First and Last name in Full name.
      FullName = FirstName+" "+LastName;
// Display on message box.
      JOptionPane.showMessageDialog(null,FullName);
   }
}