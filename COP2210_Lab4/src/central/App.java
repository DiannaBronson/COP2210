
//=============================================================================
// PROGRAMMER:  Dianna Bronson
// PANTHER ID:  6120678
//
// CLASS:       COP2210
// SECTION:     RVD
// SEMESTER:    Fall 2020
// CLASSTIME:   Online
//
// Project:     Lab 4
// DUE:         9/20/2020
//
// CERTIFICATION: I understand FIU’s academic policies, and I certify that this
//              work is my own and that none of it is the work of any other person.
//=============================================================================
package central;

import hardware.CPU;
import hardware.Harddrive;
import hardware.Memory;
import hardware.VideoCard;

/**
 *
 * @author Dianna
 */

public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CPU myCpu = new CPU("AMD", "3.9GHz", 6, 65, 165.99);

        Harddrive myHarddrive = new Harddrive("Western Digital", "SATA 6Gb/s", 64, 3.5, 44.89);

        Memory myMemory = new Memory("G.Skill", "DDR4-3200", "16GB", 169.99);

        VideoCard myVideocard = new VideoCard("Asus", "11 GB", 250, 799.99);

        Computer myComputer = new Computer(myCpu, myHarddrive, myMemory, myVideocard);
        myComputer.displayInfo();

    }

}
