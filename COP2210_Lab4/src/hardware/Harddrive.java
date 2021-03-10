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
public class Harddrive {

    private String manufacturer;
    private String interfaceBus;
    private int cache;
    private double formFactor;
    private double price;

    public Harddrive(String manufacturer, String interfaceBus,
            int cache, double formFactor, double price) {
        this.manufacturer = manufacturer;
        this.interfaceBus = interfaceBus;
        this.cache = cache;
        this.formFactor = formFactor;
        this.price = price;
    }
//getters aka Accessor Methods and setters aka Mutator Methods

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getInterfaceBus() {
        return interfaceBus;
    }

    public void setInterfaceBus(String interfaceBus) {
        this.interfaceBus = interfaceBus;
    }

    public int getcache() {
        return cache;
    }

    public void setCache(int cache) {
        this.cache = cache;
    }

    public double getformFactor() {
        return formFactor;
    }

    public void setformFactor(double formFactor) {
        this.formFactor = formFactor;
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
        System.out.println("Harddrive Info");
        System.out.println("-------------------------------------------------");
        System.out.printf("Manufacturer:\t\t%-10s \n", manufacturer);
        System.out.printf("Interface Bus:\t\t%-10s \n", interfaceBus);
        System.out.printf("Cache:\t\t\t%-10d \n", cache);
        System.out.printf("Form Factor:\t\t%-10s \n", formFactor);
        System.out.printf("Price:\t\t\t%-10.2f \n", price);

    }

}
