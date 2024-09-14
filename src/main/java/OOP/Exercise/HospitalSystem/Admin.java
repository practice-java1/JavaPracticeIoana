package main.java.OOP.Exercise.HospitalSystem;

public class Admin extends Employee {

    public Admin(int id, String name, double salary) {
        super(id, name, salary);
    }

    public void manageSchedule() {
        System.out.println("Admin: " + getName() + " is managing meetings.");
    }

    @Override
    public void performDuties() {
        System.out.println("Admin: " + getName() + " is managing the hospital.");
    }
}
