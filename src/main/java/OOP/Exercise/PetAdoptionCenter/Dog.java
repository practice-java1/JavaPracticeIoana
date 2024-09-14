package main.java.OOP.Exercise.PetAdoptionCenter;

public class Dog extends Pet {

    boolean isTrained;

    public Dog(String name, int age, String breed, double weight, boolean isTrained) {
        super(name, age, breed, weight);
        this.isTrained = isTrained;
    }

    public boolean isTrained() {
        return isTrained;
    }

    public void setTrained(boolean trained) {
        isTrained = trained;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        if (isTrained == true){
            System.out.println("Trained: Yes");
        } else {
            System.out.println("Trained: No");
        }
    }

    @Override
    public String getType() {
        return "Dog";
    }
}
