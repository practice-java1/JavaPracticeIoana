package main.java.OOP.Exercise.SchoolManagementSystem;
public class Teacher extends SchoolMembers {
    private String courseName;

    public Teacher(int id, String name, int age, String courseName) {
        super(id, name, age);
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void handleCourses() {
        System.out.println("Teacher: " + getName() + " leads the " + courseName + " course.");
    }

    @Override
    public void performActions() {
        System.out.println("Teacher " + getName() + " encourages students to ask questions and stay curious.");
    }
}
