package main.java.OOP.Exercise.SchoolManagementSystem;

public class Test {
    public static void main(String[] args) {

        SchoolMembers student1 = new Student(1, "Popescu Maria", 19, 'A');
        SchoolMembers student2 = new Student(2, "Ionescu Marius", 24, 'E');

        SchoolMembers teacher = new Teacher(3, "Damian Stefan", 42, "Java Programming");
        SchoolMembers administrator = new Administrator(4, "Sima Iuliana", 35, "sima.iuliana@gmail.com");

        student1.displayDetails();
        student1.performActions();

        ((Student) student1).enrollCourse();
        ((Student) student2).enrollCourse();


        teacher.displayDetails();
        teacher.performActions();
        ((Teacher) teacher).handleCourses();


        administrator.displayDetails();
        administrator.performActions();

        ((Administrator) administrator).manageSchedules();

        System.out.println("The number of students enrolled is: " + Student.getNumberOfEnrolledStudents());
    }
}
