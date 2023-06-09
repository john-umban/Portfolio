/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.Scanner;
/**
 *
 * @author Elhk
 */
public class twoD_Array {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        int row, column, arr, arr1,sum=0;
        System.out.print("Enter n value : ");
        Scanner console =new Scanner(System.in);
        row = console.nextInt();
          column = row;
       
         System.out.println("Enter elements of array: ");    
         int array[][]=new int[row][column];
         for(arr=0; arr<row;arr++)
         {            
         for(arr1=0; arr1<column;arr1++)
            {
         array[arr][arr1]=console.nextInt();
            }
         }
         
         
System.out.println("Elements of the array are: ");   
for (arr = 0; arr < row; arr++)   
{   
for (arr1 = 0; arr1 < column; arr1++)   
System.out.print(array[arr][arr1] + " ");   
    System.out.println();   

 }
 
     for(arr=0;arr<row;arr++)
     { 
      for(arr1=0;arr1<column;arr1++)
     { 
 if (arr+arr1 == row-1)
 {
     sum = sum + array[arr][arr1];

 }
     }
 }
 
System.out.println("sum of the diagonal elements: " + sum) ;
 } 
}
    






    
    