/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hardware;

/**
 *
 * @author Dianna
 */
public class Memory {

    private String manufacturer;
    private String speed;
    private String size;
    private double price;

    public Memory(String manufacturer, String speed, String size, double price) {
        this.manufacturer = manufacturer;
        this.speed = speed;
        this.size = size;
        this.price = price;
    }
//getters aka Accessor Methods and setters aka Mutator Methods

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String Speed) {
        this.speed = speed;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("");
        System.out.println("-------------------------------------------------");
        System.out.println("Memory Info");
        System.out.println("-------------------------------------------------");
        System.out.printf("Manufacturer:\t\t%-10s \n", manufacturer);
        System.out.printf("Speed:\t\t\t%-10s \n", speed);
        System.out.printf("Size:\t\t\t%-10s \n", size);
        System.out.printf("Price:\t\t\t%-10.2f \n", price);
    }
}
