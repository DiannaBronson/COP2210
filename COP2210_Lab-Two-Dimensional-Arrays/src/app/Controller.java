//=============================================================================
// PROGRAMMER:  Dianna Bronson
// PANTHER ID:  6120678
//
// CLASS:       COP2210
// SECTION:     RVD
// SEMESTER:    Fall 2020
// CLASSTIME:   Online
//
// Project:     Lab 7
// DUE:         11/1/2020
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
        // TODO code application logic here

        int rows = 10;
        int columns = 15;
        String[][] numbers = new String[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == 4 || i == 5 || j == 7 || j == 8) {
                    numbers[i][j] = "1";

                } else {
                    numbers[i][j] = "0";
                }

                System.out.print(numbers[i][j] + "\t");

            }
            System.out.println("");

        }
        System.out.println("");
        System.out.println("");
        // second array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == 4 || i == 5 || j == 7 || j == 8) {
                    numbers[i][j] = "1";

                } else {
                    numbers[i][j] = "0";
                }
                if (i > 5 && j < 7) {
                    numbers[i][j] = "M";
                }
                if (i < 5 && j > 7) {
                    numbers[i][j] = "H";
                }

                System.out.print(numbers[i][j] + "\t");

            }
            System.out.println("");
        }
    }
}
