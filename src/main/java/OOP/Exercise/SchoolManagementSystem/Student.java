package main.java.OOP.Exercise.SchoolManagementSystem;

public class Student extends SchoolMembers {
    private char grade;
    private static int getNumberOfEnrolledStudents = 0;

    public Student(int id, String name, int age, char grade) {
        super(id, name, age);
        this.grade = grade;
    }

    public char getGrade() {
        return grade;
    }

    public static int getNumberOfEnrolledStudents() {
        return getNumberOfEnrolledStudents;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    @Override
    public void displayDetails() {
        System.out.println("Student ");
        System.out.println("Id: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Grade: " + grade);
    }

    public void enrollCourse() {
        if (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D') {
            getNumberOfEnrolledStudents++;
            System.out.println("Congratulations, " + getName() + "! " + "You have successfully enrolled in the course. Get ready for an exciting learning journey!");
        } else {
            System.out.println("Sorry, " + getName() + "! " + "Unfortunately, you did not achieve the required passing grade and cannot enroll in the course at this time. Don't give up!");
        }
    }

    @Override
    public void performActions() {
        System.out.println("The student is reviewing the materials for the course.");
    }
}
