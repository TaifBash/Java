package isprime.method;
public class IsPrimeMethod {
    public static boolean  isPrime(int unum) 
{
     int ed=0,cd=1;
     // ** Enter MORE THEN 1 ** 
            if (unum <1)
     {return false;}// if number less than 1, the output will display F.
     
     for ( ;cd <= unum ;cd++)
        {
     if (unum % cd == 0)
        ed = ed + 1; /** if the result of number =0 add 1 to it 
                    then if it = 1 or more than 2  display F.*/
     else if((ed > 2) || (unum == 1)){return false;} 
          }
     return true; // if result NOT = 1 or more than 2
}
    
//****************************************************************************
    
    public static void main (String []args )
    {System.out.println   (isPrime( 2 ));}
}              //Enter number here( ^ )
    /**EX:     2 \ 1 = 2
           "2" + 1 = 3 (T) */
