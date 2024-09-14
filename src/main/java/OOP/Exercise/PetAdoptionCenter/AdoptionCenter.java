package main.java.OOP.Exercise.PetAdoptionCenter;

import java.util.ArrayList;
import java.util.List;

public class AdoptionCenter {

    List<Pet> petList = new ArrayList<>();

    //Method to add a pet to the adoption list

    public void addPet(Pet pet) {
        petList.add(pet);
    }

    //Method to display all available pets

    public void availablePets() {
        System.out.println("Pets available for adoption:");
        for (Pet pet : petList) {
            pet.displayInfo();
            System.out.println();
        }
    }


}
