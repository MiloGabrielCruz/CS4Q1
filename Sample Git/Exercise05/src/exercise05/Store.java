package exercise05;

import java.util.ArrayList;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
    this.name = name;           // Initialize name to parameter and earnings to zero
    itemList = new ArrayList(); // Initialize itemList as a new ArrayList
    storeList.add(this);      // add 'this' store to storeList
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
    if(index < itemList.size()){      // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
        earnings += itemList.get(index).getCost();        // get Item at index from itemList and add its cost to earnings
        System.out.println("Item " + itemList.get(index).getName() + " was sold"); // print statement indicating the sale
    }
    else {
        System.out.println("There are only " + itemList.size() + " items in the store.");
    }
  }
  public void sellItem(String name){
    boolean done = false;
    for(Item n : itemList){         // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
        if(name == n.getName()){
            done = true;
            earnings += n.getCost();    // get Item from itemList and add its cost to earnings
            System.out.println("Item " + n.getName() + " was sold");    // print statement indicating the sale       
        }
    }
    
    if(!done){
        System.out.println("The store does not sell the item you are looking for.");
    }
  }
  
  public void sellItem(Item i){
    if(itemList.contains(i)){       // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
        earnings += i.getCost();        // get Item i from itemList and add its cost to earnings
        System.out.println("Item " + i.getName() + " was sold");    // print statement indicating the sale
    }
    else {
        System.out.println("The store does not sell the item you are looking for.");
    }
  }
  public void addItem(Item i){
    itemList.add(i);        // add Item i to store's itemList
  }
  public void filterType(String type){
    for(Item x : itemList) {    // loop over itemList and print all items with the specified type
        if(x.getType() == type){
            System.out.println(x.getName());
        }
    }
  }
  public void filterCheap(double maxCost){
    for(Item y : itemList){    // loop over itemList and print all items with a cost lower than or equal to the specified value  
        if(y.getCost() <= maxCost){
            System.out.println(y.getName());
        }
    } 
  }
  public void filterExpensive(double minCost){
    for(Item z : itemList){     // loop over itemList and print all items with a cost higher than or equal to the specified value   
        if(z.getCost() >= minCost){
            System.out.println(z.getName());
        }
  }
  }
  public static void printStats(){
    storeList.forEach((z) -> System.out.println("Store name: " + z.getName() + " Store earnings: " + z.getEarnings()));     // loop over storeList and print the name and the earnings'Store.java'
  }
}
