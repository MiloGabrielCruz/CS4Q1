/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise02;

/**
 *
 * @author MILO GABRIEL A. CRUZ
 */
public class Singer {
    static String name;
    static Song favoriteSong;
    static int noOfPerformances = 10;
    static double earnings = 13025.68;
    static int people;
    
    public Singer(String n){
        name = n;
        favoriteSong = new Song("Medisina", 5.12);
        System.out.println("Artist's name: " + Singer.name);
        System.out.println("Artist's # of performances: " + Singer.noOfPerformances);
        System.out.println("Artist's earnings: " + Singer.earnings);
        System.out.println("Artist's favorite song: " + favoriteSong.name + ", " + favoriteSong.length + "\n");
    }
    
    public static void performForAudience(int p){
        people = p;
        noOfPerformances++;
        earnings += people*500;
        System.out.println("Artist's # of performances: " + noOfPerformances);
        System.out.println("Artist's earnings: " + earnings + "\n");
    }
    
    public static void changeFavSong(String n, double l){
        favoriteSong = new Song(n, l);
        System.out.println("Artist's new favorite song: " + favoriteSong.name + ", " + favoriteSong.length);
    }
}
