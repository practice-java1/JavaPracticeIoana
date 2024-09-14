package main.java.OOP.Exercise.LearningPlatform;

import java.util.List;

public class Course {
    private int courseId;
    private String courseName;
    private int durationInWeeks;
    private Instructor instructor;
    private List<Student> enrolledStudents;

    public Course(int courseId, String courseName, int durationInWeeks, Instructor instructor, List<Student> enrolledStudents) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.durationInWeeks = durationInWeeks;
        this.instructor = instructor;
        this.enrolledStudents = enrolledStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void enrollStudents(Student student) {
        enrolledStudents.add(student);
    }

    public void viewEnrolledStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student currentStudent : enrolledStudents) {
            System.out.println(currentStudent.getName());
        }

    }
}
