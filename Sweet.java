// Main Class File:    CSE11.java
// File:               Sweet.java
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
The methods are listed here: getSweetnessLevel, getType, equals, toString.
*/
/**
 * The Sweet class is a subclass of Snack. The Snack class tells Java 
 * to create the superclass/subclass relationship.  
 * 
 * Bugs: None.
 *
 * @author Anush Salaniwal.
*/
public class Sweet extends Snack {
    private int sweetnessLevel;
    private static final String TYPE = "Sweet";

    // Creates a new no arg constructer, Sweet, with the no parameters.
    // This constructor must set the name, price, calories, servingSize, and 
    // texture in its superclass  from the constructor parameters. Then it sets 
    // the sweetnessLevel members using the remaining constructor parameter.
    public Sweet() {
        super("Unnamed Drink", 0.0, 0, 0, "");
        this.sweetnessLevel = 0; 
    }

    // This constructor must set the name, price, calories, servingSize, and 
    // texture in its superclass from the constructor parameters. Then it sets 
    // the sweetnessLevel members using the remaining constructor parameter.
    public Sweet(String name, double price, int calories, int servingSize, 
    String texture, int sweetnessLevel) {
        super(name, price, calories, servingSize, texture);
        this.sweetnessLevel = sweetnessLevel;
    }

    // Simple getter method that returns the sweetnessLevel instance variable
    // This method takes in no parameters and returns an integer
    @Override
    public int getSweetnessLevel() {
        return this.sweetnessLevel;
    }

    // Simple getter method that returns the TYPE static variable.
    // This method overrides the getType() method in Snack
    // This method takes in no parameters and returns a String
    @Override
    public String getType() {
        return TYPE;
    }

    // This method overrides the equals() method in Snack. This method checks 
    // whether the current Refreshing object is considered equal to the input 
    // Object. This method must return true only when the current object has 
    // the same name, price, calories, servingSize, texture, and sweetnessLevel.
    // Otherwise, it must return false.
    // This method takes in an Object and returns a boolean
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Sweet)) return false;
        if (!super.equals(object)) return false;
        Sweet sweet = (Sweet) object;
        return sweetnessLevel == sweet.sweetnessLevel;
    }

    // This method returns a String with the details for a Sweet object.
    // This method takes in a parameter and returns a String
    @Override
    public String toString() {
        return "Sweet (" + getName() + ") servingSize: " + getServingSize() + 
        "; texture: " + getTexture() + "; sweetnessLevel: " + 
        getSweetnessLevel();
    }
}
