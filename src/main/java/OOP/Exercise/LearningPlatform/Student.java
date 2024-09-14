package main.java.OOP.Exercise.LearningPlatform;

import java.util.Map;

public class Student extends Person {

    private int studentId;
    private Map<Course, Double> enrolledCourses;

    public Student(int userId, String name, String email, int studentId, Map<Course, Double> enrolledCourses) {
        super(userId, name, email);
        this.studentId = studentId;
        this.enrolledCourses = enrolledCourses;
    }

    public void receiveGrades(Course course, double grade){
        if(enrolledCourses.containsKey(course)){
            enrolledCourses.put(course, grade);
            System.out.println("The grade is: " + grade + " for course " + course.getCourseName());
        }
    }

    @Override
    public String getRole() {
        return "You are a student";
    }
}
