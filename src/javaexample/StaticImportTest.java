// Fig. 8.14: StaticImportTest.java
// Static import of Math class methods.
package javaexample;

import static java.lang.Math.*;
import static javaexample.NewClass1.*;
import newpackage.NewClass2;

public class StaticImportTest 
{
   public static void main( String[] args ) 
   {
      //Math class'i yukarida tanimlandigindan direk
      //fonksiyonlari kullanabiliyoruz. 
      System.out.printf( "sqrt( 900.0 ) = %.1f\n", sqrt( 900.0 ) );
      System.out.printf( "ceil( -9.8 ) = %.1f\n", ceil( -9.8 ) );
      System.out.printf( "E = %f\n", E );
      System.out.printf( "PI = %f\n", PI );  
      NewClass1 Class1 = new NewClass1();
      NewClass2 Class2 = new NewClass2();
      Class1.deneme1();
      NewClass1.deneme1();
      deneme1();
      Class2.deneme2();
   } // end main
} // end class StaticImportTest


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
