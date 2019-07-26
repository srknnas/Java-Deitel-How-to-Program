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
    public static void main(String[] args) {
        System.out.printf("%s\n%s\n", "Welcome to", "Java Programming");
        
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int sum;
        
        System.out.println("Birinci sayıyı giriniz.");
        number1 = input.nextInt();
        System.out.println("İkinci sayıyı giriniz.");
        number2 = input.nextInt();
        sum = number1 + number2;
        System.out.println("Sayıların toplamı = " + sum);
        System.out.printf("Sayıların toplamı = %d\n", sum);
        
        if ( number1 == number2 )
            System.out.printf( "%d == %d\n", number1, number2 );
        if ( number1 != number2 )
            System.out.printf( "%d != %d\n", number1, number2 );
        if ( number1 < number2 )
            System.out.printf( "%d < %d\n", number1, number2 );
        if ( number1 > number2 )
            System.out.printf( "%d > %d\n", number1, number2 );
        if ( number1 <= number2 )
            System.out.printf( "%d <= %d\n", number1, number2 );
        if ( number1 >= number2 )
            System.out.printf( "%d >= %d\n", number1, number2 );
    }       
}
