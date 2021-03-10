/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;

import java.util.Random;
/**
 *
 * @author Dianna
 */
public class Car {
    private static int vehicleCounter = 1000;
    private static final String CAR_FACTORY_ID = "Michigan";
    
    private String color;
    private String factory;
    private int carID;
    private int numberOfDoors;
    private int price;
    
    public Car() {
        vehicleCounter++;
        this.carID = vehicleCounter;
        this.factory = CAR_FACTORY_ID;
        Random rand = new Random();
        this.price = rand.nextInt(5000) + 25000;
        this.color = "Black";
        this.numberOfDoors = 2;
    }
    public Car(String colour, int dumbleDoors){
        this ();
        this.numberOfDoors = dumbleDoors;
        this.color = colour;
    }
    public static int getVehicleCounter(){
        return vehicleCounter;
    }
    public static void setVehicleCounter(int vehicleCounter) {
        Car.vehicleCounter = vehicleCounter;
    }
    public void displayInfo(){
       System.out.println("------------------------------------");
       System.out.println("Car Info");
       System.out.println("------------------------------------");
       System.out.println("CarId:                     "+ carID);
       System.out.println("Factory:                   "+ factory);
       System.out.println("Number of Doors:           "+ numberOfDoors);
       System.out.println("Color:                     "+ color);
       System.out.println("Price:                     "+ price);
       System.out.println();
    }
    public static void displayClassInfo(){
       System.out.println("------------------------------------");
       System.out.println("Car Class Info");
       System.out.println("------------------------------------");
       System.out.println("vehicleCounter:            "+ vehicleCounter);
       System.out.println("CAR_FACTORY_ID:            "+ CAR_FACTORY_ID);
    }
    
}
