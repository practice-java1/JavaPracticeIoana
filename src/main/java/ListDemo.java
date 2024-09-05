package main.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        // create new list
        List<String> cities = new ArrayList<>();

        // List<String> cities1 = new LinkedList<>();
        // ArrayList<>
        // LinkedList<>

        // add values to the list
        System.out.println("The list is: " + cities);
        cities.add("Bacau");
        cities.add("Sibiu");
        cities.add("Buzau");
        cities.add("Mures");
        // allow duplicates
        cities.add("Bacau");

        System.out.println("The new list is: " + cities);

        // remove data from list
        cities.remove("Bacau");
        System.out.println("The list after remove is " + cities);

        // Get a specific value from the list - the first
        // cities[0] - arrays
        System.out.println("The first value is " + cities.get(0));

        // Delete the entire list
        // cities.clear();
        // System.out.println("The list after delete is " + cities);

        // Sorting a list
        Collections.sort(cities);
        System.out.println("The sorted list is " + cities);

        // Check the list and return only the Sibiu city foreach
        // equals (==)
        for (String city : cities) {
            if (city.equals("Sibiu")) {
                System.out.println("The city displayed is " + city);
            }
        }

        // Check the list and return only the cities that start with "B"
        // {Bacau, Sibiu, Buzau, Mures}

        for (String city1 : cities) {
            if (city1.startsWith("B")) {
                System.out.println("The city with 'B' is " + city1); // 2
            }else {
                System.out.println("The city " + city1 + " is not eligible!"); // 2 --> The city Mures is not eligible!
            }
        }

        // Add code is order to compare 2 ArrayLists
        List<Integer> age1 = new ArrayList<>();
        List<Integer> age2 = new ArrayList<>();

        age1.add(18);
        age1.add(27);
        age1.add(39);
        age1.add(50);

        age2.add(18);
        age2.add(27);
        age2.add(41);
        age2.add(59);


        // un array cu valorile care sunt identice in age1 / age2

        List<Integer> age3 = new ArrayList<>();

        for (int value : age1) {
            if (age2.contains(value)) {
                age3.add(value);
            }
            System.out.println("The age3 is " + age3);
        }
    }
}
