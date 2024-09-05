package main.java.OOP.Abstraction.ShapeExample;


// Clasă concretă care implementează metoda abstractă
public class Circle extends Shape {

    private double raza;

    public Circle(double raza) {
        this.raza = raza;
    }

    @Override
    public double arie() {
        return 3.14 * raza * raza;
    }

    /*
    Explicație: În exemplul de mai sus, clasa abstractă Forma definește metoda arie()
    fără a oferi o implementare, lăsând această responsabilitate claselor care o extind (Cerc, Patrat).
    Astfel, fiecare formă își implementează propria logică pentru calcularea ariei.
     */
}

