/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package central;

import hardware.CPU;
import hardware.Harddrive;
import hardware.Memory;
import hardware.VideoCard;

/**
 *
 * @author Dianna
 */
public class Computer {

    private CPU cpu;
    private Harddrive harddrive;
    private Memory memory;
    private VideoCard videocard;

    public Computer(CPU cpu, Harddrive harddrive, Memory memory, VideoCard videocard) {
        this.cpu = cpu;
        this.harddrive = harddrive;
        this.memory = memory;
        this.videocard = videocard;

    }

    public void displayInfo() {
        System.out.println("--------------------------------------------------");
        System.out.println("Computer Info");
        System.out.println("--------------------------------------------------");
        System.out.println(" ");
        cpu.displayInfo();
        harddrive.displayInfo();
        memory.displayInfo();
        videocard.displayInfo();

        System.out.println("--------------------------------------------------");
        System.out.printf("Computer total price: \t %-10.2f \n ", computerPrice());
    }

    /**
     *
     */
    private double computerPrice() {
        double totalPrice = 0.0;

        totalPrice = cpu.getPrice() + harddrive.getPrice() + memory.getPrice() + videocard.getPrice();
        return totalPrice;
    }
}
