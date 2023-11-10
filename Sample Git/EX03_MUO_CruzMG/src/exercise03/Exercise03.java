/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise03;

/**
 *
 * @author MILO GABRIEL A. CRUZ
 */
public class Exercise03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehicle car = new Vehicle("Car", 4, 5);
        System.out.println("Vehicle 1:");
        System.out.println("Name: " + car.getName());
        System.out.println("# of wheels: " + car.getWheels());
        System.out.println("Capacity: " + car.getCapacity() + "\n");
        
        Vehicle truck = new Vehicle("Truck", 10, 3);
        System.out.println("Vehicle 2:");
        System.out.println("Name: " + truck.getName());
        System.out.println("# of wheels: " + truck.getWheels());
        System.out.println("Capacity: " + truck.getCapacity() + "\n");
        
        Vehicle motorcycle = new Vehicle("Motorcycle", 2, 1);
        System.out.println("Vehicle 3:");
        System.out.println("Name: " + motorcycle.getName());
        System.out.println("# of wheels: " + motorcycle.getWheels());
        System.out.println("Capacity: " + motorcycle.getCapacity() + "\n\n");
          
        Song Song1 = new Song("Duwag", 3.50);
        Song Song2 = new Song("Duda", 3.15);
        
        Singer Artist1 = new Singer("Zild", 10, 13025.68, "Medisina", 5.12);
        Singer Artist2 = new Singer("Lola Amour", 11, 17084.16, "Maybe Maybe", 3.54);
                
        System.out.println("<---" + Artist1.getName() + " Perform for 12 people---> \n");
        
        Artist1.performForAudience(12); 
        Artist1.changeFavSong("Isang Anghel", 3.15);
        
        System.out.println(("<---" + Artist2.getName() + " Perform for 13 people---> \n"));
        
        Artist2.performForAudience(13); 
        Artist2.changeFavSong("Fallen", 4.24);
        
        Singer.performForAudience(12, 13);
        

    }
   
    
}
