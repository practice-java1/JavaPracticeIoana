package main.java.OOP.Exercise.HospitalSystem;

public class Doctor extends Employee{

    private String specialization;

    public Doctor(int id, String name, double salary, String specialization) {
        super(id, name, salary);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void prescribeMedication(){
        System.out.println("Doctor " + getName() + "is prescribing medication.");

    }

    @Override
    public void performDuties() {
        System.out.println("Doctor " + getName() + "is diagnosing patients.");
        System.out.println("Specialization: " + specialization);
    }
}
