/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise03;

/**
 *
 * @author MILO GABRIEL A. CRUZ
 */
public class Singer {
    private String name;
    private Song favoriteSong;
    private int noOfPerformances;
    private double earnings;
    private static int totalPerformances;
    
    public Singer(String name, int noOfPerformances, double earnings, String favSong, double songLength){
        this.name = name;
        this.noOfPerformances = noOfPerformances;
        this.earnings = earnings;
        totalPerformances += noOfPerformances;
        favoriteSong = new Song(favSong, songLength);
        System.out.println("Artist's name: " + this.name);
        System.out.println("Artist's # of performances: " + this.noOfPerformances);
        System.out.println("Artist's earnings: " + this.earnings);
        System.out.println("Artist's favorite song: " + favoriteSong.getName() + ", " + favoriteSong.getLength() + "\n");
    }
    
    public void performForAudience(int p){
        int people = p;
        this.noOfPerformances++;
        this.earnings += people*500;
        System.out.println(this.getName() + "'s # of performances: " + this.getNoOfPerformances());
        System.out.println("Artist's earnings: " + this.getEarnings());
    }
    
    public static void performForAudience(int p, int o){
        int people1 = p;
        int people2 = o;
        totalPerformances += 2;
        int earningsCombined = (people1*500) + (people2*500);
        System.out.println("Their total earnings are " + earningsCombined + " with " + (earningsCombined/2) + " each" );
        System.out.println("The total number of performances is " + getTotalPerformances());
    }
    
    public void changeFavSong(String n, double l){
        favoriteSong = new Song(n, l);
        System.out.println("Artist's new favorite song: " + getFavoriteSong().getName() + ", " + getFavoriteSong().getLength() + "\n");
    }

    public int getNoOfPerformances() {
        return noOfPerformances;
    }

    public String getName() {
        return name;
    }

    public Song getFavoriteSong() {
        return favoriteSong;
    }

    public double getEarnings() {
        return earnings;
    }

    public static int getTotalPerformances() {
        return totalPerformances;
    }
    
    
}
