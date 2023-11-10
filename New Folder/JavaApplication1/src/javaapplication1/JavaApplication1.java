/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author MUON
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String vehicle1Name = "Car";
        int carWheels = 4;
        double carCapacity = 5;
        
        String vehicle2Name = "Truck";
        int truckWheels = 10;
        double truckCapacity = 3; 
        
        String vehicle3Name = "Motorcycle";
        int motorWheels = 2;
        double motorCapacity = 1; 
        
        boolean moreCapacity = (truckCapacity > carCapacity);
        boolean moreWheels = (carWheels > motorWheels);
        int totalWheels = (carWheels * 3);
        
        System.out.println("Vehicle 1:");
        System.out.println("Name: " + vehicle1Name);
        System.out.println("# of wheels: " + carWheels);
        System.out.println("Capacity: " + carCapacity + "\n");
        
        System.out.println("Vehicle 2:");
        System.out.println("Name: " + vehicle2Name);
        System.out.println("# of wheels: " + truckWheels);
        System.out.println("Capacity: " + truckCapacity + "\n");
        
        System.out.println("Vehicle 3:");
        System.out.println("Name: " + vehicle3Name);
        System.out.println("# of wheels: " + motorWheels);
        System.out.println("Capacity: " + motorCapacity + "\n");
        
        
        System.out.println("A truck has more capacity than a car: " + moreCapacity);
        System.out.println("A car has more wheels than a motorcycle: " + moreWheels);
        System.out.println("If there are 3 cars there are " + totalWheels + " wheels.");
    }
    
}
