/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package machine;

//import machine.Register;
import food.Apple;
import food.Sandwich;
import transactions.Payment;

/**
 *
 * @author Dianna
 */
public class Register {

//----------------------------------------------------------
// Class variables// Check UML Diagram
//----------------------------------------------------------
    private static int registerCounter = 0;
    private static final String REGISTERCODE = "US-FL-032020-";

//YOURCODE HERE
//----------------------------------------------------------
// Instant variables// Check UML Diagram
//----------------------------------------------------------
// YOUR CODE HERE
    private static double DOLLARVALUE = 1.0;
    private static double QUARTERVALUE = 0.25;
    private static double DIMEVALUE = 0.10;
    private static double NICKELVALUE = 0.05;
    private static double PENNYVALUE = 0.01;

    String registerID;
    int numberOfOneDollarBills;
    int numberOfQuarters;
    int numberOfDimes;
    int numberOfNickels;
    int numberOfPennies;
    double currentTotal;
//----------------------------------------------------------
// Constructor
//----------------------------------------------------------

    public Register(int numberOfOneDollarBills, int numberOfQuarters, int numberOfDimes, int numberOfNickels, int numberOfPennies) {
// increment registerCounter by one
// YOUR CODE HERE
        registerCounter++;

// set registerID to REGISTERCODE + registerCounter
// YOUR CODE HERE
        registerID = REGISTERCODE + registerCounter;
        currentTotal = 0.0;
// set the constructor inputs values to the register instant variables
// hint code:
//this.numberOfOneDollarBills = numberOfOneDollarBills;
//YOUR CODE HERE
        this.numberOfOneDollarBills = numberOfOneDollarBills;
        this.numberOfQuarters = numberOfQuarters;
        this.numberOfDimes = numberOfDimes;
        this.numberOfNickels = numberOfNickels;
        this.numberOfPennies = numberOfPennies;

    }
//----------------------------------------------------------
// Utility methods
// Check UML Diagram//----------------------------------------------------------

    private double cashValue() {
        double total = numberOfOneDollarBills * DOLLARVALUE
                + numberOfQuarters * QUARTERVALUE
                + numberOfDimes * DIMEVALUE
                + numberOfNickels * NICKELVALUE
                + numberOfPennies * PENNYVALUE;
        return total;
    }

    public void cashInfo(String personal) {
// if the personal is a Manager
// then output the cashValue of the register
// hint code:
        if (personal.equals("Manager")) {
            System.out.println("==========================================");
            System.out.println("Register Cash Info");
            System.out.println("==========================================");
            System.out.println("Access Level:\t\t Valid");
            System.out.printf("Cash in the Register:\t $%-15.2f\n", cashValue());
            System.out.printf("Dollars:\t\t\t %-15d\n", numberOfOneDollarBills);
            System.out.printf("Quarters:\t\t %-15d\n", numberOfQuarters);
            System.out.printf("Dimes: \t\t\t %-15d\n", numberOfDimes);
            System.out.printf("Nickels: \t\t %-15d\n", numberOfNickels);
            System.out.printf("Pennies: \t\t %-15d\n", numberOfPennies);
            System.out.println("==========================================");
            System.out.println("==========================================");
        } else {
            System.out.println("==========================================");
            System.out.println("Register Cash Info");
            System.out.println("==========================================");
            System.out.println("Access Level:\t\t Not Valid by " + personal);
            System.out.println("");

        }

// else the personal is not a Manager the denied access
// hint code:
// hint use an if else statement
// YOUR CODE HERE
    }

    public void buyApple(Apple apple, Payment payment) {
        System.out.println("==========================================");
        System.out.println("Register Buy Apple");
        System.out.println("==========================================");
        System.out.printf("Apple Price:\t\t $%-15.2f\n", apple.price());
        System.out.printf("Payment:\t\t\t $%-15.2f\n", payment.paymentValue());

        // check if you have enoughpayment to buy the apple
        // if your payment is less the apple price calculate the amount short
        // and output to the console 
        // Sorry but you do not have enough money to buy the Apple
        // hint code:
        double shortAmount = apple.price() - payment.paymentValue();
        if (payment.paymentValue() < apple.price()) {

            System.out.printf("You need:\t\t $%-15.2f\n", shortAmount);
            System.out.println("");
            System.out.println("Sorry but you do not have enough money to buy the Apple");
            System.out.println("==========================================");
            System.out.println("\n");
        } else {
            giveChange(apple.price(), payment);
        }
// else you have enough payment then give change to buyer
// hence call the giveChange method with the apple price and payment
// hint: use an if else statement
// YOUR CODE HERE

    }
//
//end buyApple()

