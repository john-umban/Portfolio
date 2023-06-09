
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Owner
 */
public class Umban_ProgrammingAssessment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner numbers = new Scanner (System.in);

System.out.println("Please enter 2 integers and press enter: ");        
    
        final int SECRET = 11;
        final double RATE = 12.50;

String name;        
int num1, num2, newNum;
double hoursWorked, wages;

 num1 = numbers.nextInt();
 num2 = numbers.nextInt();        
 System.out.println("The value of num1 is: " + num1 + " and the value of num2 is: " + num2);
 
 newNum = (num1 * 2)+ num2;
 System.out.println("The value of newNum is :" + newNum); 

int newnewNum = newNum + SECRET;
 System.out.println("The new value of newNum is :" + newnewNum);        


 System.out.println("Enter your last name: ");
 name = numbers.next();

 do {
System.out.println("Please enter a decimal number between 0 and 70: ");
hoursWorked = numbers.nextDouble();
} while (hoursWorked >= 71 || hoursWorked <= -1 ); 

wages = hoursWorked * RATE;
   
System.out.println("Name: " + name);
System.out.println("Rate: $" + RATE);
System.out.println("Hours Worked: " + hoursWorked);
System.out.println("Salary: $" + wages );

   
    }
    
}
