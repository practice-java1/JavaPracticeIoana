package main.java.OOP.Exercise.VehicleManagementSystem;

public class Truck extends Vehicle {

    public Truck(String category, String name, String color) {
        super(category, name, color);
    }

    @Override
    public void emitSound() {
        System.out.println("The car goes vroom!");
    }
}
