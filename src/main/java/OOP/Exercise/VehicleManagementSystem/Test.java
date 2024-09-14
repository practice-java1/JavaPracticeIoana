package main.java.OOP.Exercise.VehicleManagementSystem;

public class Test {

    public static void main(String[] args) {

        Vehicle car = new Car("Car", "Mustang", "red", "V8");
        Vehicle bicycle = new Bicycle("Bicycle", "Marin Bikes", "blue");
        Vehicle truck = new Truck("Truck", "Volvo", "burgundy");

        car.emitSound();
        bicycle.emitSound();
        truck.emitSound();

        Garage garage = new Garage();

        garage.vehicleList.add(car);
        garage.vehicleList.add(bicycle);
        garage.vehicleList.add(truck);

        garage.startVehicles();


    }

}
