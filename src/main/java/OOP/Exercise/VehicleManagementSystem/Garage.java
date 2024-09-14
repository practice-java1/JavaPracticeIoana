package main.java.OOP.Exercise.VehicleManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Garage {

    List <Vehicle> vehicleList = new ArrayList<>();

    public void startVehicles(){
        for (Vehicle vehicle : vehicleList){
            vehicle.startVehicle();
        }
    }


}
