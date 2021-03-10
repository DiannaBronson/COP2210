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
public class Sandwich {
  
//----------------------------------------------------------
// Instant variables
//----------------------------------------------------------
// YOUR CODE HERE

String bread;
boolean meat;
boolean cheese;
boolean veggies;
double price;
//----------------------------------------------------------
// Constructor
//----------------------------------------------------------
    public Sandwich(boolean meat, boolean cheese, boolean veggies) {
        bread = "White";
    
// if else for all combinations of the sandwichs
// set the price of each conbination
// see project document for prices
// YOUR CODE HERE
if ((meat == true) && (cheese == true) && (veggies == true)){
      price = 7.99;
  }else if ((meat == true) && (cheese == true) && (veggies == false)){
      price = 7.59;
  }else if ((meat == true) && (cheese == false) && (veggies == true)){
      price = 7.09;
  }else if ((meat == true) && (cheese == false) && (veggies == false)){
      price = 6.89;
  }else if ((meat == false) && (cheese == true) && (veggies == true)){
      price = 5.99;
  }else if ((meat == false) && (cheese == true) && (veggies == false)){
      price = 5.59;
  }else if ((meat == false) && (cheese == false) && (veggies == true)){
      price = 5.09;
  }else{
      price = 4.99;
  }
    
    this.meat = meat;
    this.cheese = cheese;
    this.veggies = veggies;}


public Sandwich(String bread, 
            boolean meat, 
            boolean cheese, 
            boolean veggies) {
        this(meat, cheese, veggies);
        this.bread = bread; }
//----------------------------------------------------------
// Setters and Getters// IMPORTANT: match the UML Diagram
//----------------------------------------------------------
// YOUR CODE HERE
public String getBread(){
    return bread;
}
public void setBread (String bread){
    this.bread = bread;
}
public boolean isMeat(){
    return meat;
}
public void setMeat(boolean meat){
    this.meat = meat;
}
public boolean isCheese(){
    return cheese;
}
public void setCheese(boolean cheese){
    this.cheese = cheese;
}
public boolean isVeggies(){
    return veggies;
}
public void setVeggies(boolean veggies){
    this.veggies = veggies;
}
public double getPrice(){
    return price;
}
    

    


//----------------------------------------------------------
// Utility methods
// Check UML Diagram
//----------------------------------------------------------
// displayInfo method
// Hint: code
public void displayInfo(){
    System.out.println("==========================================");
    System.out.println("Sandwich Info");
    System.out.println("==========================================");
    System.out.printf("Bread:\t\t\t %-15s\n", bread);
    System.out.printf("Meat:\t\t\t %-15b \n", meat);
    System.out.printf("Cheese: \t\t\t %-15b \n", cheese);
    System.out.printf("Veggies: \t\t %-15b \n", veggies);
    System.out.printf("Price:\t\t\t $%-15s\n", price);
    System.out.println("");
    }
    
    
// YOUR CODE HERE
}
        //} end of class
        

        

