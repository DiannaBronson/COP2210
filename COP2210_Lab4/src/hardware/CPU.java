package hardware;

/**
 *
 * @author Dianna
 */
public class CPU {

    private String manufacturer;
    private String frequency;
    private int cores;
    private int watts;
    private double price;

    public CPU(String manufacturer, String frequency, int cores,
            int watts, double price) {
        this.manufacturer = manufacturer;
        this.frequency = frequency;
        this.cores = cores;
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

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public int getCores() {
        return cores;
    }

    public void setCore(int cores) {
        this.cores = cores;
    }

    public int watts() {
        return watts;
    }

    public void getWatts(int watts) {
        this.watts = watts;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //display info
    public void displayInfo() {
        System.out.println("");
        System.out.println("-------------------------------------------------");
        System.out.println("CPU Info");
        System.out.println("-------------------------------------------------");
        System.out.printf("Manufacturer:\t\t%-10s \n", manufacturer);
        System.out.printf("Frequency:\t\t%-10s \n", frequency);
        System.out.printf("Cores:\t\t\t%-10d \n", cores);
        System.out.printf("Watts:\t\t\t%-10d \n", watts);
        System.out.printf("Price:\t\t\t%-10.2f \n", price);

    }
} //end class CPU

