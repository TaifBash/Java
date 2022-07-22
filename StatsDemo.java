import java.util.Scanner;
// TASK #1 Add the file I/O import statement here 
import java.io.*;
/**
 * This class reads numbers from a file, calculates the mean and standard
 * deviation, and writes the results to a file.
 */
public class StatsDemo {

    // Taif basheikh 2005890

    // TASK #1 Add the throws clause  
    public static void main(String[] args) throws IOException {
        
        //------------------------------------------------------------
        double sum = 0;	// The sum of the numbers 
        int count = 0;	// The number of numbers added 
        double mean = 0;	// The average of the numbers 
        double stdDev = 0;   // The standard deviation 
    //    String line;	// To hold a line from the file 
        double difference=0;   // The value and mean difference 
        //------------------------------------------------------------
        
        // Create an object of type Scanner 
        Scanner keyboard = new Scanner(System.in);
        String filename;	// The user input file name 
        
        //------------------------------------------------------------

        // Prompt the user and read in the file name 
        System.out.println("This program calculates "
                + "statistics on a file " + "containing a series of numbers");
        System.out.print("Enter the file name: ");
        filename = keyboard.nextLine();

        //------------------------------------------------------------ TASK 2
        
	// ADD LINES FOR TASK #2 HERE 
        // Create a File object passing it the filename 
        // Create a Scanner object passing File object 
        // Perform a priming read to read the first line of  the file 
        // Loop until you are at the end of the file 
        // Add value to sum 
        // Increment the counter 
        // Read a new line from the file 
        // Close the input file 
        // Store the calculated mean 
        
        File fileM = new File (filename);
        if (!fileM.exists()) // to check the file 
        {
            System.out.println(" file is not found("+filename+")");
            System.exit(0);
        } 
        
        Scanner inputfile = new Scanner (fileM);
        sum += inputfile.nextDouble();
       
        while (inputfile.hasNext())
        {
            sum +=inputfile.nextDouble();
            count++;
        }
        
        inputfile.close();
        mean = sum / count;
        System.out.println("\nThe Mean: "+mean);
        
        
        //------------------------------------------------------------ TASK 3
        
	// ADD LINES FOR TASK #3 HERE 
        // Reconnect File object passing it the filename 
        // Reconnect Scanner object passing File object 
        // Reinitialize the sum of the numbers 
        // Reinitialize the number of numbers added 
        // Perform a priming read to read the first line of the file 
        // Loop until you are at the end of the file 
        // subtract the mean 
        // Add the square of the difference to the sum 
        // Increment the counter 
        // Read a new line from the file 
        // Close the input file 
        // Store the calculated standard deviation 
         sum=0; count=0;
        File fileS = new File (filename);
       
        if (!fileS.exists()) // to check the file 
        {
            System.out.println("The ("+filename+") is not found");
            System.exit(0);
        } 
        
        Scanner putfile = new Scanner (fileS);
       
        sum += putfile.nextDouble();
       
        while (putfile.hasNext())
        { 
           difference = putfile.nextDouble() - mean;
            sum += Math.pow(difference, 2);
            count++;
        }
        putfile.close();

        stdDev = Math.sqrt(sum / count);
        System.out.println("The standard deviation: "+stdDev);
       
        //------------------------------------------------------------ TASK 1
        
        // ADD LINES FOR TASK #1 HERE 
        // Create a FileWriter object using "Results.txt" 
        // Create a PrintWriter object passing the FileWriter object 
        // Print the results to the output file
        // Close the output file 

       FileWriter outputfile = new FileWriter ("moh.txt");
        PrintWriter outfile = new PrintWriter (outputfile);
        outfile.println("The mean: "+mean);
        outfile.println("\nThe standard deviation: "+stdDev);
            outfile.close();
    }
}

