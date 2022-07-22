package std;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StD {
    public static void main(String[] args) throws IOException {
        
        //------------------------------------------------------------
        double sum = 0;	// The sum of the numbers 
        int count = 0;	// The number of numbers added 
        double mean=0;	// The average of the numbers 
        double stdDev = 0;   // The standard deviation 
        String line;	// To hold a line from the file 
        double difference;   // The value and mean difference 
        //------------------------------------------------------------
        
        // Create an object of type Scanner 
        Scanner keyboard = new Scanner(System.in);
        String filename;	// The user input file name 
        
        //------------------------------------------------------------

        // Prompt the user and read in the file name 
        System.out.println("This program calculates "
                + "statistics on a file " + "containing a series of numbers");
        System.out.print("Enter the file name:  ");
        filename = keyboard.nextLine();

        //------------------------------------------------------------ TASK 2 
        // Create a FileReader object passing it the filename 
        File file_1=new File(filename);
        // Create a BufferedReader object passing FileReader 
        // object 
        Scanner Read1=new Scanner(file_1);
        // Perform a priming read to read the first line of 
        // the file 
        line=Read1.nextLine();
        // Loop until you are at the end of the file 
        while(Read1.hasNext()){
        // Convert the line to a double value and add the 
        // value to sum 
        sum=sum+Double.parseDouble(line);
        // Increment the counter 
        count++;
        // Read a new line from the file 
        line=Read1.nextLine();
        }
        // Close the input file 
        Read1.close();
        // Store the calculated mean 
        mean=sum/count;
        //------------------------------------------------------------ TASK 3
        // Reconnect FileReader object passing it the 
        // filename 
        File file_2=new File(filename);
        // Reconnect BufferedReader object passing 
        // FileReader object 
        Scanner Read2=new Scanner(file_2);
        // Reinitialize the sum of the numbers 
        sum=0;
        // Reinitialize the number of numbers added 
        count=0;
        // Perform a priming read to read the first line of 
        // the file 
        line=Read2.nextLine();
        // Loop until you are at the end of the file 
        while(Read2.hasNext()){
        // Convert the line into a double value and 
        // subtract the mean 
        difference=mean-Double.parseDouble(line);
        // Add the square of the difference to the sum 
        sum+=Math.pow(difference, 2);
        // Increment the counter 
        count+=1;
        // Read a new line from the file 
        line=Read2.nextLine();
        }
        // Close the input file 
        Read2.close();
        // Store the calculated standard deviation  
        stdDev=Math.sqrt(sum/count);
        //------------------------------------------------------------ TASK 1
        
        // Create a FileWriter object using "Results.txt" 
        FileWriter write_file=new FileWriter("Results.txt");
        // Create a PrintWriter object passing the 
        // FileWriter object 
        PrintWriter write=new PrintWriter(write_file);
        // Print the results to the output file 
        write.printf("mean = %.3f\n", mean);
        write.printf("Statdard division=%.3f", stdDev);
        // Close the output file 
        write.close();
    }
}