package evenandodd;
import java.util.Random; 

public class EvenAndOdd {
    //Taif Basheikh 2005890
  public static boolean isEven(int number) {
        
  if((number % 2)==0)/**if the result of the random 
                                       number=0 the number is even */
  {return true;} 
        else {return false;} 
    }
  public static void main(String[] args)
  {
     Random random = new Random(); 
  int noe=0,noo=0,rng,cn=1;
    for(;cn<=10;cn++) 
    {
     rng=random.nextInt(10)+1;//random number from 1 to 10
     if (isEven(rng)){noe +=1;}// even number   
      else{noo +=1;}//odd number
    }
  System.out.println("There were "+noe+" even numbers and "+noo+" odd numbers");
}// print the total numbers of even and odd  
}
