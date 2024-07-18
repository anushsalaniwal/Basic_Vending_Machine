// Main Class File:    CSE11.java
// File:               Refreshing.java
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

/* This class includes the 2 constructers and 4 methods needed 
for Refreshing in CSE11 Spring quarter 2024. The constructors are listed
here: Refreshing and Refreshing.
The methods are listed here: getCoolnessLevel, getType, equals, toString.
*/
/**
 * The Refreshing class is a subclass of Drink. The Drink class tells Java 
 * to create the superclass/subclass relationship  
 * 
 * Bugs: None.
 *
 * @author Anush Salaniwal.
*/
public class Refreshing extends Drink {
    private int coolnessLevel;
    private static final String TYPE = "Refreshing";

    // Creates a new no arg constructer, Refreshing, with the no parameters.
    // This constructor must set the name, price, calories, and volume, and 
    // flavor in its superclass from the constructor parameters. Then it sets
    // the coolnessLevel members using the remaining constructor parameter.
    public Refreshing() {
        super("Unnamed Drink", 0.0, 0, 0.0, "");
        this.coolnessLevel = 0; 
    }

    // This constructor must set the name, price, calories, and volume, and 
    // flavor in its superclass from the constructor parameters. Then it sets
    // the coolnessLevel members using the remaining constructor parameter.
    public Refreshing(String name, double price, int calories, double volume, 
    String flavor, int coolnessLevel) {
        super(name, price, calories, volume, flavor);
        this.coolnessLevel = coolnessLevel;
    }

    // Simple getter method that returns the coolnessLevel instance variable.
    // This method takes in no parameters and returns an integer
    public int getCoolnessLevel() {
        return coolnessLevel;
    }

    // Simple getter method that returns the TYPE static variable.
    // This method overrides the getType() method in Drink.
    // This method takes in no parameters and returns a String
    @Override
    public String getType() {
        return TYPE;
    }

    // This method overrides the equals() method in Drink. This method checks
    // whether the current Refreshing object is considered equal to the input 
    // Object. This method must return true only when the current object has 
    // the same name, price, calories, volume, flavor, and coolnessLevel. 
    // Otherwise, it must return false.
    // This method takes in an object and returns a boolean
    @Override
    public boolean equals(Object object) {
        if (!super.equals(object)) return false;
        if (object == null || getClass() != object.getClass()) return false;

        Refreshing refreshing = (Refreshing) object;

        return coolnessLevel == refreshing.coolnessLevel;
    }

    // This method returns a String with the details for a Refreshing object.
    // This method takes in a parameter and returns a String
    @Override
    public String toString() {
        return "Drink (" + getName() + ") coolnessLevel: " + getCoolnessLevel();
    }
}
