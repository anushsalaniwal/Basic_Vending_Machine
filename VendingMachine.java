// Main Class File:    CSE11.java
// File:               VendingMachine.java
// Quarter:            CSE 11 Spring 2024
//
// Author:             Anush Salaniwal.
// Email:              ansalaniwal@ucsd.edu
// Instructor's Name:  Professor Ochoa.
//
//////////////////// STUDENTS WHO GET HELP FROM OTHER THAN THEIR PARTNER //////
//                   fully acknowledge and credit all sources of help,
//                   other than Instructors and TAs.
//
// Persons:          None.
//
// Online sources:   None.

/* This class includes the 1 constructers and 7 methods needed 
for Autograder in CSE11 Spring quarter 2024. The constructors are listed
here: VendingMachine.
The methods are listed here: addToItemList, addToItemList, hasItem, getItem,
computeSize, compareSize, applyPriceSurge, getItemsByType.
*/
/**
 * The VendingMachine class contains various unique methods to help you 
 * keep track of all the Items in the vending machine 
 * 
 * Bugs: None.
 *
 * @author Anush Salaniwal.
*/
import java.util.ArrayList;

public class VendingMachine {
    // An ArrayList containing Item objects.
    private ArrayList<Item> itemList;

    /*
     * Creates a new no arg constructer, VendingMachine, with the no parameters.
     * The no-arg constructor initializes itemList to an empty ArrayList of Item
     * elements.
     */
    public VendingMachine() {
        this.itemList = new ArrayList<>();
    }

    // Adds a single Item to the itemList. This method takes in an Item and
    // returns nothing.
    public void addToItemList(Item item) {
        this.itemList.add(item);
    }

    // Adds multiple Items to the itemList. This method takes in an array of 
    // Items and returns nothing.
    public void addToItemList(Item[] items) {
        for (Item item : items) {
            this.itemList.add(item);
        }
    }

    // Checks if an Item is available in the vending machine based on its name
    // This method takes in a String and returns a boolean.
    public boolean hasItem(String itemName) {
        for (Item item : itemList) {
            if (item.getName().equals(itemName)) {
                return true;
            }
        }
        return false;
    }

    // Retrieves an Item from the vending machine based on its name and removes 
    // it from the itemList. This method takes in a String and returns a Item.
    public Item getItem(String itemName) {
        for (int i = 0; i < itemList.size(); i++) {
            if (itemList.get(i).getName().equals(itemName)) {
                return itemList.remove(i);
            }
        }
        return null;
    }

    // Helper method to compute the size of an item in ounces. This method takes 
    // in an Item and returns a double.
    private static double computeSize(Item item) {
        if (item instanceof Drink) {
            return ((Drink) item).getVolume();
        } else if (item instanceof Snack) {
            return ((Snack) item).getServingSize() * 12.0;
        }
        return 0.0;
    }

    // Compares the sizes of two items. This method takes in two Items and
    // returns an integer.
    public static int compareSize(Item item1, Item item2) {
        double size1 = computeSize(item1);
        double size2 = computeSize(item2);

        if(size1 < size2){
            return -1;
        }
        else if(size1 == size2){
            return 0;
        }
        return 1;
    }

    // Applies a price surge to a random item in the itemList. This method takes
    // in a double and returns an integer.
    public int applyPriceSurge(double increaseRate) {
        if (increaseRate < 1) return -1; 

        int index = (int) (Math.random() * itemList.size());
        Item selectedItem = itemList.get(index);
        selectedItem.setPrice(selectedItem.getPrice() * increaseRate);

        return index;
    }

    // Retrieves an array of items based on their type. This method takes in a 
    // String and returns an Item array.
    public Item[] getItemsByType(String type) {
    ArrayList<Item> filteredItems = new ArrayList<>();
    int x = itemList.size();

    for (Item item : itemList) {
        if (type.equals("Untyped Drink") && item instanceof Drink && 
            !(item instanceof Refreshing || item instanceof Energizing)) {
            filteredItems.add(item);
        } else if (type.equals(item.getType())) {
            filteredItems.add(item);
        }
    }

    return filteredItems.toArray(new Item[x]);
}



    // Helper method for testing to get the itemList. It has no parameters and
    // returns the ArrayList.
    public ArrayList<Item> getItemList() {
        return this.itemList;
    }
}
