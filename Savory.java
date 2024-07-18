// Main Class File:    CSE11.java
// File:               Savory.java
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
for Sweet in CSE11 Spring quarter 2024. The constructors are listed
here: Sweet and Sweet.
The methods are listed here: getSavorinessLevel, getType, equals, toString.
*/
/**
 * The Savory class is a subclass of Snack. The Savory class tells Java 
 * to create the superclass/subclass relationship.  
 * 
 * Bugs: None.
 *
 * @author Anush Salaniwal.
*/
public class Savory extends Snack {
    private int savorinessLevel;
    private static final String TYPE = "Savory";

     /*
     * Creates a new no arg constructer, Savory, with the no parameters.
     * The no-arg constructor sets the name, price, calories, servingSize, and 
     * texture in its superclass from the constructor parameters. Then it sets
     * the savorinessLevel members using the remaining constructor parameter.
     */
    public Savory() {
        super("Unnamed Drink", 0.0, 0, 0, "");
        this.savorinessLevel = 0; 
    }

    // This constructor sets the name, price, calories, servingSize, and 
    // texture in its superclass from the constructor parameters. Then it sets
    // the savorinessLevel members using the remaining constructor parameter.
    public Savory(String name, double price, int calories, int servingSize, 
    String texture, int savorinessLevel) {
        super(name, price, calories, servingSize, texture);
        this.savorinessLevel = savorinessLevel;
    }

    // Simple getter method that returns the savorinessLevel instance variable. 
    // This method takes in no parameters and returns an integer.
    @Override
    public int getSavorinessLevel() {
        return this.savorinessLevel;
    }

    // Simple getter method that returns the TYPE static variable.
    // This method overrides the getType() method in Snack.
    // This method takes in no parameters and returns a String.
    @Override
    public String getType() {
        return TYPE;
    }

    // This method overrides the equals() method in Snack. This method checks
    // whether the current Refreshing object is considered equal to the input 
    // Object. This method must return true only when the current object has the
    // same name, price, calories, servingSize, texture and savorinessLevel. 
    // Otherwise, it must return false. This method takes in an Object and 
    // returns a boolean
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Savory)) return false;
        if (!super.equals(object)) return false;
        Savory savory = (Savory) object;
        return savorinessLevel == savory.savorinessLevel;
    }

    // This method returns a String with the details for a Savory object.
    // This method takes in a parameter and returns a String
    @Override
    public String toString() {
        return "Savory (" + getName() + ") servingSize: " + getServingSize() + 
        "; texture: " + getTexture() + "; savorinessLevel: " + 
        getSavorinessLevel();
    }
}
