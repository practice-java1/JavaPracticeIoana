package main.java.OOP.Exercise.LearningPlatform;

public abstract class Person {
    private int userId;
    private String name;
    private String email;

    public Person(int userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public abstract String getRole();

}
