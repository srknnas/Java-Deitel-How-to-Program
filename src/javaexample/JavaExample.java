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
        // create a GradeBook object and assign it to myGradeBook
        GradeBook book = new GradeBook("JavaExample");
        book.displayMessage();
        String NameOfCourse;
        book.setCourseName("Java");
        book.displayMessage();   

        Scanner input = new Scanner(System.in);
        System.out.println("Kursun ismini giriniz:");
        NameOfCourse = input.nextLine();
        System.out.println();
        
        book.displayMessage(NameOfCourse);
    }
    
}
