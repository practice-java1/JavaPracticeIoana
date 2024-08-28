package main.OOP.Inheritance;

// subclass (child)

public class Circle extends Shape {
    // Specific property for Circle
    // color attribute, displayInfo() method
    private double radius;

    // Constructor to initialize color and radius
    public Circle(String color, double radius) {
        super(color);  // Call the constructor of the base class (Shape)
        this.radius = radius;
    }

    // Override method to calculate the area of a circle
    public double calculateCircleArea() {
        return Math.PI * radius * radius;
    }

    // Override method to display circle information
    @Override
    public void displayInfo() {
        super.displayInfo();  // Call the displayInfo method of the base class // add the info related to the color
        System.out.println("Circle radius: " + radius);
        System.out.println("Circle area: " + calculateCircleArea());
    }
}