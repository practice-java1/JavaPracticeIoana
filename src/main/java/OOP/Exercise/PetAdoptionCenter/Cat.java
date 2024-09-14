package main.java.OOP.Exercise.PetAdoptionCenter;

public class Cat extends Pet {


    private boolean isIndoor;

    public Cat(String name, int age, String breed, double weight, boolean isIndoor) {
        super(name, age, breed,weight);
        this.isIndoor = isIndoor;
    }

    public boolean isIndoor() {
        return isIndoor;
    }

    public void setIndoor(boolean indoor) {
        isIndoor = indoor;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        if (isIndoor == true){
            System.out.println("Indoor: Yes");
        } else {
            System.out.println("Indoor: No");
        }
    }

    @Override
    public String getType() {
        return "Cat";
    }
}
