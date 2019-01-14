/* @author: Marcelo Mariduena
 * This program outputs the division table of a maximum number. 
 */
import java.util.*;

public class DivisionTablesMarceloMariduena {

 public static void main(String[] args) {

  // Create an Scanner object
  Scanner input = new Scanner(System.in);
    
  // Prompt user for highest positive integer
  System.out.print("Please enter a positive integer: ");
  double positiveNum = input.nextDouble();
  System.out.println();
  
  System.out.print("   ");
  for (int i = 1; i <= positiveNum; i++) {
   if (i < 10)
    System.out.print("    " + i);
   else if (i < 100) 
    System.out.print("   " + i);
   else 
    System.out.print("  " + i);
  }
  System.out.println();
  System.out.print("     ");
  for (int i = 1; i <= positiveNum; i++) {
   System.out.print("_____");
  }
  System.out.println();
  System.out.println();
  
  /** Displays the table of the positive integer **/
  // This for-loop creates the columns
  for (int i = 1; i <= positiveNum; i++) {
   if (i < 10)
    System.out.print(i + "   | ");
   else if (i < 100)
    System.out.print(i + "  | ");
      else 
       System.out.print(i + " | ");
     
      // This for-loop creates the rows
      for (int j = 1; j <= positiveNum; j++) {
       
       if (i == j)
        System.out.print(" -- ");
         
       else 
        System.out.printf(" %.2f", (double) i/j);
        
      }
      System.out.println();
  }
  // Closes the input scanner object
  input.close();
 }
}