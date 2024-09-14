package main.java.OOP.Exercise.VehicleManagementSystem;

public class Car extends Vehicle{
    private String engineCapacity;

    public Car(String category, String name, String color, String engineCapacity) {
        super(category, name, color);
        this.engineCapacity = engineCapacity;
    }


    public void emitSound() {
        System.out.println("The car goes vroom!");
    }
}
