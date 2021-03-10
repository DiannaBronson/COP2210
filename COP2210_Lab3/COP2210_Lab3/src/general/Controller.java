//=============================================================================
// PROGRAMMER:  Dianna Bronson
// PANTHER ID:  6120678
//
// CLASS:       COP2210
// SECTION:     RVD
// SEMESTER:    Fall 2020
// CLASSTIME:   Online
//
// Project:     Lab 3
// DUE:         9/13/2020
//
// CERTIFICATION: I understand FIU’s academic policies, and I certify that this
//              work is my own and that none of it is the work of any other person.
//=============================================================================
package general;

import vehicle.Car;

/**
 *
 * @author Dianna
 */
public class Controller {
    
    public static void main(String[] args) 
    {// create Car instance named c1 using the default constructor
        Car c1 = new Car();
    // create Car instance named c2 which is White and has 4 doors
        Car c2 = new Car("white", 4);
    // create Car instance named c3 which is Red and has 2 doors
        Car c3 = new Car ("Red", 2);
    // create Car instance named c4 which is Green and has 6 doors
        Car c4 = new Car ("Green", 6);
    // call the displayInfo method on c1
        c1.displayInfo();
    // call the displayInfo method on c2
        c2.displayInfo();
    // call the displayInfo method on c3
        c3.displayInfo();
    // call the displayInfo method on c4
        c4.displayInfo();
    // call the displayCarInfo method on the class Car
        Car.displayClassInfo();
    /**
     * @param args the command line arguments
     */
   
    }
    
}
