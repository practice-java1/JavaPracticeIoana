package main.java.OOP.Exercise.HospitalSystem;

public abstract class Employee {

    private int id;
    private String name;
    private double salary;

    private static int countEmployee = 0;
    private static double totalSalary = 0.0;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        countEmployee++;
        totalSalary += salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double getSalary(double performanceBonus) {
        return salary + (performanceBonus * salary);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Id: " + id + " Name: " + name + " Salary: " + salary);
    }

    public static int getTotalEmployee() {
        return countEmployee;
    }

    public static double getAverageSalary() {
        if (countEmployee == 0)
            return 0.0;
        return totalSalary / countEmployee;
    }



    public abstract void performDuties();

}
