/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Owner
 */
import java.util.*;
public class Distance_Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner distance = new Scanner(System.in);
       
      float one_X, one_Y, two_X, two_Y;
      System.out.println("First Point: \n");
      
                  System.out.println("Enter x1: ");
                        one_X = distance.nextFloat();
    
     
                 System.out.println("Enter y1:");
                        one_Y = distance.nextFloat();
     
         
      ///
      
       System.out.println("Second point: \n");
        
                System.out.println("Enter x2:");
                         two_X = distance.nextFloat();
      
                System.out.println("Enter y2:");
                         two_Y = distance.nextFloat();
      
       byte  b = 2;         
       double x_and_y = Math.sqrt((Math.pow(two_Y - one_Y, b)) + (Math.pow(two_X - one_X, b)));     
        String two_decimal = String.format("%.2f", x_and_y);
          
            System.out.println("Distance between two points is:" + two_decimal);
      
    }
    
}


/// formula : d = square root of : (x2 - x1)^2 + (y2 - y1)^2