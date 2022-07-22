/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

/**
 *
 * @author Windows10
 */
public class Circle {

   private double radius = 0.0 , Area;
   private int numOfCircle = 0;
   String color = "Black" ;
   
    
   public Circle(){
       
   }
   
   public Circle (double radius){
       
   }
    
   public Circle (double radius, String color){
       
   }

      public static int getNumOfCircles(){
       return 0;
   }

      public void setRadius (double radius){
          
      }
   
      public double getRadius(){
          return 0;
      }
   
      public void setColor (String color){
          
      }
      
   
      public String getcolor(){
          return "";
      }
   
      public double getArea(){
          return radius * radius * Math.PI;
      }
   
}


