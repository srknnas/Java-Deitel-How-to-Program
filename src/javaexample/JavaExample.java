/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample;

import java.util.Scanner;

/**
 *
 * @author SERKANNAS
 */
public class JavaExample {

    /**
     * @param args the command line arguments
     */
     // obtain three floating-point values and determine maximum value
   public static void main( String[] args )
   {
        // create Scanner for input from command window
        Scanner input = new Scanner( System.in );

        // prompt for and input three floating-point values
        System.out.print( 
           "Enter three floating-point values separated by spaces: " );
        double number1 = input.nextDouble(); // read first double
        double number2 = input.nextDouble(); // read second double
        double number3 = input.nextDouble(); // read third double

        double result1;
        double result2;
                
        // determine the maximum value        
        JavaExample finder = new JavaExample();
        result1 = finder.maximum(number1, number2, number3);
        //statik metot oldugundan class tanimlamaya gerek yok.
        result2 = maximum( number1, number2, number3 ); 

        // display maximum value 
        System.out.println( "Maximum is: " + result1 ); 
        System.out.println( "Maximum is: " + result2 ); 
   } // end main

   // returns the maximum of its three double parameters
   public static double maximum( double x, double y, double z )
   {
        double maximumValue = x; // assume x is the largest to start

        // determine whether y is greater than maximumValue
        if ( y > maximumValue )
           maximumValue = y; 

        // determine whether z is greater than maximumValue
        if ( z > maximumValue )
           maximumValue = z;

        return maximumValue;
   } // end method maximum
    
}
