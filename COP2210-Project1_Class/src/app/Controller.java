// Step 1
//=============================================================================
// PROGRAMMER:  Dianna Bronson
// PANTHER ID:  6120678
//
// CLASS:       COP2210
// SECTION:     RVD
// SEMESTER:    Fall 2020
// CLASSTIME:   Online
//
// Project:     Project 1
// DUE:         9/27/2020
//
// CERTIFICATION: I understand FIU’s academic policies, and I certify that this
//              work is my own and that none of it is the work of any other person.
//=============================================================================
// end Step 1

package app;


import motor.Duramax;
import motor.V6;
import tool.Analyzer;
import vehicle.Truck;


public class Controller {

    public static void main(String[] args) {
            
        
 // Step 2   ------------------
 
            // Create a Duramax object name motor1 with 4 cylinders
            Duramax motor1 = new Duramax(4);
            //motor1.scan("");
            
      
            
            // Create a Duramax object name motor2 with 8 cylinders
            Duramax motor2 = new Duramax (8);
            //motor2.scan("");

// End step 2 ------------------

// Step 7 ---------------- 
              // Uncomment line 53 -56
              
            System.out.println("==============================================================");
            System.out.println("Direct Motor Scan");
            System.out.println("==============================================================");
            System.out.println("");
            

              // call the scan method on variable  motor1 with input ""
             motor1.scan("");
          
              
              // call the scan method on variable  motor2 with input "\t"
              motor2.scan("\t");
            

// end Step 7 ---------------- 


// Step 15 ---------------- 
//            // Create a variable  named motor3 of type V6 
            V6 motor3 = new V6();
            

            // call the scan method on variable  motor3 with input "\t\t"
            motor3.scan("\t\t");
           
            
// End Step 15 -----------------------      


// Step 23 -----------------------

              // Uncomment line the three System.out.println code below
                        System.out.println("");
                        System.out.println("--------------------------------------------------------------");
                        System.out.println("");

              // Create a Truck object named truck1 with inputs" "Colorado", motor1
              Truck truck1 = new Truck ("Colorado", motor1);
             

              // call the scan method on the variable truck1
              truck1.scan();
             
              
// end Step 23 -----------------------
            
// Step 24 -----------------------        
            // Create a Truck object named truck2 with inputs" "Colorado", motor3, 2014
            Truck truck2 = new Truck ("Colorado", motor3, 2014);
       
            
            // call the scan method on the variable truck2
            truck2.scan();
      
            
            
// end Step 24 -----------------------
            
// Step 28 -----------------------  
            // use the scanner of the Analyzer to scan Vehicle -> truck1
            Analyzer.getScanner().scanVehicle(truck1);
      
            

            // use the scanner of the Analyzer to scan Vehicle -> truck2
            Analyzer.getScanner().scanVehicle(truck2);
       

// end Step 28 -----------------------  

        System.out.println("");
            
    }
    
}
