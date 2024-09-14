package main.java.OOP.Exercise.SchoolManagementSystem;

public class Administrator extends SchoolMembers {

    private String email;

    public Administrator(int id, String name, int age, String email) {
        super(id, name, age);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void manageSchedules() {
        System.out.println("Administrator " + getName() + " with email " + email + " is reviewing and updating the schedule for upcoming classes.");
    }

    @Override
    public void performActions() {
        System.out.println("Administrator " + getName() + " is organizing a meeting with the school staff.");
    }
}
