package main.java.OOP.Polymorphism.Overriding;

public class Main {
    public static void main(String[] args) {
        Animal meuAnimal = new Animal();  // Creează un obiect Animal
        Animal caineleMeu = new Caine();  // Creează un obiect Caine
        Animal pisicaMea = new Pisica();  // Creează un obiect Pisica

        meuAnimal.sunet();  // Output: Animalul face un sunet.
        caineleMeu.sunet();  // Output: Câinele latră.
        pisicaMea.sunet();  // Output: Pisica miaună.
    }
}
