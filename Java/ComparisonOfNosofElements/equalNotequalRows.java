/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice8.pkg1.pkg2;

import java.util.Scanner;

/**
 *
 * @author Elhk
 */
public class equalNotequalRows {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ///elem1 = elem;;;;;; j=a
        
        int row,col,num,num1, binary;
        
        // user input
        Scanner console = new Scanner(System.in);
        System.out.print("Enter value of array: ");
        row = console.nextInt();
        col = row;
        int[][]arr = new int[row][col];
        
        
        // randomize elements
        for (int[] elem : arr) {
            for (int a = 0; a < elem.length; a++) {
                elem[a] = (int)(Math.random()*2);
            }
        }
        
        // display array list
        System.out.println("\nArray List: ");
        for(int i=0; i<row; i++){
            for(int a=0; a<col; a++){
                System.out.print(arr[i][a]+"   ");
            }
            System.out.println("");
        }
System.out.println("________________________________________________");


// rows      
binary = 0;
        for (int i = 0; i < arr.length; i++) {
            binary = 0;

        for (int a = 0; a < arr[i].length; a++) {
            if(arr[i][a] == 0) 
                binary++;
        }           
            if(binary == 0) 
                System.out.println("All 1s on row " + (i+1));
            
            else if(binary == arr[i].length) 
                System.out.println("All 0s on row " + (i+1));   
        }
if (binary != 0 ){
System.out.println("rows do not have equal numbers");
}
//column
    
        for (int a = 0; a < arr.length; a++) {
        binary = 0;

        for (int i = 0; i < arr[a].length; i++) {
            if(arr[i][a] == 0) 
                binary++;
        }           
            if(binary == 0) 
                System.out.println("All 1s on column " + (a+1));

            else if(binary == arr[a].length) 
                System.out.println("All 0s column " + (a+1));
        }
if (binary != 0){
System.out.println("columns do not have equal numbers");
            }
        

        
// 1st diagonal     
       num =0;
       for (int i = 0; i < row; i++) {
            for (int a = 0; a < col; a++) {
                if (i == a)
                    num += arr[i][a];
            }
       }
           num -= row;
           num1 =- row;
          if(num == 1 || num == num1){
            System.out.println("All 0s on 1st diagonal");
          }else if(num == 0 || num == num1){
            System.out.println("All 1s on 1st diagonal" );
          }else{
            System.out.println("1st diagonal does not have equal numbers");
          }


// 2nd diagonal  
       num =0;
        for (int i = 0; i < row; i++) 
        {
            for (int a = 0; a < col; a++) 
            {
                if (i + a == row - 1)
                    num += arr[i][a];
            }
        }       
            num -= row;
            num1 =- row;
          if(num == 1 || num == num1){
            System.out.println("All 0s on 2nd diagonal");
          }else if(num == 0 || num == num1){
            System.out.println("All 1s on 2nd diagonal" );
          }else{
            System.out.println("2nd diagonal does not have equal numbers");
          }
    }
 }
