// Main Class File:    CSE11.java
// File:               Snack.java
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
for Snack in CSE11 Spring quarter 2024. The constructors are listed
here: Snack and Snack.
The methods are listed here: getServingSize, getTexture, getType, 
getHighLevelType, equals, toString.
*/
/**
 * The Snack class is a subclass of Item. The Snack class tells Java 
 * to create the superclass/subclass relationship 
 * 
 * Bugs: None.
 *
 * @author Anush Salaniwal.
*/
public class Snack extends Item {
    private int servingSize;
    private String texture;
    private static final String HIGH_LEVEL_TYPE = "Snack";
    private static final String TYPE = "Untyped Snack";

    // Creates a new no arg constructer, Snack, with the no parameters.
    // This constructor must set the name, price, and calories in its 
    // superclass from the constructor parameters. Then, set the servingSize 
    // and texture members using the remaining constructor parameters.
    public Snack() {
        super("Unnamed Nonconsumable", 0.0, 0);
        this.servingSize = 0;
        this.texture = "";
    }

    // This constructor must set the name, price, and calories in its 
    // superclass from the constructor parameters. Then, set the servingSize 
    // and texture members using the remaining constructor parameters.
    public Snack(String name, double price, int calories, int servingSize, String texture) {
        super(name, price, calories);
        this.servingSize = servingSize;
        this.texture = texture;
    }

    // Simple getter method that returns the servingSize instance variable.
    // This method takes in no parameters and returns a Integer
    public int getServingSize() {
        return servingSize;
    }

    // Simple getter method that returns the texture instance variable.
    // This method takes in no parameters and returns a string
    public String getTexture() {
        return texture;
    }

    // Simple getter method that returns the TYPE static variable.
    // This method overrides the getType() method in Item.
    // This method takes in no parameters and returns a string
    @Override
    public String getType() {
        return TYPE;
    }

    // Simple getter method that returns the HIGH_LEVEL_TYPE static variable.
    // This method overrides the getHighLevelType() method in Item.
    // This method takes in no parameters and returns a string
    @Override
    public String getHighLevelType() {
        return HIGH_LEVEL_TYPE;
    }

    // This method overrides the equals() method in Item. This method checks
    // whether the current Snack object is considered equal to the input Object.
    // This method must return true only when the current object has the same 
    // name, price, calories, servingSize, and texture. 
    // Otherwise, it must return false.
    // This method takes in an object and returns a boolean
    @Override
    public boolean equals(Object object) {
        if (!super.equals(object)) return false;
        if (object == null || getClass() != object.getClass()) return false;

        Snack snack = (Snack) object;

        if (servingSize != snack.servingSize) return false;
        return texture != null ? texture.equals(snack.texture) : snack.texture == null;
    }

    // This method returns a String with the details for a Snack object.
    // This method takes in a parameter and returns a String
    @Override
    public String toString() {
        return "Snack (" + getName() + ") servingSize: " + getServingSize() + "; texture: " + getTexture();
    }
}


