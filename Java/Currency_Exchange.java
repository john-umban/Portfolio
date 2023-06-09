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
public class Currency_Exchange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
       Scanner bucky = new Scanner(System.in);
       
      double fnum, snum, usd;
      System.out.println("This is a USD to PHP Converter \n Please enter amount (USD): ");
      fnum = bucky.nextFloat();
   
         usd = fnum * 49.9090;
         
      System.out.println("Your total is " + usd + " Php");
  
        
    }
}