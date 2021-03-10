//=============================================================================
// PROGRAMMER:Dianna Bronson
// PANTHER ID:6120678
//
// CLASS:       COP2210
// SECTION:     RVD
// SEMESTER:    Fall 2020
// CLASSTIME:   Online
//
// Project:     Lab 2
// DUE:         9/06/2020
//
// CERTIFICATION: I understand FIU’s academic policies, and I certify that this work is my 
//                own and that none of it is the work of any other person.
//=============================================================================
package general;

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
  //header
  System.out.println("");
  System.out.println("=====================================================");
  System.out.println("Investment Values");
  System.out.println("=====================================================");
  
  double initialInvestmentValue = 10000.00;
  
System.out.println("=====================================================");
System.out.println("Step 6");
System.out.println("=====================================================");

double year1Return = 0.15;
double year2Return = 0.03;
double year3Return = -0.02;
double year4Return = -0.015;
double year5Return = 0.06;

double year1Value = initialInvestmentValue * (1 + year1Return);
System.out.println("year1value = " +year1Value);

double year2Value = year1Value * (1 + year2Return);
System.out.println("year2Value = " +year2Value);

double year3Value = year2Value * (1 + year3Return);
System.out.println("year3Value = " +year3Value);

double year4Value = year3Value * (1 + year4Return);
System.out.println("year4Value = " +year4Value);

double year5Value = year4Value * (1 + year5Return);
System.out.println("year5Value = " +year5Value);
System.out.println("=====================================================");

//Calculations of the square
System.out.println("=====================================================");
System.out.println("Step 7");
System.out.println("=====================================================");

double squareSide = 12.547;

double squarePerimeter = squareSide * 4;
System.out.println("The perimeter of the square is: " +squarePerimeter);

double squareArea = squareSide * squareSide;
System.out.println("The area of the square is: " +squareArea);

System.out.println("=====================================================");

//Calculations of the rectangle
System.out.println("=====================================================");
System.out.println("Step 8");
System.out.println("=====================================================");

double rectangleSide1 = 275.6421;
double rectangleSide2 = 55.23;

double rectanglePerimeter = (rectangleSide1 * 2) + (rectangleSide2 * 2);
System.out.println("The perimeter of the rectangle is: " +rectanglePerimeter);

double rectangleArea = rectangleSide1 * rectangleSide2;
System.out.println("The Area of the rectangle is: " +rectangleArea);

System.out.println("=====================================================");

//Calculations of the triangle

System.out.println("=====================================================");
System.out.println("Step 9");
System.out.println("=====================================================");

double sideA = 30.0;
double sideB = 50.0;
double sideC = Math.pow( 3400, .5);

double trianglePerimeter = sideA + sideB +sideC;
System.out.println("The perimeter of the triangle is: " +trianglePerimeter);

double triangleArea = (sideA + .5) * sideB;
System.out.println("The area of the triangle is: " +triangleArea);

System.out.println("=====================================================");

//Calculations of the circle

System.out.println("=====================================================");
System.out.println("Step 10");
System.out.println("=====================================================");

double circleDiameter = 20.562;
double circleRadius = 20.562 * .5;

double circumference = 2 * Math.PI *circleRadius;
System.out.println("The circumference of the circle is: " +circumference);
 
double circleArea = Math.PI * (Math.pow(circleRadius, 2));
System.out.println("The area of the circle is: " +circleArea);

System.out.println("=====================================================");

//Calculations of the cylinder

System.out.println("=====================================================");
System.out.println("Step 11");
System.out.println("=====================================================");

double cylinderRadius = 20.215;
double cylinderHeight = 120.54;
        
double surfaceArea = (2 * Math.PI * cylinderRadius * cylinderHeight) + (2 * Math.PI * Math.pow(cylinderRadius, 2));
System.out.println("The surface area of the cylinder is: " +surfaceArea);

double cylinderVolume = Math.PI * Math.pow(cylinderRadius, 2) * cylinderHeight;
System.out.println("The volume of the cylinder is: " +cylinderVolume);

System.out.println("=====================================================");

//Scary problem

System.out.println("=====================================================");
System.out.println("Step 12");
System.out.println("=====================================================");

double x = 2.34;
double y = 2.6;
double z = 4.0;

double temp1 = Math.pow(2.34, 2.7);
System.out.println("The value of temp1 is: " +temp1);

double temp2 = (23 * z) / (Math.sqrt( x * Math.pow(y, 2)));
System.out.println("The value of temp2 is: " + temp2);

double temp3 = (Math.pow (z, 3) / (3 * x * Math.pow(y, -5.3)));
System.out.println("The Value of temp3 is: " +temp3);

double temp4 = 19 * x * y * z;
System.out.println("The value of temp4 is: " +temp4);

double temp5 = Math.sqrt(temp2 + temp3);
System.out.println("The value of temp5 is: " +temp5);

double solution = temp1 - temp5 + temp4;
System.out.println("The value of the result is: " +solution);

System.out.println("=====================================================");
        
        


        

  



       



        


        


   
    }
    
}
