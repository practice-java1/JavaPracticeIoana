package main.OOP.Abstraction;

public abstract class Angajat {
    private int CNP;
    String nume;
    private double salariu;

    //Contructor
    public Angajat(int CNP, String nume, double salariu) {
        this.CNP = CNP;
        this.nume = nume;
        this.salariu = salariu;
    }

    public String getNume() {
        return nume;
    }

    public double getSalariu() {
        return salariu;
    }

    public abstract double calculSalariuAnual();
    public abstract String descriereRol();

    // admin (extend)
//    public String descriereRol(String text) {
//        return text;
//    }
}
