package hotel;
import java.util.Scanner;
public class Hotel { 
    public static void main(String[] args) {
        // TODO code application logic here
        
        int floor, rooms = 0, occupiedRooms, totalRooms = 0, totalOccupiedRooms = 0,count,wrong=0 ; 
        double occupancyRate;  
                    Scanner scanner = new Scanner(System.in);
           
                    System.out.print("Enter the number of FLOORS: ");    //Ask use to input number of floors   
            floor = scanner.nextInt();  

     while (floor < 1){ //if input less than 1 
            System.out.println("****The number of floors (MUST BE 1 OR MORE)****\n"); //Attention

            System.out.print("Enter the number of FLOORS:"); //Ask use to input number of floors  
                    floor = scanner.nextInt(); } 
  
    for ( count = 1; count <= floor; ++count)
          {  
            System.out.printf("\nEnter the number of ROOMS in a FLOORS" +count+ ":"); //Ask use to input number rooms of floors  
            rooms = scanner.nextInt();  
                totalRooms = totalRooms + rooms;//Collect room numbers
               
    while (rooms < 10  ) //if input less than 1 
        {
            System.out.printf("****The number of rooms (MUST BE 10 OR MORE).****\n");//Attention
            System.out.printf("\nEnter the number of rooms in a floor " +count+ ": ");
                rooms = scanner.nextInt(); 
                totalRooms = rooms;
        }
          System.out.printf("\nEnter the number of OCCUPIED Rooms in floors "+count+":");
                occupiedRooms = scanner.nextInt();  
         totalOccupiedRooms = totalOccupiedRooms + occupiedRooms; //Collect occupiedRooms numbers
          }
    System.out.println("\nTotal number of Rooms = "+ totalRooms + "\nTotal number of Occupied Rooms = "+
            totalOccupiedRooms+ "\nTotal number of Vacant rooms = "+ (totalRooms - totalOccupiedRooms) +
                         "\nTotal RATE of Occupancy = %" + ((double)totalOccupiedRooms / totalRooms)); 
                //output
}  
}
