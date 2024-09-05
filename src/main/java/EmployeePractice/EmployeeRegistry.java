package main.java.EmployeePractice;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRegistry {

    public static List<Double> raiseSalary(List<Employee> employeeList, int percentage) {
        double newSalary = 0.00;
        List<Double> newSalaries = new ArrayList<>();
        
        for (Employee currentEmployee : employeeList) {
            newSalary += currentEmployee.getSalary() + currentEmployee.getSalary() * percentage / 100;
            newSalaries.add(newSalary);
        }
        return newSalaries;
    }

    public static List<Employee> getEligibleForRetirement(List<Employee> employees, int retirementAge) {
        List<Employee> eligibleEmployees = new ArrayList<>();
        for (Employee emp : employees) {
            if (emp.getAge() > retirementAge) {
                eligibleEmployees.add(emp);
            }
        }
        return eligibleEmployees;
    }

    public static String compareSalary(Employee employee1, Employee employee2) {
        if (employee1.salary > employee2.getSalary()) {
            return employee1.name + " earns more than " + employee2.getName() + ".";
        } else if (employee1.salary < employee2.getSalary()) {
            return employee1.salary + " earns less than " + employee2.getName() + ".";
        } else {
            return employee1.name + " and " + employee2.getName() + " have the same salary.";
        }
    }

    public static String compareSalarySwitch(Employee emp1, Employee emp2) {
        int comparison = Double.compare(emp1.salary, emp2.getSalary());

        String result;

        switch (comparison) {
            case 1: // emp1.salary > emp2.salary
                result = emp1.name + " earns more than " + emp2.getName() + ".";
                break;
            case -1: // emp1.salary < emp2.salary
                result = emp1.name + " earns less than " + emp2.getName() + ".";
                break;
            case 0: // emp1.salary == emp2.salary
                result = emp1.name + " and " + emp2.getName() + " have the same salary.";
                break;
            default:
                result = "Error comparing salaries.";
                break;
        }
        return result;
    }


    public static double calculateTotalEarnings(Employee currentEmployee) {
      return currentEmployee.getSalary() * currentEmployee.getSeniority();
    }
}
