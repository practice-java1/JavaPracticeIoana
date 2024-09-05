package main.java.StaticDemo;

public class Student {
    /*
    --- !!! This class is created to demonstrate the static concept. ---

    Exercise:

    Create a class named StudentDemo with the following requirements:

    Static Variable: A static variable that keeps track of the total number of Student objects created.
    Static Variable: A static variable that stores the total sum of all students' grades.
    Constructor: A constructor that adds the student's grade to the total sum and increments the total number of students.
    Static Method: A static method that returns the total number of students.
    Static Method: A static method that returns the average grade of all students.
    Instance Method: An instance method that displays the grade of the student.

     */

    // Static variable to keep track of the total number of students
    private static int totalStudents = 0;

    // Static variable to keep track of the total sum of all students' grades
    private static double totalGradeSum = 0;

    // Instance variable for the student's grade
    private double grade;

    // Constructor
    public Student(double grade) {
        this.grade = grade;
        totalGradeSum += grade;
        totalStudents++;
    }

    // Static method to get the total number of students
    public static int getTotalStudents() {
        return totalStudents;
    }

    // Static method to get the average grade of all students
    public static double getAverageGrade() {
        if (totalStudents == 0) {
            return 0; // Prevent division by zero
        }
        return totalGradeSum / totalStudents;
    }

    // Instance method to display the student's grade
    public void displayGrade() {
        System.out.println("The student's grade is: " + grade);
    }

    public static void main(String[] args) {
        // Create a few student objects
        Student s1 = new Student(9.5);
        Student s2 = new Student(8.0);
        Student s3 = new Student(7.3);

        // Display total number of students and average grade
        System.out.println("The total number of students is: " + Student.getTotalStudents());
        System.out.println("The average grade of all students is: " + Student.getAverageGrade());

        // Display each student's grade
        s1.displayGrade();
        s2.displayGrade();
        s3.displayGrade();
    }
}
