package main.OOP.Polymorphism.Overloading;

public class Calculator {

    // Metodă care adună două numere întregi
    public int aduna(int a, int b) {
        return a + b;
    }

    // Metodă care adună trei numere întregi
    public int aduna(int a, int b, int c) {
        return a + b + c;
    }

    // Metodă care adună două numere în virgulă mobilă
    public double aduna(double a, double b) {
        return a + b;
    }

    // Metodă care adună un număr întreg și unul în virgulă mobilă
    public double aduna(int a, double b) {
        return a + b;
    }

    // Metodă care adună un număr în virgulă mobilă și unul întreg
    public double aduna(double a, int b) {
        return a + b;
    }
}


