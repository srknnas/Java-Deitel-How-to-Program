// Fig. 22.14: QueueTest.java
// Class QueueTest.
package javaapplication;

import javaapplication.Queue;
import javaapplication.EmptyListException;

public class QueueTest 
{
   public static void main( String[] args )
   {
      Queue< Integer > queue = new Queue< Integer >();  

      // use enqueue method
      queue.enqueue( -1 );
      queue.print();
      queue.enqueue( 0 );
      queue.print();
      queue.enqueue( 1 );
      queue.print();
      queue.enqueue( 5 );
      queue.print();

      // remove objects from queue
      try 
      {
         int removedItem;

         while ( true ) 
         {
            removedItem = queue.dequeue(); // use dequeue method
            System.out.printf( "\n%d dequeued\n", removedItem );
            queue.print();
         } // end while
      } // end try
      catch ( EmptyListException emptyListException ) 
      {
         emptyListException.printStackTrace();
      } // end catch
   } // end main
} // end class QueueTest


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
