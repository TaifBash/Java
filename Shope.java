
package shope;
import java.util.Scanner;
// Taif Basheikh 2005890
class Shope{
    
public static void main(String[] args) {
      
Scanner sc=new Scanner(System.in);
int ch=-1;
double value=0;


while(ch!=3) {
value=0;
ch=-1;
  

//Mani menu*********************************************************************
System.out.println("---------------------------------------------------");
System.out.println("\tWelcome to Waffle&Pancake Sweets System");
System.out.println("---------------------------------------------------");
System.out.println("\tEnter \"1\" for Waffel");
System.out.println("\tEnter \"2\" for Pancakes");
System.out.println("\tEnter \"3\" for Exiting the program");
System.out.print("Enter the choice: "); ch=sc.nextInt();

switch (ch) 
{
case 1:
case 2:
case 3: 
break;

default:// if user enter number less thn 1 or more then 3(wrong in put).
char try_input='Y';
System.out.print("\nSorry! Wrong input");
System.out.print("\nTry Agin(Y/N)?");
try_input=sc.next().charAt(0);

if(try_input=='N'||try_input=='n') {ch=3;} 

//while (try_input=='Y'||try_input=='y')






} // end of switch

if(ch==3) /*if user enter 3*/ {System.out.println("\nProgram ended, Thank you");}
if(ch==1||ch==2) // if user enter 1 or 2 in main choice selection

// pieces **********************************************************************
{int ch_souse=-1, ch_topping=-1, pieces=0;
System.out.print("Enter the number of pieces: "); pieces=sc.nextInt();
  

//Souce Menu********************************************************************
System.out.println("---------------------------------------------------");
System.out.println("\t\tChoose the Souse");
System.out.println("---------------------------------------------------");
System.out.println("\t1: Chocolet Souse\n\t2: Honey Souse\n\t3: Cramel Souse");
System.out.println("\t4: Pistatio Souse\n\t5: No Souse");
System.out.print("Enter the choice No: ");  ch_souse=sc.nextInt();
  
//check invalid souce number selected by user
if(5<ch_souse||ch_souse<1)
{System.out.println("Sorry! wrong input, Exitting program"); ch=3;}

else { 
    
//Topping Menu *****************************************************************
System.out.println("---------------------------------------------------");
System.out.println("\t\tChoose the Toppings");
System.out.println("---------------------------------------------------");
System.out.println("\t1: Strawberry\n\t2: Banana");
System.out.println("\t3: Nuts\n\t4: Ice cream\n\t5: No Topping");
System.out.print  ("Enter the choice No: "); ch_topping=sc.nextInt();
  
//Check invalid Topping selection by user
if(6<ch_topping||ch_topping<1) //from 1 to 5
{System.out.println("Sorry! wrong input, Exitting program"); ch=3;}
else{

//set (base -price-) according to main choice selection 1 or 2
if(ch==1){value=(10*pieces);}
else{value=(5*pieces);} 
  
//add (souce -price-) if valid souce selectde by user
if(ch_souse>0&&ch_souse<5){value=value+(2);}
  
//add (Topping -price-) if valid Topping selectde by user
    switch (ch_topping) {
        case 1:
        case 2: 
            value=value+(5);
            break;
        case 3:
            value=value+(3);
            break;
        case 4:
            value=value+(10);
            break;
        default:
            break;
    }
} 

}


 if(value!=0) /*check if value is not 0, if user gave all valid inputs in 
                -main menu choice souce choice and topping choice-.*/
{  
 if((ch==1&&pieces>5)||(ch==2&&pieces>10))//check if user is eligiable for discount or not
 {value=(value-(value*(10.0f/100.0f)));}
  
 value=(value+(value*(15.0f/100.0f)));//Add tax in total price
  
  
//Print the Order
System.out.println("---------------------------------------------------");
System.out.println("\t\tYour order information");
System.out.println("---------------------------------------------------");
//******************************************************************************

//Print Sweeet type:---------------------------------------------------------

if(ch==1) {System.out.print("\nSweet Type: Waffel");}
else{System.out.print("Sweet Type: Pancakes");} 
System.out.print("\tNumber of pieces: "+pieces+"\n");

//Print Souse Type:---------------------------------------------------------

     if(ch_souse==1){System.out.print  ("Souse: Chocolet Souse");}
else if (ch_souse==2) {System.out.print("Souse: Honey Souse");}
else if (ch_souse==3) {System.out.print("Souse: Cramel Souse");}
else if (ch_souse==4) {System.out.print("Souse: Pistatio Souse");}
else {System.out.print                 ("Souse: No Souse");} 

//Print Tooping:-----------------------------------------------------------

     if (ch_topping==1) {System.out.print("\tToppings: Strawberry\n");}
else if (ch_topping==2) {System.out.print("\t\tToppings: Banana\n");}
else if (ch_topping==3) {System.out.print("\t\tToppings: Nuts\n");}
else if (ch_topping==4) {System.out.print("\tToppings: Ice crem\n");}
else                    {System.out.print("\t\tToppings: No adding\n");} 

//Print Discount:---------------------------------------------------------
if((ch==1&&pieces>5)||(ch==2&&pieces>10)){System.out.print("Discont: 10%");}
else {System.out.print("Discont: 0%");} 

// print Tax:-------------------------------------------------------------
System.out.println("\t\tTax: 15%");

// print price:-----------------------------------------------------------
System.out.printf("\nTotal Price %.2fSR ",value);
 
 System.out.println("");//New Line  



 System.exit(0);   //close program              
}
        }      

           }

                }

   }