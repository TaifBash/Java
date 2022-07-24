package numerictypes; 

import java.util.Scanner; 

public class NumericTypes{
 public static void main (String [] args){
final int NUMBER = 2 ;   // First test score final 
double SCORE2 = 95,SCORE1=100 ;	// Second test score , // Number of scores final int SCORE1 = 100;
final int BOILING_IN_F = 212; // Boiling temperature 
double fToC;	// Temperature Celsius 
double average;	// Arithmetic average 
String output;	// Line of output 
average = (SCORE1 + SCORE2) / NUMBER ; 
output = "The average of " +SCORE2 + " and " + SCORE1 + " should be " + average+""
+ " and temperature that water boils is "+SCORE1+" degrees Celsius.";
System.out.println(output); 
System.out.println();
System.out.printf(SCORE1 + " and " + SCORE2 + " have an average of ");
// Convert Fahrenheit temperature to Celsius. 
fToC =  (5.0/9)*(BOILING_IN_F - 32) ; 
output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius."; 
System.out.println(output);  
 }
}
