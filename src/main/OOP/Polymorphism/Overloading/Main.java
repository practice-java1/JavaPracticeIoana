package main.OOP.Polymorphism.Overloading;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Apelurile către metodele supraîncărcate
        System.out.println(calc.aduna(2, 3));          // Output: 5
        System.out.println(calc.aduna(2, 3, 4));       // Output: 9
        System.out.println(calc.aduna(2.5, 3.5));      // Output: 6.0
        System.out.println(calc.aduna(2, 3.5));        // Output: 5.5
        System.out.println(calc.aduna(2.5, 3));        // Output: 5.5
    }
}
