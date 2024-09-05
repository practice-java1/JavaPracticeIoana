package main.java;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {

        Set<String> cities = new HashSet<>();
        // LinkedHashSet - preserve the insertion order
        // TreeSet - ascending order A-Z, 1-10000
        cities.add("Bacau");
        cities.add("Iasi");
        cities.add("Arad");
        cities.add("Braila");

        System.out.println("The set of cities is: " + cities);
        // add duplicates - are not allowed
        cities.add("Arad");

        System.out.println("The set with duplicates is: " + cities);

        HashSet<Object> personalInfo = new HashSet<>();
        personalInfo.add(32); // age
        personalInfo.add("Alina Dima"); // name
        personalInfo.add("G");
        personalInfo.add(1900.80);
        personalInfo.add(false);

        for (Object value : personalInfo) {
            System.out.println(value);
        }
    }
}

