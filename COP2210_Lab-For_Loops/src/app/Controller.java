//=============================================================================
// PROGRAMMER:  Dianna Bronson
// PANTHER ID:  6120678
//
// CLASS:       COP2210
// SECTION:     RVD
// SEMESTER:    Fall 2020
// CLASSTIME:   Online
//
// Project:     Lab 6
// DUE:         10/25/2020
//
// CERTIFICATION: I understand FIU’s academic policies, and I certify that this
//              work is my own and that none of it is the work of any other person.
//=============================================================================
package app;

/**
 *
 * @author Dianna
 */
public class Controller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//step 1
        for (int row = 1; row <= 10; row++) {
            for (int col = 1; col <= 10; col++) {
                if (row <= 10) {
                    System.out.print("X");

                }
            }
            System.out.println("");
        }
        System.out.println("\n\n");
//step 2
        for (int row = 1; row <= 10; row++) {
            for (int col = 1; col <= 10; col++) {
                if (row % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print("O");
                }//end if else
            }
            System.out.println("");//end col
        }//end row
        System.out.println("\n\n");
//step 3 
        for (int row = 1; row <= 10; row++) {
            for (int col = 1; col <= 10; col++) {
                if (row % 2 == 0 && col % 2 != 0) {
                    System.out.print("O");
                } else {
                    System.out.print("X");
                }//end if else
            }
            System.out.println("");//end col
        }//end row

        System.out.println("\n\n");
//step 4
        for (int row = 1; row <= 10; row++) {
            for (int col = 1; col <= 10; col++) {
                if (row % 2 != 0 || col % 2 != 0) {
                    System.out.print("O");
                } else {
                    System.out.print("X");
                }//end if else
            }
            System.out.println("");//end col
        }//end row
        System.out.println("\n\n");
//step 5
        for (int row = 1; row <= 10; row++) {
            for (int col = 1; col <= 10; col++) {
                if ((row == col) || (col + row == 11)) {
                    System.out.print("X");
                } else {
                    System.out.print("O");
                }

            }
            System.out.println("");
        }
        System.out.println("\n\n");
//step 6
        for (int row = 1; row <= 10; row++) {
            for (int col = 1; col <= 10; col++) {
                if (row == 2 * col) {
                    System.out.print("X");
                } else {
                    System.out.print("O");
                }

            }
            System.out.println("");
        }
        System.out.println("\n\n");
    }
}
