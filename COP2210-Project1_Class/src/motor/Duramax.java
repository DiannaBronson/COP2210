package motor;

public class Duramax {

    // Class constants and variables
    //---------------------------------------------------------------
    public static final String SERIAL_ID = "GM-DMAX-";
    public static final String FACTORY_LOCATION = "OHIO-";
    public static int engineCounter = 5500;

    // Instance constants and variables
    //---------------------------------------------------------------
    private double displacement;
    private int numberOfCylinders;
    private String serialNumber;
    private String fuelType;
    private double mpg;

    // Constructors
    //---------------------------------------------------------------
    public Duramax() {

// Step 3 --------------------------
        // update the instance variable serialNumber to equal 
        // the addition of the SERIAL_ID , FACTORY_LOCATION , and engineCounter
        // The serial number should look simalar to this format : GM-DMAX-OHIO-5500 
        this.serialNumber = SERIAL_ID + FACTORY_LOCATION + engineCounter;
        // increment the class variable engineCounter by 1
        engineCounter = engineCounter ++;
// end Step 3 ----------------------
        displacement = 2.8;
        numberOfCylinders = 4;
        fuelType = "Diesel";
        mpg = 25;

    }

    //------------------------------------------------
    public Duramax(int numberOfCylinders) {

// Step 4 -----------------------
        // call the default constructor
        // Hint: this
        // Make sure you understand what is going on here
        this();

// end Step 4 -----------------------
        // if-else statement that you will learn how to use in the branching
        // section of the course
        if (numberOfCylinders == 8) {

            // Step 5 -----------------------
            // set the instance variable numberOfCylinders to the value of the
            // input of this constructor numberOfCylinders
            this.numberOfCylinders = numberOfCylinders;
// end Step 5 -----------------------    
            displacement = 6.6;
            mpg = 19.6;
        }//end if
    }
    //------------------------------------------------

    //---------------------------------------------------------------
    // Class  methods
    //---------------------------------------------------------------
    public static String getSERIAL_ID() {
        return SERIAL_ID;
    }

    //------------------------------------------------
    public static String getFACTORY_LOCATION() {
        return FACTORY_LOCATION;
    }

    //------------------------------------------------
    public static int getEngineCounter() {
        return engineCounter;
    }

    //---------------------------------------------------------------
    // Instance setters name getters methods
    //---------------------------------------------------------------
    public double getDisplacement() {
        return displacement;
    }

    //------------------------------------------------
    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    //------------------------------------------------
    public String getSerialNumber() {
        return serialNumber;
    }

    //------------------------------------------------
    public String getFuelType() {
        return fuelType;
    }

    //------------------------------------------------
    public double getMpg() {
        return mpg;
    }

    //---------------------------------------------------------------
    // Instance Utility Methods
    //---------------------------------------------------------------
    public double engineScannerTorque() {

        return calculateTorque();
    }

    public double engineScannerHP() {

        return calculateHP();
    }

    private double calculateTorque() {

        final double TORQUE_CONSTANT = 3.4;
        final double CYLINDER_LOAD_FACTOR = 74.13;
        double torque = 0.0;
//Step 8 ------------------

        // store the value of the math formula shown in the project instruction for this step
        // in the variable named torque
        double temp1 = (Math.pow(Math.exp(TORQUE_CONSTANT) , 0.59));
        torque = ((CYLINDER_LOAD_FACTOR)) * Math.pow((Math.pow((displacement / numberOfCylinders) , 2)) * Math.exp(TORQUE_CONSTANT), 0.59);
// end Step 8       
        return torque;
    }

    //------------------------------------------------
    private double calculateHP() {
        
        double hp = 0.0;
        // Step 9 ------------------       
        // store the value of the math formula shown in the project instruction for this step
        // in the variable named torque
        
        double temp2 = (((Math.PI * 4700 * calculateTorque()) / 33000));
        hp = (Math.sqrt(temp2)) *(Math.pow(numberOfCylinders, 1.926));
// end Step 9 ---------------      
        

        return hp;
    }

    public void scan(String spacer) {
        System.out.println("");
// Step 6 -----------------------
        // Use println and printf methods for the output and make sure your output is aligned
        // as shown below
        /*
        
        ----------------------------------------------
        Scanning Duramax
        ----------------------------------------------
        Displacement:		2.800      
        Number of Cylinders:	4          
        Fuel Type:                  Diesel     
        Serial Number:		GM-DMAX-OHIO-5500 
        MPG:			25.000    
        
         */
        // hint: 
        System.out.println(spacer + "----------------------------------------------");
        System.out.println(spacer + "Scanning Duramax");
        System.out.println(spacer + "----------------------------------------------");
        System.out.printf(spacer + "Displacement:\t\t %-10.3f \n", displacement);
        //Here the spacer variable is a spacing string like "\t"

        System.out.printf(spacer + "Number of Cylinders: %7s   \n", numberOfCylinders);
        System.out.printf(spacer + "Fuel Type: \t\t %-10s \n", fuelType);
        System.out.printf(spacer + "Serial Number: \t\t %-10s \n", serialNumber);
        System.out.printf(spacer + "MPG: \t\t\t %-10f \n", mpg);
// end Step 6 -----------------------
// Step 10 -----------------------        
        // Use printf to output the torque and  hp values of the motor
        // see project instruction for the format of the output
        System.out.printf(spacer + "Torque: \t\t\t %.03f \n", calculateTorque());
        System.out.printf(spacer + "Hp: \t\t\t %.03f \n", calculateHP());
// end Step 10 -----------------------     
    }

}//end of class
