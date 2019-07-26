// Fig. 17.5: CreateTextFile.java
// Writing data to a sequential text file with class Formatter.
package javaexample;

import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import javaexample.AccountRecord;

public class CreateTextFile
{
   private Formatter output; // object used to output text to file

   // enable user to open file
   public void openFile()
   {
      try
      {
         output = new Formatter( "C:\\Users\\SERKANNAS\\Desktop\\JavaExample\\src\\javaexample\\clients.txt" ); // open the file
      } // end try
      catch (Exception e)
      {
          e.printStackTrace();
      }
   } // end method openFile

   // add records to file
   public void addRecords()
   {
      // object to be written to file
      AccountRecord record = new AccountRecord();

      Scanner input = new Scanner( System.in );

      System.out.printf( "%s\n%s\n%s\n%s\n\n",
         "To terminate input, type the end-of-file indicator ",
         "when you are prompted to enter input.",
         "On UNIX/Linux/Mac OS X type <ctrl> d then press Enter",
         "On Windows type <ctrl> z then press Enter" );

      System.out.printf( "%s\n%s", 
         "Enter account number (> 0), first name, last name and balance. Exit -1",
         "? " );
      int s = input.nextInt();
      while ( s != -1 ) // loop until end-of-file indicator
      {
         try // output values to file
         {
            // retrieve data to be output
            record.setAccount( s ); // read account number
            record.setFirstName( input.next() ); // read first name
            record.setLastName( input.next() ); // read last name
            record.setBalance( input.nextDouble() ); // read balance

            if ( record.getAccount() > 0 )
            {
               // write new record
               output.format( "%d %s %s %.2f\r\n", record.getAccount(), 
                  record.getFirstName(), record.getLastName(),
                  record.getBalance() );
               output.flush();
            } // end if
            else
            {
               System.out.println(
                  "Account number must be greater than 0." );
            } // end else
         } // end try
         catch ( FormatterClosedException formatterClosedException )
         {
            System.err.println( "Error writing to file." );
            return;
         } // end catch
         catch ( NoSuchElementException elementException )
         {
            System.err.println( "Invalid input. Please try again." );
            input.nextLine(); // discard input so user can try again
         } // end catch

         System.out.printf( "%s %s\n%s", "Enter account number (>0),",
            "first name, last name and balance.", "? " );
         s = input.nextInt();
      } // end while
   } // end method addRecords

   // close file
   public void closeFile()
   {
      if ( output != null )
         output.close();
   } // end method closeFile
} // end class CreateTextFile

/*************************************************************************
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