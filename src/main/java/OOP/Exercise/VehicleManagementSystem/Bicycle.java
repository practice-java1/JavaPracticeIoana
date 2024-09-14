package main.java.OOP.Exercise.VehicleManagementSystem;

public class Bicycle extends Vehicle {

    public Bicycle(String category, String name, String color) {
        super(category, name, color);
    }


    @Override
    public void emitSound() {
        System.out.println("The bicycle goes ding ding!");
    }
}

