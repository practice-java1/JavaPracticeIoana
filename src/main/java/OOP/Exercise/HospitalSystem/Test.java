package main.java.OOP.Exercise.HospitalSystem;

public class Test {
    public static void main(String[] args) {

        Employee doctor = new Doctor(1, "Marin Ionescu", 7000.00, "Cardiology");
        Employee nurse = new Nurse(2, "Simona Nae", 5000.00);
        Employee admin = new Admin(3, "Marina Dima", 4000.00);

        doctor.displayDetails();
        nurse.displayDetails();
        admin.displayDetails();

        doctor.performDuties();
        nurse.performDuties();
        admin.performDuties();

        ((Doctor) doctor).prescribeMedication(); //cast -> schimba data type

        ((Nurse) nurse).checkVitals();

        ((Admin) admin).manageSchedule();

        // Metoda statica = metoda de clasa
        // Metoda non statica = metoda de instanta/obiect

        System.out.println("Total employees: " + Employee.getTotalEmployee());
        System.out.println("Average salary: " + Employee.getAverageSalary());

        System.out.println(doctor.getSalary());
        System.out.println(doctor.getSalary(0.25));

    }
}
