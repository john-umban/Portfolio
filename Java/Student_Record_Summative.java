//imports
import java.io.*;
import java.util.*;
import javax.swing.*;



public class Student_Record_Summative {
   /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) 
            throws FileNotFoundException {
        
      //Scanner, filereader, printwriter
      Scanner inFile =  new Scanner (new FileReader("C:\\studentRecord.txt"));
      PrintWriter outFile = new PrintWriter("C:\\Section & TotalStudents.txt");
      
     
      //variables
      int numberStudent = 0;
      String program_Code = null;
      String firstName, middleName, lastName, studentNumber, name;  
      
          
      //input
       name = JOptionPane.showInputDialog(null,"Please Input program code: ");
          
       
            
//while Statement
while(inFile.hasNext()) {
    
studentNumber = inFile.next();

firstName = inFile.next(); 

middleName = inFile.next(); 

lastName = inFile.next(); 

program_Code = inFile.next();




//if statements 
if (program_Code == null ? name == null: program_Code.equals(name)) {
    numberStudent++;
    System.out.println(firstName +" "+ middleName +" "+ lastName);
    
}           }
    if (numberStudent == 0) {
    System.out.println("There are no students from this program code.");
} else if (numberStudent >= 1) {
    outFile.print(name +"       "+ numberStudent);
}


//program close
inFile.close();
outFile.close();
    }     
    }
    

