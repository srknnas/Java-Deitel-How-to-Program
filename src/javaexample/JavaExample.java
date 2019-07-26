/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author SERKANNAS
 */
public class JavaExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // obtain user's choice
      String input = JOptionPane.showInputDialog(
         "Enter 1 to draw rectangles\n" +
         "Enter 2 to draw ovals" );
      
      int choice = Integer.parseInt( input ); // convert input to int
      
      // create the panel with the user's input
      Shapes panel = new Shapes( choice );
      
      JFrame application = new JFrame(); // creates a new JFrame

      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      application.add( panel ); // add the panel to the frame
      application.setSize( 300, 300 ); // set the desired size
      application.setVisible( true ); // show the frame
    }
    
}
