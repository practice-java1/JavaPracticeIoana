package main.OOP.Abstraction.UniversityExample;

public abstract class Angajat {
    private int CNP;
    String nume;
    private double salariu;

    //Constructor
    public Angajat(int CNP, String nume, double salariu) {
        this.CNP = CNP;
        this.nume = nume;
        this.salariu = salariu;
    }

    // getters methods
    public String getNume() {
        return nume;
    }

    public double getSalariu() {
        return salariu;
    }

    public abstract double calculSalariuAnual();

    public abstract String descriereRol();
}
