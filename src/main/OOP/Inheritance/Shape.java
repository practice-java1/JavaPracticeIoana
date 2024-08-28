package main.OOP.Inheritance;

// Base class ---> superclass (parent)

public class Shape {
    // Common property for all shapes
    private String color;

    // Constructor to initialize color
    public Shape(String color) {
        this.color = color;
    }

    // Method to calculate the area (to be overridden by subclasses)
    public double calculateArea() {
        return 0;
    }

    // Method to display shape information
    public void displayInfo() {
        System.out.println("Shape color: " + color);
    }

    //
}