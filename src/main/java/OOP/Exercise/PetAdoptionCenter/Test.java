package main.java.OOP.Exercise.PetAdoptionCenter;

public class Test {
    public static void main(String[] args) {

        AdoptionCenter adoptionCenter = new AdoptionCenter();

        Cat cat1 = new Cat("Suzy", 3, "European", 4.5, true);
        Dog dog1 = new Dog("Mark",2, "Beagle",9.2, true );

        Cat cat2 = new Cat("Tom", 5, "British", 4.0, true );
        Dog dog2 = new Dog("Lily", 7, "Husky", 12.5, false);

        adoptionCenter.addPet(cat1);
        adoptionCenter.addPet(dog1);
        adoptionCenter.addPet(cat2);
        adoptionCenter.addPet(dog2);


        adoptionCenter.availablePets();

        System.out.println("Total number of animals: " + Pet.getPetCounter());






    }
}
