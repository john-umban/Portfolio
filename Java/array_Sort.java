/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package java_enabling_1;

/**
 *
 * @author Elhk
 */
import java.util.*;
public class array_Sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            int i,len, key, arr[];
    Scanner console = new Scanner(System.in);
    //arr length
       System.out.println("Enter the number of element in the array:");
       len = console.nextInt();
       arr = new int[len];
       System.out.println("Enter " + len + " elements");
            for (i = 0; i < len; i++){
                arr[i] = console.nextInt();
                        }
    // arr sort
        System.out.println("The sorted array is: ");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        
                          
    //arr search key        
    System.out.println("What is the element to be search? ");
    key = console.nextInt();

    for (i = 0; i < len; i++){
        if (arr[i]== key){
               System.out.println("The element " + key + " is found in index " + i);

                    break;
                    }
                }
        if (i == len){
        System.out.println(key + " doesn't exist in array.");
                    }
            }
}
    
    
