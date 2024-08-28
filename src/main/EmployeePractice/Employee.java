package main.EmployeePractice;

public class Employee {

    String name;
    String jobTitle;
    int age;
    int seniority;
    double salary;

    public Employee(String name, String jobTitle, int age, int seniority, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.age = age;
        this.seniority = seniority;
        this.salary = salary;
    }

    public int getSeniority() {
        return seniority;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", age=" + age +
                ", seniority=" + seniority +
                ", salary=" + salary +
                '}';
    }

}
