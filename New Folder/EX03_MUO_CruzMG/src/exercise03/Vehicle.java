/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise03;

/**
 *
 * @author MILO GABRIEL A. CRUZ
 */
public class Vehicle {
    private String name;
    private int wheels;
    private double capacity;
    
    public Vehicle(String n, int w, double c){
        name = n;
        wheels = w;
        capacity = c;
    }
    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public double getCapacity() {
        return capacity;
    }
}
