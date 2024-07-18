// Main Class File:    CSE11.java
// File:               Item.java
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

/* This class includes the 2 constructers and 16 methods needed 
for Item in CSE11 Spring quarter 2024. The constructors are listed
here: Item and Item.
The methods are listed here: getName, getPrice, getCalories, getType, 
getHighLevelType, setPrice, equals, getVolume, getFlavor, getServingSize, 
getTexture, getCoolnessLevel, getBoostLevel, getSweetnessLevel, 
getSavorinessLevel, toString.
*/
/**
 * The Item class defines the default behavior of methods 
 * of all the subclasses in this assignment 
 * 
 * Bugs: None.
 *
 * @author Anush Salaniwal.
*/
public class Item {
    private String name;
    private double price;
    private int calories;
    private static final String HIGH_LEVEL_TYPE = "Untyped High Level Item";
    private static final String TYPE = "Untyped Item";

    // Creates a new no arg constructer, Item, with the no parameters.
    // This constructor sets the corresponding instance variables of the object 
    // to what the caller of the constructor passed in as arguments.
    public Item() {
        this.name = "Unnamed Item";
        this.price = 0.0;
        this.calories = 0;
    }

    // This constructor sets the corresponding instance variables of the object 
    // to what the caller of the constructor passed in as arguments.
    public Item(String name, double price, int calories) {
        this.name = name;
        this.price = price;
        this.calories = calories;
    }

    // Simple getter method that returns the name instance variable.
    // This method takes in no paramets and returns a String
    public String getName() {
        return name;
    }

    // Simple getter method that returns the price instance variable.
    // This method takes in no parameters and returns a double
    public double getPrice() {
        return price;
    }

    // Simple getter method that returns the calories instance variable.
    // This method takes in no paramets and returns an integer
    public int getCalories() {
        return calories;
    }

    // Simple getter method that returns the TYPE static variable.
    // This method takes in no paramets and returns a String
    public String getType() {
        return TYPE;
    }

    // Simple getter method that returns the HIGH_LEVEL_TYPE static variable.
    // This method takes in no paramets and returns a String 
    public String getHighLevelType() {
        return HIGH_LEVEL_TYPE;
    }

    // Simple setter method that sets the price instance variable.
    // This method takes a double and returns nothing
    public void setPrice(double price) {
        this.price = price;
    }

    // This method must return true only when the current object and the input 
    // item have the same name, price, and calories. Otherwise, it must return 
    // false. By implementing the equals method, it allows the user of the class
    // to compare Item objects on deep equality. Rather than just checking for 
    // equality of reference, it will compare equality by checking the contents 
    // of the object instead.
    // This method takes in an object and returns a boolean
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Item item = (Item) object;

        if (Double.compare(item.price, price) != 0) return false;
        if (calories != item.calories) return false;
        return name != null ? name.equals(item.name) : item.name == null;
    }

    // The rest of getter methods don't have to be implemented.
    // They will be overridden by subclasses!
    
    // This getter method will be overriden in the future.
    // This method takes in no parameters and returns a double
    public double getVolume() {
        return 0;
    }

    // This getter method will be overriden in the future.
    // This method takes in no parameters and returns a String
    public String getFlavor() {
        return "";
    }

    // This getter method will be overriden in the future.
    // This method takes in no parameters and returns an integer
    public int getServingSize() {
        return 0;
    }

    // This getter method will be overriden in the future.
    // This method takes in no parameters and returns a String
    public String getTexture() {
        return "";
    }

    // This getter method will be overriden in the future.
    // This method takes in no parameters and returns an integer
    public int getCoolnessLevel() {
        return 0;
    }

    // This getter method will be overriden in the future.
    // This method takes in no parameters and returns an integer
    public int getBoostLevel() {
        return 0;
    }

    // This getter method will be overriden in the future.
    // This method takes in no parameters and returns an integer
    public int getSweetnessLevel() {
        return 0;
    }

    // This getter method will be overriden in the future.
    // This method takes in no parameters and returns an integer
    public int getSavorinessLevel() {
        return 0;
    }

    // This method returns a String with the details for a Item object.
    // This method takes in a parameter and returns a String
    @Override
    public String toString() {
        return "Item (" + getName() + ") type: " + 
            getType() + "; price: " + getPrice() + 
            "; calories: " + getCalories();
    }
}
