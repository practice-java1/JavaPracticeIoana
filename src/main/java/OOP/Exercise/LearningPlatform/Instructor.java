package main.java.OOP.Exercise.LearningPlatform;

import java.util.ArrayList;
import java.util.List;

public class Instructor extends Person {

    private int intructorId;
    private String department;
    private List<Course> courses;

    public Instructor(int userId, String name, String email, int intructorId, String department, List<Course> courses) {
        super(userId, name, email);
        this.intructorId = intructorId;
        this.department = department;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void assignGrades(Student student, Course course, double grade) {
        if (courses.contains(course)) {
            student.receiveGrades(course, grade);
        } else {
            System.out.println("You don't teach the course");
        }
    }


    @Override
    public String getRole() {
        return "You are an instructor";
    }
}
