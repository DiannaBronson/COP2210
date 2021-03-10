/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general;

import Bed.Sheets;

/**
 *
 * @author Dianna
 */
public class controller {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Sheets s1 = new Sheets ();
        Sheets s2 = new Sheets ("blue", 350);
        Sheets s3 = new Sheets ("green", 400);
        Sheets s4 = new Sheets ("navy blue", 500);
        
        s1.displayInfo ();
        s2.displayInfo ();
        s3.displayInfo ();
        s4.displayInfo ();
        Sheets.displayClassInfo ();
    }
    
}
