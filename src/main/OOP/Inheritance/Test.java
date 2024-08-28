package main.OOP.Inheritance;

public class Test {

    public static void main(String[] args) {
        // Create a Circle object
        Circle circle = new Circle("Red", 5.0);
        circle.displayInfo();  // Outputs details of the circle

        System.out.println();

        // Create a Triangle object
        Triangle triangle = new Triangle("Green", 3.0, 4.0);
        triangle.displayInfo();  // Outputs details of the triangle
    }

}
