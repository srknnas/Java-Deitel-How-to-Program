// Fig. 21.3: GenericMethodTest.java
// Printing array elements using generic method printArray.
package javaexample;

public class GenericMethodTest 
{
   public static void main( String[] args ) 
   {
      // create arrays of Integer, Double and Character
      Integer[] integerArray = { 1, 2, 3, 4, 5, 6 };
      Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
      Character[] characterArray = { 'H', 'E', 'L', 'L', 'O' };

      System.out.println( "Array integerArray contains:" );
      printArray1( integerArray ); // pass an Integer array 
      System.out.println( "\nArray doubleArray contains:" );
      printArray1( doubleArray ); // pass a Double array
      System.out.println( "\nArray characterArray contains:" );
      printArray1( characterArray ); // pass a Character array
      
      System.out.println( "\nArray integerArray contains:" );
      printArray2( integerArray ); // pass an Integer array 
      System.out.println( "\nArray doubleArray contains:" );
      printArray2( doubleArray ); // pass a Double array
      System.out.println( "\nArray characterArray contains:" );
      printArray2( characterArray ); // pass a Character array
   } // end main

   // generic method printArray
   public static < T > void printArray1( T[] inputArray )
   {
      // display array elements
      for ( T element : inputArray )
         System.out.printf( "%s ", element );

      System.out.println();
   } // end method printArray
   
   public static void printArray2( Object[] inputArray )
   {
      // display array elements
      for ( Object element : inputArray )
         System.out.printf( "%s ", element );

      System.out.println();
   } // end method printArray
} // end class GenericMethodTest

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