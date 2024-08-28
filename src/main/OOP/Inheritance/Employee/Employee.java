package main.OOP.Inheritance.Employee;

public class Employee {
    private String name;
    private int employeeId;
    private double salary;

    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    // check for each employee if the salary is >= that 2000 euro, return a message
    public static void salaryBiggerThan2000Euro(Employee employee) {
        if (employee.getSalary() >= 2000) {
            System.out.println("The salary is bigger than 2000 euro!");
        } else {
            System.out.println("The salary is not bigger than 2000 euro!");
        }
    }

    public void displayDetails() {
        System.out.println("The employee with name: " + name + " with id: " + employeeId + " has salary equal with " + salary + " euro.");
    }
}
