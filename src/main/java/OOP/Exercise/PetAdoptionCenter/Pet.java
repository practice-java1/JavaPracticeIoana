package main.java.OOP.Exercise.PetAdoptionCenter;

import java.util.List;

public class Pet {

    private String name;
    private int age;
    private String breed;
    private double weight;

    private static int petCounter = 0;


    public Pet(String name, int age, String breed, double weight) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.weight = weight;

        petCounter++;
    }

    public static int getPetCounter() {
        return petCounter;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Breed: " + breed);
    }

    public String getType() {
        return "...";
    }

    /*
    public int petsNumber(List<Pet> petList) {
        int catNumber = 0;
        int dogNumber = 0;

        for (Pet pet : petList) {
            if (pet.getType().equals("Cat")) {
                catNumber++;
            } else {
                dogNumber++;
            }
        }
        return catNumber + dogNumber;
    }
    */

}
