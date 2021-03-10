/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food;

/**
 *
 * @author Dianna
 */
public class Apple {

//----------------------------------------------------------
// Instant variables
//----------------------------------------------------------
// YOUR CODE HERE
private String type;
double weight;
double pricePreUnitWeight;

//----------------------------------------------------------
// Constructor
//----------------------------------------------------------
public Apple(String type, double pricePreUnitWeight, double weightInGrams) {
// convert gram into lbsweight =  0.00220 * weightInGrams;
weight = 0.00220 * weightInGrams;
this.type = type;
this.pricePreUnitWeight = pricePreUnitWeight;}
//----------------------------------------------------------
// Setters and Getters
// IMPORTANT: match the UML Diagram
//----------------------------------------------------------
public String getType(){
    return type;
}
public double getWeight(){
    return weight;
}
public double getPricePreUnitWeight(){
    return pricePreUnitWeight;
}

public void setPricePreUnitWeight(double pricePreUnitWeight, String personal){
    this.pricePreUnitWeight = pricePreUnitWeight;
}
    

//----------------------------------------------------------
// Utility methods
// Check UML Diagram
//----------------------------------------------------------
// setPricePreUnitWeight method
// YOUR CODE HERE

// displayInfo method
// use printf and println method see below
// Hint code:
public void displayInfo(){
System.out.println("==========================================");
System.out.println("Apple Info");
System.out.println("==========================================");
System.out.printf("Type:\t\t\t %-15s\n", type);
System.out.printf("Weight:\t\t\t %-6.4f lbs\n", weight);
System.out.printf("Price Pre Unit:\t\t %-10.2f\n", pricePreUnitWeight);
System.out.printf("Price:\t\t\t %-10.2f\n", price());
        }
// YOUR CODE HERE

// price method
// done for you :)
public double price(){
        double price = weight * pricePreUnitWeight;return price;

        }//end of class
}
