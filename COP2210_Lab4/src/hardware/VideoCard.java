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
public class VideoCard {

    private String manufacturer;
    private String memory;
    private int watts;
    private double price;

    public VideoCard(String manufacturer, String memory, int watts, double price) {
        this.manufacturer = manufacturer;
        this.memory = memory;
        this.watts = watts;
        this.price = price;
    }
//getters aka Accessor Methods and setters aka Mutator Methods

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public int getWatts() {
        return watts;
    }

    public void setWatts(int watts) {
        this.watts = watts;
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
        System.out.println("Video Card Info");
        System.out.println("-------------------------------------------------");
        System.out.printf("Manufacturer:\t\t%-10s \n", manufacturer);
        System.out.printf("Memory:\t\t\t%-10s \n", memory);
        System.out.printf("Watts:\t\t\t%-10d \n", watts);
        System.out.printf("Price:\t\t\t%-10.2f \n", price);
    }
}
