/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bed;

import java.util.Random;
/**
 *
 * @author Dianna
 */

public class Sheets {
    
    private static int serialNumber = 26463;
    private final static String SHEET_FACTORY_ID = "Babcock Ranch";
    
    private String color;
    private String factory;
    private int sheetID;
    private int threadCount;
    private int price;
    
public Sheets () {
    serialNumber++;
    this.sheetID = serialNumber;
    this.factory = SHEET_FACTORY_ID;
    Random rand = new Random();
    this.threadCount = rand.nextInt(250)+ 100;
    this.price = rand.nextInt(200)+ 100;
    this.color = "white";
    

}
public Sheets (String color, int threadcount) {
    
    this ();
    this.threadCount = threadCount;
    this.color = color;

    }
    
 public static int getSerialNumber () {
     return serialNumber;
    }
 public static void setSerialNumber (int serialNumber) {  
     Sheets.serialNumber = serialNumber;
 }
 public void displayInfo(){
       System.out.println("------------------------------------");
       System.out.println("Sheets Info");
       System.out.println("------------------------------------");
       System.out.println("serialNumber:              "+ sheetID);
       System.out.println("Factory:                   "+ factory);
       System.out.println("Thread Count:              "+ threadCount );
       System.out.println("Color:                     "+ color);
       System.out.println("Price:                     "+ price);
       System.out.println();
    }
    public static void displayClassInfo(){
       System.out.println("------------------------------------");
       System.out.println("Sheets Class Info");
       System.out.println("------------------------------------");
       System.out.println("Serial Number:              "+ serialNumber);
       System.out.println("can't get this last thing to print");
       System.out.println("Sheets Factory ID:          "+ SHEET_FACTORY_ID);
       System.out.println("just kidding. Robyn pointed out my dumbass mistake");
       System.out.println("SUCK IIIIIT");
    }


}
