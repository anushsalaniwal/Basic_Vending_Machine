# Vending Machine System

## Overview
This project is a Vending Machine System that categorizes and dispenses different types of items including drinks and snacks. The system uses object-oriented programming principles such as inheritance and polymorphism to manage various item types and their properties.

## Features
- **Item Classification**: Base class `Item` with subclasses for specific types of items.
- **Drinks**: Includes refreshing and energizing drinks with properties like volume and flavor.
- **Snacks**: Includes sweet and savory snacks with properties like serving size and texture.
- **Vending Machine Operations**: Manages the dispensing of items.

## Classes and Structure
### Item
- Base class for all items.
- Properties: `name`, `price`, `calories`.
- Methods: Getters and setters for all properties, `equals()` method to compare items.

### Drink
- Subclass of `Item`.
- Properties: `volume`, `flavor`.
- Methods: Getters for `volume` and `flavor`, overrides for `getHighLevelType()` and `getType()`, and `equals()` method.

### Snack
- Subclass of `Item`.
- Properties: `servingSize`, `texture`.
- Methods: Getters for `servingSize` and `texture`, overrides for `getHighLevelType()` and `getType()`, and `equals()` method.

### Refreshing
- Subclass of `Drink`.
- Properties: `coolnessLevel`.
- Methods: Getter for `coolnessLevel`, override for `getType()`, and `equals()` method.

### Energizing
- Subclass of `Drink`.
- Properties: `boostLevel`.
- Methods: Getter for `boostLevel`, override for `getType()`, and `equals()` method.

### Sweet
- Subclass of `Snack`.
- Properties: `sweetnessLevel`.
- Methods: Getter for `sweetnessLevel`, override for `getType()`, and `equals()` method.

### Savory
- Subclass of `Snack`.
- Properties: `savorinessLevel`.
- Methods: Getter for `savorinessLevel`, override for `getType()`, and `equals()` method.

### VendingMachine
- Manages the inventory and operations of the vending machine.
- Methods to add, remove, and dispense items.

## Usage
To use the vending machine system, compile and run the `VendingMachine` class. This will allow you to interact with the vending machine, add items to the inventory, and dispense items.

## Example
```java
public class VendingMachineExample {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        
        Drink drink1 = new Refreshing("Coke", 1.50, 150, 350, "Cola", 5);
        Snack snack1 = new Sweet("Chocolate", 1.00, 250, 1, "Smooth", 10);
        
        vm.addItem(drink1);
        vm.addItem(snack1);
        
        vm.dispenseItem("Coke");
        vm.dispenseItem("Chocolate");
    }
}
