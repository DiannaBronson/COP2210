/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//============================================================================= 
//PROGRAMMER: Dianna Bronson  
// PANTHER ID:  6280121  
// 
// CLASS:      COP2210  
// SECTION:    RVD 1208    
// SEMESTER:      Fall 2020
// CLASSTIME:     Online 
// 
// Project:       Lab1 
// DUE:          August 30th 2020
// 
// CERTIFICATION: I certify that this work is my own and that 
//                               none of it is the work of any other person. 
//============================================================================= 
package central;

import javax.swing.JFrame;

/**
 *
 * @author Dianna
 */
public class FaceViewer 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame();
    frame.setSize(150, 250);
    frame.setTitle("An Alien Face");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    FaceComponent component = new FaceComponent();
    frame.add(component);
    
    frame.setVisible(true);
    }
    
    
    
    
}
