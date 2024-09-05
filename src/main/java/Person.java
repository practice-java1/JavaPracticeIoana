package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Person {

    // add attributes
    private String name;
    private int age;
    private String address;
    int startHour;
    int endHour;

    // constant
    private final static String TARA = "Romania";

    static int numberOfPersons = 0;

    public Person(String name, int age, String address, int startHour, int endHour) {
        this.name = name;
        this.age = age;
        // name = name din parameter = Ionel
        // age = 29
        this.address = address;
        this.startHour = startHour;
        // this.endHour = 17; // default
        this.endHour = endHour;

        numberOfPersons++;
    }

    // getters, setters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public int getStartHour(){
        return startHour;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", startHour=" + startHour +
                ", endHour=" + endHour +
                '}';
    }

    public String displayPersonDetails() {
        return name + ", " + age + ", " + address + ", " + startHour + ", " + endHour;
    }

    public static int getNumberOfPersons() {
        return numberOfPersons;
    }

    public static void main(String[] args) {
        // create an object with type Person -> Person1
        // String person1 = "Ionel";

        Person person1 = new Person("Ioana Dima", 29, "Nicolina", 9, 17); // Ioana Adam
        Person person2 = new Person("Alex Matei", 17, "Podu Ros", 8, 16);

        List<Person> persons = new ArrayList<>(); // empty
        persons.add(person1);
        persons.add(person2);

        List<Integer> ages = new ArrayList<>();
        ages.add(15);
        ages.add(40);
        System.out.println("The completed list is: " + Arrays.toString(new List[]{persons}));

        for (Person theCurrentPerson : persons)
        {
            if (theCurrentPerson.getAge() >= 18) {
                System.out.println("The contact is full-time for: " + theCurrentPerson.getName());
            }else {
                System.out.println("The contract is part-time for: " + theCurrentPerson.getName());
            }
        }

        for (Person personWithSpecificAddress : persons) {
            if (personWithSpecificAddress.getAddress().equals("Nicolina")) {
                System.out.println("Perfect match with the address: " + personWithSpecificAddress.getName());
            }
        }
        System.out.println("Info: " + person1.displayPersonDetails());

        // person1.setName("Ioana Adam");

        // get the final number of persons
        System.out.println("The final number is: " + getNumberOfPersons());

        detailsAboutPersonStartWorkAtEight(persons);

        System.out.println("Print the details from the list: " + persons);
    }

    public static void detailsAboutPersonStartWorkAtEight(List<Person> personList) {
        for (Person currentPerson : personList) {
            // primitive ==
            // non-primitive -> equals
            if (currentPerson.getStartHour() == 8) {
                System.out.println("BONUS!! " + currentPerson.getName());
            }
        }
    }


    /* 1. Add a method that retrieves the number of hours worked for each person. Offer a bonus
    for people that are working 8 hours per day.

    /* 2. Create a list of colors with the following values: White, Red, Black, Pink, Blue.
          From that list extract only the values white and black and store these values in a new list.
          Print also the size of the new list.

          --- teorie despre constructor -> https://www.w3schools.com/java/java_constructors.asp
          --- tutorial despre constructor in Java -> https://www.youtube.com/watch?v=pgBk8HC7jbU
     */
 }

