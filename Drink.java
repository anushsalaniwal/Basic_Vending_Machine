// Main Class File:    CSE11.java
// File:               Drink.java
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

/* This class includes the 2 constructers and 6 methods needed 
for Drink in CSE11 Spring quarter 2024. The constructors are listed
here: Drink and Drink.
The methods are listed here: getVolume, getFlavor, getType, 
getHighLevelType, equals, toString.
*/
/**
 * The Drink class is a subclass of Item. The Drink class tells Java 
 * to create the superclass/subclass relationship 
 * 
 * Bugs: None.
 *
 * @author Anush Salaniwal.
*/
public class Drink extends Item {
    private double volume;
    private String flavor;
    private static final String HIGH_LEVEL_TYPE = "Drink";
    private static final String TYPE = "Untyped Drink";

    // Creates a new no arg constructer, Drink, with the no parameters.
    // This constructor must set the name, price, and calories in its 
    // superclass from the constructor parameters. Then it set the volume and 
    // flavor members using the remaining constructor parameters.
    public Drink() {
        super("Unnamed Consumable", 0.0, 0);
        this.volume = 0;
        this.flavor = "";
    }

    // This constructor must set the name, price, and calories in its 
    // superclass from the constructor parameters. Then it set the volume and 
    // flavor members using the remaining constructor parameters.
    public Drink(String name, double price, int calories, double volume, String flavor) {
        super(name, price, calories);
        this.volume = volume;
        this.flavor = flavor;
    }

    // Simple getter method that returns the volume instance variable.
    // This method takes in no parameters and returns a double
    public double getVolume() {
        return volume;
    }

    // Simple getter method that returns the flavor instance variable.
    // This method takes in no parameters and returns a String
    public String getFlavor() {
        return flavor;
    }

    // Simple getter method that returns the TYPE static variable.
    // This method overrides the getType() method in Item.
    // This method takes in no parameters and returns a String
    @Override
    public String getType() {
        return TYPE;
    }

    // Simple getter method that returns the HIGH_LEVEL_TYPE static variable.
    // This method overrides the getHighLevelType() method in Item.
    // This method takes in no parameters and returns a String
    @Override
    public String getHighLevelType() {
        return HIGH_LEVEL_TYPE;
    }

    // This method overrides the equals() method in Item. This method checks 
    // whether the current Drink object is considered equal to the input Object.
    // This method must return true only when the current object has the same 
    // name, price, calories, volume, and flavor. 
    // Otherwise, it must return false.
    // This method takes in an object and returns a boolean.
    @Override
    public boolean equals(Object object) {
        if (!super.equals(object)) return false;
        if (object == null || getClass() != object.getClass()) return false;

        Drink drink = (Drink) object;

        if (Double.compare(drink.volume, volume) != 0) return false;
        return flavor != null ? flavor.equals(drink.flavor) : drink.flavor == null;
    }

    // This method returns a String with the details for a Drink object.
    // This method takes in a parameter and returns a String
    @Override
    public String toString() {
        return "Drink (" + getName() + ") volume: " + getVolume() + "; flavor: " + getFlavor();
    }
}


