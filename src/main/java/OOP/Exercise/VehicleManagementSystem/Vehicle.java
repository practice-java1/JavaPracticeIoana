package main.java.OOP.Exercise.VehicleManagementSystem;

public abstract class Vehicle {

    private String category;
    String name;
    String color;

    public Vehicle(String category, String name, String color) {
        this.category = category;
        this.name = name;
        this.color = color;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "category='" + category + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';

    }

    public abstract void emitSound();

    public void startVehicle(){
        System.out.println("Start " + name);
        emitSound();
    }
}
