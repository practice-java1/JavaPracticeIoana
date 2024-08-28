package main.OOP.Encapsulation;

public class BankAccount {

    /*
    Definiție: Encapsularea este procesul de ascundere a detaliilor de implementare ale unui obiect și expunerea doar a
    funcționalităților esențiale. Acest principiu protejează datele unui obiect prin limitarea accesului direct la ele,
    oferind în schimb metode publice pentru a le accesa și modifica.

    Exemplu: Imaginați-vă o clasă ContBancar care are un atribut privat sold. Pentru a modifica sau accesa valoarea acestui
    sold, se folosesc metode precum Depunere() și Retragere().
     */
    // Atributul 'sold' este privat, ceea ce înseamnă că nu poate fi accesat direct din exterior.
    private double sold; // encapsulation
    public String nameClient;
    public String bankName;

    // Metodă publică pentru a adăuga o sumă la sold
    public void depunere(double suma) {
        sold += suma;
    }

    // Metodă publică pentru a retrage o sumă din sold
    public void retragere(double suma) {
        if (suma <= sold) {
            sold -= suma;
        }
    }

    // Metodă publică pentru a obține valoarea soldului
    public double getSold() {
        return sold;
    }

    /*
    Explicație: Prin folosirea encapsulării, ne asigurăm că datele unui obiect
    nu sunt accesate sau modificate într-un mod necontrolat. În exemplu, sold
    este protejat de accesul direct, iar interacțiunea cu el
    se face doar prin metodele definite (depunere, retragere, getSold).
     */
}
