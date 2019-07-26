/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample;

import javax.swing.JOptionPane; // import class JOptionPane
import javax.swing.JFrame;
/**
 *
 * @author SERKANNAS
 */
public class JavaExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog( null, "Welcome\nto\nJava" );
        String name = JOptionPane.showInputDialog( "What is your name?" ); 
        if(name == null || "".equals(name)) {
            JOptionPane.showMessageDialog( null, "Welcome\nto\nJava again :)" );
        }
        else
            JOptionPane.showMessageDialog( null, name );
        
        DrawPanel panel = new DrawPanel();
        
        // create a new frame to hold the panel
        JFrame application = new JFrame();

        // set the frame to exit when it is closed
        application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        application.add( panel ); // add the panel to the frame      
        application.setSize( 500, 500 ); // set the size of the frame
        application.setVisible( true ); // make the frame visible    
    }
    
}
