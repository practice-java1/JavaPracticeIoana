package main.EmployeePractice;

import java.util.Arrays;
import java.util.List;

import static main.EmployeePractice.EmployeeRegistry.*;

public class Test {

    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(new Employee("Alina", "Testare", 35, 5, 2500.45),
                new Employee("Dan", "BE", 29, 2, 1500.99));


        System.out.println("The new salary is: " + raiseSalary(employeeList, 15));

        System.out.println("Retirement: " + getEligibleForRetirement(employeeList, 62));

        System.out.println("compare salary: " + compareSalary(employeeList.get(0), employeeList.get(1)));

        System.out.println("Total earnings: " + calculateTotalEarnings(employeeList.get(0)));

        System.out.println(compareSalarySwitch(employeeList.get(0), employeeList.get(1)));
    }
}
