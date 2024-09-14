package main.java.OOP.Exercise.HospitalSystem;

public class Nurse extends Employee {

    public Nurse(int id, String name, double salary) {
        super(id, name, salary);
    }


    public void checkVitals() {
        System.out.println("Nurse " + getName() + " is checking the patients vitals.");
    }

    @Override
    public void performDuties() {

    }
}
