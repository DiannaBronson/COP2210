//=============================================================================
// PROGRAMMER:  Dianna Bronson
// PANTHER ID:  6120678
//
// CLASS:       COP2210
// SECTION:     RVD
// SEMESTER:    Fall 2020
// CLASSTIME:   Online
//
// Project:     Lab 5
// DUE:         10/11/2020
//
// CERTIFICATION: I understand FIU’s academic policies, and I certify that this
//              work is my own and that none of it is the work of any other person.
//=============================================================================
package decision;

import java.util.Scanner;

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
        //----------------------------------------------------------------------------
//step 2: simple if-else
//----------------------------------------------------------------------------
        System.out.println("");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Step: 2");
        System.out.println("--------------------------------------------------------------");
        System.out.println("");

        if (4 < 5) {
            System.out.println("Four is less than Five");
        } else {
            System.out.println("Four is not less than Five");
        }//end if-else
        //multi if-else
        System.out.println("");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Step: 3");
        System.out.println("--------------------------------------------------------------");
        System.out.println("");

        int cookTime = 8;
        if (cookTime == 10) {
            System.out.println("Cooktime is 10 minutes");
        } else if (cookTime == 9) {
            System.out.println("Cooktime is 9 minutes");
        } else if (cookTime == 8) {
            System.out.println("Cooktime is 8 minutes");
        } else if (cookTime == 7) {
            System.out.println("Cooktime is 7 minutes");

        } else {
            System.out.println("Cooktime is under 7 minutes");
        }
        //step 4 if else with user input
        System.out.println("");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Step: 4");
        System.out.println("--------------------------------------------------------------");
        System.out.println("");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the option for the number class you are in");
        System.out.println("--------------------------------------------------------------");
        System.out.println("1 - COP2210");
        System.out.println("2 - COP3337");
        System.out.println("Please enter a value: ");

        int userInput = sc.nextInt();

        if (userInput == 1) {
            System.out.println("\n you are in COP2210");

        } else if (userInput == 2) {
            System.out.println("\n you are in COP 3337");
        }
        System.out.println("");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Step: 5");
        System.out.println("--------------------------------------------------------------");
        System.out.println("");

        String statename1 = "Florida";
        String statename2 = "Colorado";
        if (statename1.equals("Florida")) {
            System.out.println("You are in Florida");
        }
        System.out.println("");
        if (statename1.equals(statename2)) {
            System.out.println("The two states do not have the same name");
        }
        if (statename1.equals("Florida") && statename2.equals("Colorado")) {
            System.out.println("Statename1 is Florida");
            System.out.println("Statename2 is Colorado");
        } else {
            System.out.println("You have the wrong state names");
        }
        System.out.println("");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Step: 6");
        System.out.println("--------------------------------------------------------------");
        System.out.println("");

        System.out.print("Enter your name:");
        String readingUserStringInput = sc.next();
        System.out.println("Your name is: " + readingUserStringInput);

        System.out.println("");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Step: 7");
        System.out.println("--------------------------------------------------------------");
        System.out.println("");

        System.out.print("Enter a number between 0 - 100: ");
        Scanner userInputReader = new Scanner(System.in);
        int someInput = userInputReader.nextInt();

        if (someInput <= 50) {
            System.out.println("You enter a number greater than or equal to 50");
        } else if (someInput <= 75) {
            System.out.println("You enter a number greater than 50 but" + " less than or equal to 75");

        } else if (someInput <= 100) {
            System.out.println("You enter a number greater than 75 but" + " less than or equal to 100");

        } else {
            System.out.println("You entered a value outside of the range");
        }
        String str1 = "Hello";
        String str2 = "Bye";

        if (str1.equals(str2)) {
            System.out.println("String text of str1 and str2 are the same");
        }
        System.out.println("");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Step: 8");
        System.out.println("--------------------------------------------------------------");
        System.out.println("");

        System.out.print("Enter the engine feul-mixture value:");
        Scanner aScanner = new Scanner(System.in);
        double mixture = aScanner.nextDouble();

        if (mixture >= 23.5) {
            System.out.println("Decrease Fuel Mixture by 0.30");
        } else if (mixture >= 23.0) {
            System.out.println("Decrease Feul Mixture by 0.10");
        } else if (mixture >= 22.5) {
            System.out.println("Decrease Feul Mixture by 0.05");
        } else if (mixture >= 21.0) {
            System.out.println("Feul Mixture is OK");
        } else if (mixture >= 20.0) {
            System.out.println("Increase Feul Mixture by 0.10");
        } else {
            System.out.println("sensor needs to be checked");
        }
        System.out.println("");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Step: 9");
        System.out.println("--------------------------------------------------------------");
        System.out.println("");

        Scanner anotherScanner = new Scanner(System.in);

        System.out.print("Enter the gear you are in");
        int gear = anotherScanner.nextInt();

        System.out.print("\nEnter the rpm of the engine");
        int rpm = anotherScanner.nextInt();

        System.out.print("\nAre the brakes on (y/n): ");
        String brakes = anotherScanner.next();

        System.out.println("Gear = " + gear);
        System.out.println("RPM = " + rpm);
        System.out.println("Brakes = " + brakes);

        if (gear == 6 && rpm >= 1200) {

            if (brakes.equals("y")) {
                System.out.println("Please get off the brakes they are getting hot");
            }else{
            System.out.println("You are moving");
            }
        } else {
            if (brakes.equals("y")) {
                System.out.println("please get off of the brakes");
            }else{
            System.out.println("ok");
            }
        }
    }

}
