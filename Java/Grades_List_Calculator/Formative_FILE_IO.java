import java.io.*;
import java.util.*;

public class Formative_FILE_IO {
    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) 
            throws FileNotFoundException {
      Scanner inFile =  new Scanner (new FileReader("C:\\Users\\Owner\\Documents\\NetBeansProjects\\File_IO_grade\\grade.dat"));
      PrintWriter outFile = new PrintWriter("C:\\Users\\Owner\\Documents\\NetBeansProjects\\File_IO_grade\\origAverage.txt");

String firstName;
String lastName;   
int grade1; 
int grade2;
float grade3;
float grade4;
float grade5;          


firstName = inFile.next(); 

lastName = inFile.next(); 

grade1 = inFile.nextInt();

grade2 = inFile.nextInt();

grade3 = inFile.nextFloat();

grade4 = inFile.nextFloat();

grade5 = inFile.nextFloat();


float average = (grade1 + grade2 + grade3 + grade4 + grade5 ) / 5;
        

outFile.println(average);

inFile.close();
outFile.close();
    }   
}