    public void buySandwich(Sandwich sandwich, Payment payment) {
//{
        System.out.println("==========================================");
        System.out.println("Register Buy Sandwich");
        System.out.println("==========================================");
// check if you have enough payment to buy the sandwich
// if your payment is less the sandwich price calculate the amount short
// and output to the console 
// Sorry but you do not have enough money to buy the Sandwich
        // hint code:
        double shortAmount = sandwich.getPrice() - payment.paymentValue();

        System.out.printf("Sandwich Price:\t\t $%-15.2f\n", sandwich.getPrice());
        System.out.printf("Payment:\t\t\t $%-15.2f\n", payment.paymentValue());
        if (payment.paymentValue() < sandwich.getPrice()) {
            System.out.printf("You need:\t\t $%-15.2f\n", shortAmount);
            System.out.println("");
            System.out.println("Sorry but you do not have enough money to buy the Sandwich");
            System.out.println("==========================================");
            System.out.println("\n");
        } else {
            giveChange(sandwich.getPrice(), payment);
        }

/// else you have enough payment then give change to buyer
// hence call the giveChange method with the sandwich price and payment
// hint: usean if else statement
// YOUR CODE HERE}
//end buySandwich()
    }
    // hint use an if else statement
    // YOUR CODE HERE
    //}
    //}

    // else you have enough payment then give change to buyer
    // hence call the giveChange method with the sandwich price and payment
    // hint: usean if else statement
    // YOUR CODE HERE}
    //end buySandwich()
    // add payment to register
    // hint code: 
    //  numberOfOneDollarBills += payment.getNumberOfOneDollarBills();
    // YOUR CODE HERE
    private void giveChange(double price, Payment payment) {
        numberOfOneDollarBills += payment.getNumberOfOneDollarBills();
        numberOfQuarters += payment.getNumberOfQuarters();
        numberOfDimes += payment.getNumberOfDimes();
        numberOfNickels += payment.getNumberOfNickels();
        numberOfPennies += payment.getNumberOfPennies();

// calculate needed change
// YOUR CODE HERE
    
        double neededChange = payment.paymentValue() - price;
// roundedto whole number so you can use the % operator for the change
// example 9.65 becomes 965
        int neededChangeWhole = (int) Math.round(neededChange * 100);
        System.out.printf("Needed Change:\t\t $%-15.2f\n", neededChange);
// figure out the dollar to give back
// hint: 965 /100 = 9 because of the int/ int
// so you have 9 dollars
// update the remaining change to give back
// 965 –900 = 65 this is the cents you need to give back
// figure out the quarters to give back
// YOUR CODE HERE
        int changeDollars = neededChangeWhole / 100;
// update the remaining change to give back
// YOUR CODE HERE
        int changeUpdate1 = neededChangeWhole - (changeDollars * 100);
        int changeQuarters = changeUpdate1 / 25;
// figure out the dimes to give back
// YOUR CODE HERE
        int changeUpdate2 = changeUpdate1 - (changeQuarters * 25);
        int changeDimes = changeUpdate2 / 10;
// update the remaining change to give back
// YOUR CODE HERE
        int changeUpdate3 = changeUpdate2 - (changeDimes *10);
// figure out the nickels to give back
// YOUR CODE HERE
        int changeNickels = changeUpdate3 / 5;
// update the remaining change to give back
// YOUR CODE HERE
        int changeUpdate4 = changeUpdate3 -(changeNickels * 5);
// figure out the pennies to give back
// YOUR CODE HERE
        int changePennies = changeUpdate4;
// give the change back
// remove the dollars, quarters, dimes, nickels, pennies
// from the register
// Hint code:
// numberOfOneDollarBills -= changeDollars;
// YOUR CODE HERE
        numberOfOneDollarBills -= changeDollars;
        numberOfQuarters -= changeQuarters;
        numberOfDimes -= changeDimes;
        numberOfNickels -= changeNickels;
        numberOfPennies -= changePennies;
        /* 

        

         */

// output to the console the change:
// dollars, quarters, dimes, nickels, pennies
// Hint code:
// System.out.printf("Dollars:\t\t %-15d\n", changeDollars);
// System.out.printf("Quaters:\t\t %-15d\n", changeQuaters);
// YOUR CODE HERE}}
        System.out.printf("Dollars: \t\t %-15d\n", changeDollars);
        System.out.printf("Quarters:\t\t %-15d\n", changeQuarters);
        System.out.printf("Dimes:   \t\t %-15d\n", changeDimes);
        System.out.printf("Nickels: \t\t %-15d\n", changeNickels);
        System.out.printf("Pennies: \t\t %-15d\n", changePennies);
    }
}
//end class
