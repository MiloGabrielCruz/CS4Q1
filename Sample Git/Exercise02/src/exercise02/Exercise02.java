/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise02;

/**
 *
 * @author MILO GABRIEL A. CRUZ
 */
public class Exercise02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehicle car = new Vehicle("Car", 4, 5);
        System.out.println("Vehicle 1:");
        System.out.println("Name: " + car.name);
        System.out.println("# of wheels: " + car.wheels);
        System.out.println("Capacity: " + car.capacity + "\n");
        
        Vehicle truck = new Vehicle("Truck", 10, 3);
        System.out.println("Vehicle 2:");
        System.out.println("Name: " + truck.name);
        System.out.println("# of wheels: " + truck.wheels);
        System.out.println("Capacity: " + truck.capacity + "\n");
        
        Vehicle motorcycle = new Vehicle("Motorcycle", 2, 1);
        System.out.println("Vehicle 3:");
        System.out.println("Name: " + motorcycle.name);
        System.out.println("# of wheels: " + motorcycle.wheels);
        System.out.println("Capacity: " + motorcycle.capacity + "\n\n");
          
        Song Song1 = new Song("Duwag", 3.50);
        Song Song2 = new Song("Duda", 3.15);
        
        Singer Artist = new Singer("Zild");
                
        System.out.println("<---Perform for 12 people---> \n");
        
        Singer.performForAudience(12); 
        Singer.changeFavSong("Isang Anghel", 3.15);
    }
   
    
}
