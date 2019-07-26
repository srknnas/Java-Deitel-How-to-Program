// Fig. 21.13: TotalNumbers.java
// // Totaling the numbers in an ArrayList<Number>.
package javaexample;

import java.util.ArrayList;

public class TotalNumbers
{
   public static void main( String[] args ) 
   {
      // create, initialize and output ArrayList of Numbers containing 
      // both Integers and Doubles, then display total of the elements 
      Number[] numbers = { 1, 2.4, 3, 4.1 }; // Integers and Doubles
      ArrayList< Number > numberList = new ArrayList< Number >();

      for ( Number element : numbers ) 
         numberList.add( element ); // place each number in numberList

      System.out.printf( "numberList contains: %s\n", numberList );
      System.out.printf( "Total of the elements in numberList: %.1f\n", 
         sum( numberList ) );
   } // end main

   // calculate total of ArrayList elements
   public static double sum( ArrayList< Number > list )
   {
      double total = 0; // initialize total

      // calculate sum
      for ( Number element : list )
         total += element.doubleValue();

      return total;
   } // end method sum
} // end class TotalNumbers

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