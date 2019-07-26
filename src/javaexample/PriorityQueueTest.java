// Fig. 20.15: PriorityQueueTest.java
// PriorityQueue test program.
package javaexample;

import java.util.PriorityQueue;

public class PriorityQueueTest 
{
   public static void main( String[] args ) 
   {
      // queue of capacity 11
      PriorityQueue< Double > queue = new PriorityQueue< Double >();

      // insert elements to queue
      queue.offer( 1.0 );
      queue.offer( 3.0 );
      queue.offer( 2.0 );
      queue.offer( 4.0 );
      queue.offer( 5.0 );
      queue.offer( 6.0 );

      System.out.print( "Polling from queue: " );

      // display elements in queue
      while ( queue.size() > 0 )
      {
         System.out.printf( "%.1f ", queue.peek() ); // view top element
         queue.poll(); // remove top element
      } // end while
   } // end main
} // end class PriorityQueueTest

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
