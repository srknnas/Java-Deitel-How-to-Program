// Fig. 22.12: StackCompositionTest.java
// Class StackCompositionTest.
package javaapplication;

import javaapplication.StackComposition;
import javaapplication.EmptyListException;

public class StackCompositionTest 
{
   public static void main( String[] args )
   {
      StackComposition< Integer > stack = 
         new StackComposition< Integer >();

      // use push method
      stack.push( -1 );
      stack.print();
      stack.push( 0 );
      stack.print();
      stack.push( 1 );
      stack.print();
      stack.push( 5 );
      stack.print();

      // remove items from stack
      try 
      {
         int removedItem;

         while ( true ) 
         {
            removedItem = stack.pop(); // use pop method
            System.out.printf( "\n%d popped\n", removedItem );
            stack.print();
         } // end while
      } // end try
      catch ( EmptyListException emptyListException ) 
      {
         emptyListException.printStackTrace();
      } // end catch
   } // end main
} // end class StackCompositionTest



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
