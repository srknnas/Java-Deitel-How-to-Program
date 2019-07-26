// Fig. 14.2: Addition.java
// Addition program that uses JOptionPane for input and output.
package javaexample;

import javax.swing.JOptionPane; // program uses JOptionPane

public class Addition 
{
   public static void main( String[] args )
   {
      // obtain user input from JOptionPane input dialogs
      String firstNumber = 
         JOptionPane.showInputDialog( "Enter first integer" );
      String secondNumber =
          JOptionPane.showInputDialog( "Enter second integer" );

      int number1;
      int number2;
      int sum;
      
      // convert String inputs to int values for use in a calculation
      if(firstNumber != null && firstNumber != "" && secondNumber != null && secondNumber != "") {
          number1 = Integer.parseInt( firstNumber ); 
          number2 = Integer.parseInt( secondNumber );
          sum = number1 + number2; // add numbers
          
          // display result in a JOptionPane message dialog
          JOptionPane.showMessageDialog( null, "The sum is " + sum, 
                  "Sum of Two Integers", JOptionPane.PLAIN_MESSAGE );
      }   
      else
          System.out.println("Error");
   } // end method main
} // end class Addition


/**************************************************************************
 * (C) Copyright 1992-2012 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
