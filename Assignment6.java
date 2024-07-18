
// Main Class File:    CSE11.java
// File:               Assignment6.java
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

import java.util.Arrays;

//This is the class where the main method, 
//along with all applicable unit tests, 
//are executed in CSE11 Spring quarter 2024.

/**
 * The Assignment5 class, simply runs the unit tests for Item, Drink, Snack, 
 * Refreshing, Energizing, Sweet, Savory, and Vending Machine.
 * Once all the unit tests are run, if they are all passed, 
 * the main method will return, "All unit tests passed". If not it will return
 * "ERROR: Failed test".
 * 
 * Bugs: None.
 *
 * @author Anush Salaniwal.
*/

public class Assignment6 {

    // This method tests the correctness of the Item, Drink, Snack, 
    // Refreshing, Energizing, Sweet, Savory, and Vending Machine.
    // This is also where they are all executed. This method takes has no
    // parameters and returns a boolean.

    public static boolean unitTests() {
        // SETUP
        VendingMachine vm = new VendingMachine();

        // Add items to a VendingMachine object
        Refreshing r1 = new Refreshing("Lemonade", 10.0, 
            100, 12.0, "Sour", 5);
        vm.addToItemList(r1); 
        Item[] itemsToAdd = { 
            new Energizing("Coffee", 8.0, 250, 6.0, "Sugary", 10),
            new Sweet("Twix", 3.0, 210, 1, "Chewy", 6),
            new Savory("Pretzels", 4.0, 130, 2, "Crunchy", 4),
            new Savory("Chips", 5.0, 130, 2, "Crunchy", 7),
            new Energizing("Coffee", 8.0, 250, 6.0, "Sugary", 10),
            new Energizing("Coffee", 8.0, 250, 6.0, "Sugary", 10),
            new Energizing("Coffee", 8.0, 250, 6.0, "Sugary", 10)
        };
        vm.addToItemList(itemsToAdd);

        // TEST CASE 1
        // We provide a test case for applyPriceSurge
        // Save all the original prices of the items
        double[] originalPrices = new double[vm.getItemList().size()];
        for (int i = 0; i < vm.getItemList().size(); i++) {
            originalPrices[i] = vm.getItemList().get(i).getPrice();
        }
        
        double increaseRate = 1.5;
        int increaseIndex = vm.applyPriceSurge(increaseRate);
        
        for (int i = 0; i < vm.getItemList().size(); i++) {
            Item item = vm.getItemList().get(i);
            if (i != increaseIndex || increaseRate < 1) {
                if (item.getPrice() != originalPrices[i]) {
                    System.out.println("applyPriceSurge 1" +
                        " - Item unexpectedly changed " +
                        "at index: " + i);
                    System.out.println(vm.getItemList());
                    return false;
                }
            } else {
                double actualPrice = originalPrices[i] * increaseRate;
                if (item.getPrice() != actualPrice) {
                    System.out.println("applyPriceSurge 1" +
                        " - Item does not have expected increased price");
                    System.out.println(item.getPrice());
                    System.out.println(actualPrice);
                    System.out.println(vm.getItemList());
                    return false;
                }
            }
        }

         for(Item i: vm.getItemList()){
            System.out.println(i.getType());
        }
        // TODO: write more test cases HERE!!!!!!
        // TEST CASE 2: compareSize
        if (VendingMachine.compareSize(r1, itemsToAdd[2]) != -1) {
            System.out.println("compareSize 1 - Test failed.");
            return false;
        }
        if (VendingMachine.compareSize(itemsToAdd[2], itemsToAdd[1]) != 1) {
            System.out.println("compareSize 2 - Test failed.");
            return false;
        }
        if (VendingMachine.compareSize(itemsToAdd[0], itemsToAdd[1]) != -1) {
            System.out.println("compareSize 3 - Test failed.");
            return false;
        }
        if (VendingMachine.compareSize(itemsToAdd[3], itemsToAdd[2]) != 0) {
            System.out.println("compareSize 4 - Test failed.");
            return false;
        }

         for(Item i: vm.getItemList()){
            System.out.println(i.getType());
        }
        // TEST CASE 3: getItemsByType
        Item[] sweets = vm.getItemsByType("Sweet");
        if (sweets.length != 8 || !sweets[0].getName().equals("Twix")) {
            System.out.println("getItemsByType 1 - Test failed.");
            return false;
        }
        
        Item[] refreshments = vm.getItemsByType("Refreshing");
        if (refreshments.length != 8 || 
        !refreshments[0].getName().equals("Lemonade")) {
            System.out.println("getItemsByType 2 - Test failed.");
            return false;
        }
        
        Item[] savories = vm.getItemsByType("Savory");
        if (savories.length != 8 || !savories[0].getName().equals("Pretzels")) {
            System.out.println("getItemsByType 3 - Test failed.");
            return false;
        }
        
        Item[] energizing = vm.getItemsByType("Energizing");
        if (energizing.length != 8 || !energizing[0].getName().equals("Coffee")) 
        {
            System.out.println("getItemsByType 4 - Test failed.");
            return false;
        }

         for(Item i: vm.getItemList()){
            System.out.println(i.getType());
        }
        // TEST CASE 4: hasItem and getItem
        if (!vm.hasItem("Lemonade")) {
            System.out.println("hasItem 1 - Test failed.");
            return false;
        }
        System.out.println(vm.getItemList().size() + "  1  ");
        if (vm.hasItem("Sprite")) {
            System.out.println("hasItem 2 - Test failed.");
            return false;
        }
        System.out.println(vm.getItemList().size() + "  2  ");
        Item item = vm.getItem("Coffee");
        if (item == null || !item.getName().equals("Coffee")) {
            System.out.println("getItem 1 - Test failed.");
            return false;
        }
        System.out.println(vm.getItemList().size() + "  3  ");
        item = vm.getItem("Sprite");
        if (item != null) {
            System.out.println("getItem 2 - Test failed.");
            return false;
        }
        return true;
    }

    // This method prints out all unit tests passed if all the unit test passed 
    // and prints Error: Failed test if not all the unit tests were passed.
    // This method takes in a String array and returns nothing.
    public static void main(String[] args) {
        // Perform unitTests 
        if(unitTests()) {
            System.out.println("All unit tests passed.\n");
        } else {
            System.out.println("Failed test.\n");
            return;
        }
    }
}