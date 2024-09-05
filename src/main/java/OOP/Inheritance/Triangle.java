package main.java.OOP.Inheritance;

// subclass (child)

public class Triangle extends Shape {
    // Specific properties for Triangle
    // add the color attribute via parent class
    private double base;
    private double height;

    // Constructor to initialize color, base, and height
    public Triangle(String color, double base, double height) {
        super(color);  // Call the constructor of the base class (Shape)
        this.base = base;
        this.height = height;
    }

    // Override method to calculate the area of a triangle
    public double calculateTriangleArea() {
        return 0.5 * base * height;
    }

    // Override method to display triangle information
    @Override
    public void displayInfo() { // Shape color is: = "red", 5, 7, 35
        super.displayInfo();  // Call the displayInfo method of the base class
        System.out.println("Triangle base: " + base);
        System.out.println("Triangle height: " + height);
        System.out.println("Triangle area: " + calculateTriangleArea());
    }
}
