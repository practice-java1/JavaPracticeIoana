package main.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {

        public static void main(String[] args) {
            // Create a HashMap - no order, random
            //  keys     values
            Map<String, Integer> ageMap = new HashMap<>();

            // LinkedHashMap - maintains insertion order
            // TreeMap - the elements are sorted asc by the keys

            // Add entries
            ageMap.put("Emp100", 30);
            ageMap.put("Emp101", 25);
            ageMap.put("Emp102", 35);

            // Retrieve a value
            int ageOfAlice = ageMap.get("Emp100");
            System.out.println("Emp100's age: " + ageOfAlice);

            // Check if a key exists
            // ageMap.containsValue(30);

            if (ageMap.containsKey("Emp101")) {
                System.out.println("Emp100 is in the map.");
            }

            // Remove an entry
            ageMap.remove("Emp102");

            // Iterate over the map
            List<String> names = new ArrayList<>();
            names.add("Maria");
            names.add("Diana");

            for(String currentName : names) {
                if(currentName.equals("Maria")) {
                    System.out.println("Here is " + currentName);
                }
            }

            // Map<String, Integer> ageMap = new HashMap<>();


            for (Map.Entry<String, Integer> entry : ageMap.entrySet()) { // emp100, emp101 . 30, 45
                System.out.println(entry.getKey() + " is " + entry.getValue() + " years old.");
            }
        }
    }
