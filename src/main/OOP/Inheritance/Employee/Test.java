package main.OOP.Inheritance.Employee;

import static main.OOP.Inheritance.Employee.Employee.salaryBiggerThan2000Euro;

public class Test {
    public static void main(String[] args) {

        // create a new employee object
        Employee emp1 = new Employee("Alina Dima", 1001, 1999.05);

        emp1.displayDetails();
        salaryBiggerThan2000Euro(emp1);

    }
}
